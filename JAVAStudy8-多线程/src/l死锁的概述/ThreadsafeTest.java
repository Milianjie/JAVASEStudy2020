package l死锁的概述;

/*
 * 【线程出现死锁】同步多线程并发时，如果线程运行某个方法时需要锁两个对象，
 * 				而这里有两个方法和两个对象被synchronized关键字嵌套修饰，并且这两个
 * 				对象在两个方法中被线程锁住的顺序相反，当一个线程运行这个方法，另一个线程
 * 				运行另一个方法，会有概率出现死锁情况。具体如下：
 */

public class ThreadsafeTest {
	
	public static void main(String[] args) {
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread mThread1 = new MyThread1(o1, o2);
		Thread mThread2 = new MyThread1(o1, o2);
		
		mThread1.start();
		mThread2.start();
		
	}

}

class MyThread1 extends Thread{
	
	Object o1;
	Object o2;
	
	
	
	public MyThread1() {
		super();
	}


	public MyThread1(Object o1, Object o2) {
		super();
		this.o1 = o1;
		this.o2 = o2;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (o1) {		//synchronized关键字嵌套，使得需要执行完里面的同步语句块才能归还o1的锁，而嵌套中的o2锁无法找到，就会出现死锁
						//在这里睡眠以下一定会出现死锁
			synchronized (o2) {
				
			}
			
		}
	}
	
}
class MyThread2 extends Thread{
	
	Object o1;
	Object o2;
	
	
	
	public MyThread2() {
		super();
	}


	public MyThread2(Object o1, Object o2) {
		super();
		this.o1 = o1;
		this.o2 = o2;
	}
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		synchronized (o2) {//synchronized关键字嵌套，线程2使得需要执行完里面的同步语句块才能归还o2的锁，而嵌套中的o1锁线程1占有，无法找到，
					//这样线程1与线程2相互卡着一个锁，就会出现死锁
			//在这里睡眠以下一定会出现死锁
			synchronized (o1) {
				
			}
			
		}
	}
	
}