package g�̵߳ĵ���;

/*
 * 		���̵߳���λ��static void yield() --��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳� 
 * 		��̬������Thread.yield 
 * 		�߳���ִ�и÷�����ʹ�ø��̷߳�����ǰ���е�CPUʱ��Ƭ���������߳���ִ�У����Լ����ص�����״̬����CPUʱ��Ƭ
 * 		Ҳ�������Ŀ��ܣ��շ���ȥ����ʱ��Ƭ����������CPUʱ��Ƭ�Ŀ��ܣ��߳��ּ�����������״̬������ִ���ϴ�δִ�е�run�������롣
 * 	
 * 		���������������������t1�߳������9֮��i��10ִ����λ�������ص�main�߳��������Ȼ����������λ
 */

public class ThreadTest02 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyRunnable2());
		
		thread.setName("t2");
		
		thread.start();
		
		for(int i = 1;i <= 1000;i++) {
			System.out.println(Thread.currentThread().getName()+"�߳�-->"+i);
		}
		
	}

}

class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 1;i <= 1000;i++) {
			
			//���i�ﵽ100���������߳̽�����λ
			if (i%10 == 0) {
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+"�߳�-->"+i);
			
		}
	}
}