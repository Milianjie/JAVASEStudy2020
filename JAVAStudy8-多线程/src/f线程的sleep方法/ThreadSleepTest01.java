package f�̵߳�sleep����;

/*
 * 		�������̵߳�sleep()������
 * 		static void sleep(long millis) -- ��ָ���ĺ��������õ�ǰ����ִ�е��߳����ߣ���ִͣ�У����˲����ܵ�ϵͳ��ʱ���͵��ȳ��򾫶Ⱥ�׼ȷ�Ե�Ӱ�졣
 * 		1����̬������Thread.sleep(1000);
 * 		2�������Ǻ���
 * 		3�����ã��õ�ǰ���̽������ߣ���������״̬��ʹ�߳���ָ��ʱ���ڷ���ռ��CPUʱ��Ƭ���������߳�ʹ�� 
 * 		Thread.sleep(1000*5);��δ���
 * 			����A�̵߳��У�ʹA�߳̽�������5����
 * 			����B�̵߳��У�ʹB�߳̽�������5����
 * 		4��sleep������Ч��������ض���ʱ�䣬ȥִ��һ���ض��Ĵ��룬�����ִ��һ��
 */

public class ThreadSleepTest01 {
	
	public static void main(String[] args) {
		
		
		try {
			//�õ�ǰ�߳̽������ߣ�5����
			//��ǰ�߳������߳�main
			Thread.sleep(1000*5);
			
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		//5���ִ���������
		System.out.println("hello word");
		
		
		//�����½�һ���̣߳�������
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO �Զ����ɵķ������
				for(int i=0;i<6;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+i);
				}
			}
		});
		thread.setName("���߳�1");
		thread.start();
		
		try {
			
			thread.sleep(1000*5);//�˴������ø��߳�1�������ߣ���Ϊsleep�Ǿ�̬�ģ�ִ��ʱ����ת��Thread.sleep(1000*5);
								//�ô���ֻ���õ�ǰ�̼߳����߳̽�������
			
		} catch (InterruptedException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		System.out.println("666666");
		
	}

}
