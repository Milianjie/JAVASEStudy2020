package g�̵߳ĵ���;

/*
 * ���̵߳����ȼ���1-10����java������ռʽ���ȼ������ȼ���ֻ����ռ��CPUʱ��Ƭ�࣬ʹ�ø��߳�����״̬ʱ����΢��һ�㣬�����������ĸ��ʸ߻��߿�
 * 	��new�������̶߳������ȼ�Ϊ5.Thread�������������ȼ�����
 * 	��ȡ�̵߳����ȼ���int getPriority() �����̵߳����ȼ��� ��Ա�������̶߳������
 */

public class ThreadTest01 {
	
	public static void main(String[] args) {
		
		//����������ȼ�����
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		
		Thread thread = new Thread(new MyRunnable1());
		
		thread.setName("t1");
		
		//��ӡ�߳�t1Ĭ�����ȼ�
		System.out.println("t1�߳�Ĭ�����ȼ���"+thread.getPriority());//5
		
		//�޸��߳�t1�����ȼ�
		thread.setPriority(10);
		System.out.println("t1�߳��޸ĺ�����ȼ���"+thread.getPriority());//10
	}

}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		
	}
}