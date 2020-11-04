package h模拟两个异步线程对一个账户取款;

/*
 * 这是一个账户类，有私有的账户和余额，还有 一个取款的方法
 * 	这里不使用线程同步机制，多线程对该账户进行取款，会出现线程安全问题
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
		
		//取之前的余额
		double before = this.balance;
		
		//取钱后的余额
		double after = before - money;
		
		//在这里让线程睡眠一秒的话，就一定会出现线程安全问题,否者可能出现问题
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
				
		//更新余额。将余额传给账户,如果当前线程还没有执行下面代码，另一个异步线程开始调用该取款方法，就会出错
		this.balance = after;
		
		
	}
	
	

}
