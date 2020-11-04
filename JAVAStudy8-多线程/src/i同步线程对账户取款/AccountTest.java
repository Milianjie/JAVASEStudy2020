package i同步线程对账户取款;

public class AccountTest {
	
	public static void main(String[] args) {
		
		Account account = new Account("2816689558551555522", 15000);
		
		Thread thread1 = new MyAccount(account,5000);
		Thread thread2 = new MyAccount(account,5000);
		Thread thread3 = new MyAccount2(account,5000);
		
		thread1.setName("t1");
		thread2.setName("t2");
		thread3.setName("tt1");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
