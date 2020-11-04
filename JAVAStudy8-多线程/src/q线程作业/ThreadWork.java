package q线程作业;

public class ThreadWork {
	
	public static void main(String[] args) {
		
		Num num = new Num(0);
		
		Thread thread1 = new OddThread(num);
		Thread thread2 = new EvenThread(num);
		
		thread1.setName("输出奇数线程");
		thread2.setName("输出偶数线程");
		
		thread1.start();
		thread2.start();
		
	}

}

class OddThread extends Thread{
	
	Num num;
	
	public OddThread(Num num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			
			synchronized (num) {
				if ((num.i%2) == 0) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->"+num.i);
				num.i++;
				num.notify();
			}
			
		}
	}
	
}

class EvenThread extends Thread{
	
	Num num;
	
	public EvenThread(Num num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			
			synchronized (num) {
				if ((num.i%2) != 0) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->"+num.i);
				num.i++;
				num.notify();
			}
			
		}
		
	}
	
}

class Num{
	
	int i;

	public Num() {
		super();
	}



	public Num(int i) {
		super();
		this.i = i;
	}
	
	
	
}