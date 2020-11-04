package h模拟两个异步线程对一个账户取款;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account = new Account("2816689558551555522", 10000);
		
		Thread thread1 = new MyAccount(account,5000);
		Thread thread2 = new MyAccount(account,5000);
		
		thread1.setName("t1");
		thread2.setName("t2");
		
		thread1.start();
		thread2.start();
		
	}

}
