package m�ػ��̵߳�ʵ��;

/*
 * ���ػ��̡߳�java�������̷߳�Ϊ�����ࣺ�û��̺߳��ػ��߳�
 * 		�û��̣߳������Եľ���main���߳�
 * 		�ػ��̣߳������Եľ������������̣߳�Ҳ���ػ��߳��Ǻ�̨�߳�
 * 		�ػ��̵߳��ص���һ����ѭ����ֻ�е����е��û��߳̽����ˣ��ػ��̲߳��Զ�����
 * 		һ������ÿ������Զ��������ݣ���ʱ��һ����ʱ������Ϊ�ػ��̡߳�����߳�һֱ�������ݣ�һ�����Ϳ�ʼ����
 */
//ʵ���ػ��߳�
public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread thread = new MyThread();
		
		thread.setName("���ݱ����߳�");
		
		System.out.println(thread.isDaemon());//false --��ʱ�����ػ��߳�
		//������ִ���̶߳����isDeamon()�������ø��̱߳�Ϊ�ػ��̣߳�ʹ��������������û��̵߳Ľ���������ѭ��
		thread.setDaemon(true);
		System.out.println(thread.isDaemon());//true
		
		//�����߳�
		thread.start();
		
		//���߳�һ��forѭ��
		for(int i = 1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}

}

class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		int i = 0;
		//�������ó���ѭ��
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+(++i));
		}
	}
	
}