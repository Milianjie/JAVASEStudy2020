package cʵ���̵߳ķ�ʽ;

/*
 * ��ʵ���̵߳ĵڶ��ַ�ʽ����дһ���࣬ʵ��java.lang.Runnable�ӿڡ�
 * 
 * 		��ע�⡿��̶����������Ҳ����˵����ӿڱ�̣�ͨ��ʵ�ֽӿڵķ�ʽʵ���̣߳�ͬʱ�������ø���ȥ�̳���������
 * 				ʹ������и�ǿ�����ʵ���ԣ��๦���ԡ����Եڶ��ַ����ǽ�����õ�
 */

public class ThreadTest02 {
	
	public static void main(String[] args) {
		
//		//����һ�������еĶ���
//		MyThread2 myThread = new MyThread2();
//		
//		//�������еĶ����װ��һ���̶߳���
//		Thread thread = new Thread(myThread);
		
		Thread thread = new Thread(new MyThread2());//�ϲ�����
		
		//Ȼ����ø��̶߳����start�����������߳�
		thread.start();
		
		//����Ĵ��뻹�����������߳���
		for(int i = 0;i < 10;i++) {
			System.out.println("���߳�-->"+i);
		}
	
		
	}

}

//����ಢ����һ���߳��ֻ࣬��һ�������е��ࡣ������һ���߳�
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		for(int i = 0 ; i < 10 ;i++) {
			System.out.println("��֧�߳�-->"+i);
		}
	}
	
}