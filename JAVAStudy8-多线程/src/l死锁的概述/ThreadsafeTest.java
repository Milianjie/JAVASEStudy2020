package l�����ĸ���;

/*
 * ���̳߳���������ͬ�����̲߳���ʱ������߳�����ĳ������ʱ��Ҫ����������
 * 				��������������������������synchronized�ؼ���Ƕ�����Σ�����������
 * 				���������������б��߳���ס��˳���෴����һ���߳����������������һ���߳�
 * 				������һ�����������и��ʳ�������������������£�
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
		// TODO �Զ����ɵķ������
		synchronized (o1) {		//synchronized�ؼ���Ƕ�ף�ʹ����Ҫִ���������ͬ��������ܹ黹o1��������Ƕ���е�o2���޷��ҵ����ͻ��������
						//������˯������һ�����������
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
		// TODO �Զ����ɵķ������
		synchronized (o2) {//synchronized�ؼ���Ƕ�ף��߳�2ʹ����Ҫִ���������ͬ��������ܹ黹o2��������Ƕ���е�o1���߳�1ռ�У��޷��ҵ���
					//�����߳�1���߳�2�໥����һ�������ͻ��������
			//������˯������һ�����������
			synchronized (o1) {
				
			}
			
		}
	}
	
}