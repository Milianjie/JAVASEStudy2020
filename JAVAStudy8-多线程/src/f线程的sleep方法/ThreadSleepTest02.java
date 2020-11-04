package f�̵߳�sleep����;

/*
 * ����λ���һ������˯�ߵ��̣߳�ǿ����ֹ˯�ߡ�
 */

public class ThreadSleepTest02 {
	
	public static void main(String[] args) {
		
		MyThread02 myThread02 = new MyThread02();
		
		Thread thread = new Thread(myThread02);
		
		thread.setName("t1");
		
		thread.start();
		
		//ϣ����5�����ֹ�߳�t1��˯��,�˴������߳�˯��5�룬ִ����ֹt1�߳����ߵķ���
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		thread.interrupt();//ͨ���÷�����ʹ�ø��̶߳����е�˯����䱨�쳣��ִ��catch����Ӷ�����try/catch���顣ʹ���̸߳���������Ĵ������ִ��
		//����̨�������Ϣ
		/*
			t1�߳�-->��ʼ����
			java.lang.InterruptedException: sleep interrupted
			t1�߳�-->����
			at java.lang.Thread.sleep(Native Method)
			at f�̵߳�sleep����.MyThread02.run(ThreadSleepTest02.java:46)
			at java.lang.Thread.run(Unknown Source)
			
			
		 */
		
	}

}

class MyThread02 implements Runnable{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
		System.out.println(Thread.currentThread().getName()+"�߳�-->��ʼ����");
		
		try {					//���ڸ�run��������д�ģ������е�run����û���׳��쳣�����Դ˴�ֻ��try/catch���쳣���������쳣
			//��������д�ķ������ܱȱ���д�ķ����׳��������쳣
			Thread.sleep(1000*60*60*24*360);//�ø��߳�˯��һ��
		
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();//�����ϣ����ֹ�߳�����쳣��Ϣ�����԰Ѵ˾�ɾ��
		}
		
		
		System.out.println(Thread.currentThread().getName()+"�߳�-->����");
	}
	
}