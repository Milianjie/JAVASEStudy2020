package q�߳���ҵ;

public class ThreadWork {
	
	public static void main(String[] args) {
		
		Num num = new Num(0);
		
		Thread thread1 = new OddThread(num);
		Thread thread2 = new EvenThread(num);
		
		thread1.setName("��������߳�");
		thread2.setName("���ż���߳�");
		
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
		// TODO �Զ����ɵķ������
		while (true) {
			
			synchronized (num) {
				if ((num.i%2) == 0) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
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
		// TODO �Զ����ɵķ������
		while (true) {
			
			synchronized (num) {
				if ((num.i%2) != 0) {
					try {
						num.wait();
					} catch (InterruptedException e) {
						// TODO �Զ����ɵ� catch ��
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
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