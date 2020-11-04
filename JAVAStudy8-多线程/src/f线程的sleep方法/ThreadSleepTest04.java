package f�̵߳�sleep����;

/*
 * 	����������ֹ�̵߳����С�
 * 		��ʵ��Runnable�ӿڵĿ��������У�ʵ���̳߳��ã����߼̳�Thread����߳����д�һ����������ֶ�
 * 		�磺boolean run = true;
 * 		Ȼ�󹹽�������䣬��run=trueʱִ���̣߳���run=false��ֹ�߳�ִ�У��������³�����ʾ
 */

public class ThreadSleepTest04 {
	
	public static void main(String[] args) {
		
		//Ϊ�˿��ƿ��������еĲ�������ֶΣ���Ҫ�ϲ����룬�����������浽һ�����ñ����з���ı�run�ֶε�ֵ
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		
		thread.setName("�߳���ֹ����");
		
		thread.start();
		
		//����10�����ֹ�̵߳�ִ��
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//10���ѹ�����ֹ�߳�����
		System.out.println("10���ѹ����߳�'�߳���ֹ����'��ֹ����");
		myRunnable.run = false;
		
	}

}

class MyRunnable implements Runnable{
	
	//��������ֶ�
	boolean run = true;
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<100;i++) {
			if (run) {
				System.out.println(Thread.currentThread().getName()+"�̣߳�"+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			} else {
				//��ֹ��ǰ�߳�ִ��
				return;
			}
		}
	}
	
}