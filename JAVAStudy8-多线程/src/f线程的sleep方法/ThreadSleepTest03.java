package f�̵߳�sleep����;

/*
 * 	��ǿ����ֹ�̵߳�ִ�С�
 */

public class ThreadSleepTest03 {
	
	public static void main(String[] args) {
		
		//����ʵ��Runnable�ӿڵĿ����ж���
		MyThread03 myThread03 =new MyThread03();
		
		//�������ж����װ���̶߳���
		Thread thread = new Thread(myThread03);
		
		//���̶߳�������
		thread.setName("t2");
		
		//�����߳�
		thread.start();
		
		//10�����ֹt2�̵߳�����
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//��ֹ�̵߳�ִ��
		thread.stop();//�Ӻ��߱�ʾ�ѹ�ʱ�����Ҳ�����ʹ�ã�����ǿ����ֹ�߳�û�б�������ݻᶪʧ��
		
	}

}

class MyThread03 implements Runnable{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+" �߳�-->"+i);
			//ÿ��һ�����һ��i
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	
}