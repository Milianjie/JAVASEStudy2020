package i同步线程对账户取款;

/*
 * 这是一个银行账户类，有私有的账户和余额，还有 一个取款的方法
 * 	这里使用线程同步机制，多线程对该账户进行取款，不会会出现线程安全问题
 * 【重点】一个线程调用取款方法时，需要让getMoney方法中的代码全部执行完毕才能让另一个线程调用，具体方法如下
 */

public class Account {
	
	//银行卡账号
	private String actno;
	
	//余额
	private double balance;

	public Account() {
		super();
	}
	

	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [actno=" + actno + ", balance=" + balance + "]";
	}


	public String getActno() {
		return actno;
	}


	public void setActno(String actno) {
		this.actno = actno;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalanc(double balance) {
		this.balance = balance;
	}
	
	/**
	 * 这是一个取款的方法
	 * @param money	取款金额
	 */
	public void getMoney(double money) {
		
		/*
		 * 为了让其线程安全，下面的代码必须要让线程排队，不能并发
		 * 一个线程把下面几行代码执行结束后，另一个线程才能进来
		 * 【语法】
		 * 				synchronize(){
		 * 
		 * 				线程同步代码块
		 * 
		 * 			}
		 * 		synchronized()小括号中的数据非常关键
		 * 		这个数据是多线程共享的数据，才能让这些线程排队，达到同步线程
		 * 	如：
		 * 		线程t1、t2、t3、t4、t5有五个线程，现在想让t1、t2、t3线程同步，希望它们排队
		 * 		而t4、t5线程不需要。
		 * 		此时小括号中就要填一个t1、t2、t3线程共享的对象，并且其对于t4、t5线程不是共享
		 * 	就比如每个线程都会调用一个账户类中的取款方法，该方法是成员方法需要new一个账户对象才能调用
		 * 	1、此时有几个线程都用这一个账户对象调用取款方法，如果小括号中填this，
		 * 	这几个线程各自执行时碰到synchronized关键字往小括号中的对象找锁，this代表的是调用该方法的当前对象
		 * 	而线程们用的都是同一个对象，它们就会找同一个对象的对象锁，这样就实现了对象共享，以及谁先拿到让其他线程等待。
		 * 
		 * 	2、当然如果账户类new了一个成员的其他对象，那么这个账户对象中的成员对象也是唯一的也可以填入小括号中，
		 * 	这样做共享的效果与上面是一样的
		 * 
		 * 	3、但是取款方法中new出来的不行，因为这样的对象是局部变量，每个线程执行都会new一个，这样就不会找同一个对象的对象锁了
		 * 
		 * 	4、直接写出来的字符串"abc"对象,因为其在字符串常量池中，永远只有一个引用指向它，所以也可以放进小括号中
		 * 	但是效果是所有线程是同步的，比如一个线程用的是new出来的另一个账户对象，这个线程也会跟用前面的账户对象的线程一起抢一把对象
		 * 	锁，所有同步了
		 * 
		 * 	5、还有就是不能放null，会空指针异常，不是对象，没有锁
		 * 
		 * 	这里共享的是一个银行账户，Account类对象，即方法中的this
		 * 
		 * 在Java语言中，每个java对象都有一把对象锁，这把锁只是一个标记。
		 * 一个对象一把锁，100个对象就有100把
		 * 
		 * 【线程同步原理】以下面代码为例，线程t1和t2都要对同一个账户对象进行操作，假设t1稍微快一点
		 * 	遇见synchronized关键字，此时t1就会寻找小括号中共享对象的对象锁，线程t1放弃当前占有的CPU时间片，
		 * 	由运行状态进入锁池状态（lockpool），寻找对象锁，找到后并占有它，然后开始执行synchronized语句块中的代码，
		 * 	t2线程落后t1遇见synchronized关键字，t2线程也由运行状态进入锁池状态（lockpool），寻找共享对象的对象锁，
		 * 	发现这个锁已经被t1占有了，然后它在该状态排队等待（或者说找不到对象锁，一直在锁池状态下寻找对象锁，直到t1线程执行完后归还对象锁），
		 * 	等t1线程执行完后归还对象锁，t2找到它然后占有它，此时进入就绪状态抢夺执行权，抢到后执行同步代码块中的代码
		 * 	可以理解成那是一种阻塞状态
		 * 
		 */
		synchronized (this) {
			//取之前的余额
			double before = this.balance;
			
			//取钱后的余额
			double after = before - money;
			
			//在这里让线程睡眠一秒的话，就一定会出现线程安全问题,否者可能出现问题
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
					
			//更新余额。将余额传给账户,如果当前线程还没有执行下面代码，另一个异步线程开始调用该取款方法，就会出错
			this.balance = after;
			
		}
		
		
	}
	
	

}
