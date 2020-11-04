package p用wait和notify方法实现生产者和消费者模式;

import java.util.ArrayList;
import java.util.List;

/*
 * 利用wait和notify方法实现生产者和消费者模式：
 * 	1、【什么是生产者和消费者模式】
 * 		生产线程负责生产，消费线程负责消费
 * 		其中生产和消费线程之间要实现均衡
 * 		这是一种特殊的业务需求，这种需求要使用到对象的wait和notify方法
 * 
 * 	2、wait和notify方法不是线程对象的方法，是每个java对象都有的方法
 * 
 * 	3、wait和notify方法是建立在线程同步的基础上。多线程要操作同一个仓库，有线程安全问题
 * 
 * 	4、【wait方法作用】o.wait()使活动在o对象上的线程t进入永久等待状态，并且将t线程所占有的o对象锁进行归还，然后不再寻找占有对象锁
 * 
 * 	5、【notify方法作用】o.notify()使在o对象上等待的所有线程（这里是t线程和当前线程）唤醒（所有是重点），让等待的t线程开始
 * 						寻找o对象的锁占有其然后运行线程，该方法不会释放当前线程所占有的o对象的锁，所以在唤醒所有在o对象
 * 						上等待的（t）线程后，当前线程继续运行，直到遇到某个条件线程执行了wait方法，然后当前线程开始等待
 * 						并且释放o对象的锁，使得t线程找到o对象锁，开始执行线程中的代码。
 * 	
 * 	7、模拟一个需求：
 * 		用List集合作为仓库
 * 		假设List集合中只能存储一个元素
 * 		一个元素就表示仓库满了
 * 		当List中元素个数为0就表示仓库空了
 * 		保证仓库List中的存储的元素最多只能存一个
 * 
 * 		利用一个线程生产一个线程消费达到这种效果
 * 
 * 【代码原理分析】假设生产线程先锁定了list对象锁，开始运行同步语句块代码；执行if语句，判断集合list，此时集合元素为0
 * 				执行条件外的语句：创建对象，并且将该对象添加进集合；然后执行notify方法，唤醒在list集合对象
 * 				上等待的线程（当然现在没有，消费线程现在也是醒的，还在卡在同步语句块外面苦苦寻找list对象的锁呢）。因为notify
 * 				方法是不释放锁的，所以方法继续循环：判断list集合，此时就满足条件，执行里面的wait方法，生产线程
 * 				进入等待，归还list集合对象的锁。此时消费线程拿到锁开始执行同步语句块中的代码：判断list集合是否为0，现在
 * 				当然不是，执行条件外的语句，删除第一个元素（0小标），唤醒在list集合对象上等待的所有线程（这里只有当前和生产线程），
 * 				此时生产线程可以占有锁了，但是锁还在消费线程上，消费线程继续执行：开始循环，判断集合list，为0，执行wait方法，当前线程
 * 				进入等待，释放list集合对象的锁。生产线程拿到....;反复循环
 * 				生产一个消费一个
 * 
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		Thread thread1 = new Producter(list);
		Thread thread2 = new Consumer(list);
		
		thread1.setName("生产线程");
		thread2.setName("消费线程");
		
		thread1.start();
		thread2.start();
	}

}

//生产线程
class Producter extends Thread{
	
	//共享的仓库
	List list;
	
	
	
	public Producter() {
		super();
	}



	public Producter(List list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		//一直生产，用死循环模拟
		while (true) {
			// 为了让两个线程只有一个先判断集合中的元素个数，从而让某个线程先进入等待状态
			//不能让两个线程一起判断，再让一个线程锁住集合对象，不然根据两个线程中的判断语句
			//就会一起进入等待状态，从而出现线程安全问题，这里synchronized应该如下：
			synchronized (list) {
				if (list.size()>0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				
				Object object = new Object();
				list.add(object);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"生产对象-->"+object);
				
				//唤醒在list集合对象上等待的线程，包括当前线程
				list.notify();
			}
		}
		
		
	}
	
}

//生产线程
class Consumer extends Thread{
	
	//共享的仓库
	List list;
	
	
	
	public Consumer() {
		super();
	}



	public Consumer(List list) {
		super();
		this.list = list;
	}



	@Override
	public void run() {
		
		while (true) {
			// 为了让两个线程只有一个先判断集合中的元素个数，从而让某个线程先进入等待状态
			//不能让两个线程一起判断，再让一个线程锁住集合对象，不然根据两个线程中的判断语句
			//就会一起进入等待状态，从而出现线程安全问题，这里synchronized应该如下：
			synchronized (list) {
				if (list.size() == 0) {
					try {
						list.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				
				Object object = list.remove(0);//该方法返回的是被删除的元素对象
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"消费对象-->"+object);
				
				//唤醒在list集合对象上等待的线程，包括当前线程
				list.notify();
			}
		}
		
		
	}
	
}