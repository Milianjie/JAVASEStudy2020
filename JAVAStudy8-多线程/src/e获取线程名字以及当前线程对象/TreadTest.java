package e��ȡ�߳������Լ���ǰ�̶߳���;

/*
 * ����ȡ��ǰ�̶߳�������á�static Thread currentThread() --���ضԵ�ǰ����ִ�е��̶߳�������á� 
 * 		�÷���Thread t = Thread.currentThread();
 * 		��δ������һ�������У����ص��Ƿ���������ĳ���̵߳��Ǹ��̶߳������ã�����˵��ǰ����ִ�е��̶߳���
 * 		����	�����������MyThread��������run()������ThreadTest���е�m1()���������Thread t = Thread.currentThread();
 * 		��ͨ��t.getName()��ȡ���Է����̶߳�������֣���Ϊrun��������"��һ��"�߳������еģ�m1��������"main"���߳������е�
 * 		����ǰ�߷��ص����̶߳�����"��һ��"��������"main"��
 * 
 * �����̶߳���������
 * 		�̶߳��������.setName();
 * 
 * ����ȡ�̶߳�������֡�
 * 		�̶߳��������.getName();
 * 
 * ����δ��һ���̶߳�������ʱ��Ĭ�������ǣ���
 * 			Thread-0
 * 			Thread-1
 * 			Thread-2
 * 			Thread-3
 * 			Thread-4
 * 				....
 */

public class TreadTest {
	
	public static void main(String[] args) {
		
		
		
		Thread t1 =new Thread(new MyThread());
		Thread t2 =new Thread(new MyThread());
		
		//���̶߳���t1��t2����
		t1.setName("��һ��");
		t2.setName("�ڶ���");
		
		//��ȡ�̵߳�����
		t1.getName();//��һ��
		t2.getName();//�ڶ���
		
		//��ȡmain�������������̼߳����ߴӵ�����
		Thread t = Thread.currentThread();
		t.getName();//main
		
		//����'��һ��'�߳�
		t1.start();
		//����m1����
		m1();
		
	}
	
	public static void m1() {
		
		for(int i = 0 ;i < 10;i++) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+"�߳�-->"+i);
		}
		
	}

}

class MyThread implements Runnable{
	
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
	for(int i = 0 ;i < 10;i++) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"�߳�-->"+i);
	}
	}
}
