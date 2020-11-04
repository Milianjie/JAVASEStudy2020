package jsynchronized理解;

/*
 * 这是一个账户类，有私有的账户和余额，还有 一个取款的方法
 * 	线程同步机制，多线程对该账户进行取款，不会出现线程安全问题
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
	//如果实例方法上使用synchronized，是可以的。
	//但是这种情况下，一定会是在this对象上找对象锁，无法改变，不能是其他对象，这种方式不灵活
	//还有一个缺点就是这样会让整个方法体都需要同步，可能无故扩大同步的范围，使程序执行效率降低，不常用
	//优点是代码写的少了，节俭。如果共享的对象就是this，而且同步的是整个方法体，建议这样使用。如StringBuffer类，Vector集合类，Hashtable类中的方法
	public synchronized void getMoney(double money) {
		
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
