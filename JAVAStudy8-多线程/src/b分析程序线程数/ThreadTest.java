package b���������߳���;

/*
 * �������³�����߳�����һ���̣߳�����ֻ��һ��ջ��
 * �������Ϊ��
			main������ʼִ��!
			m1������ʼִ��!
			m2������ʼִ��!
			m3������ʼִ��!
			m3��������ִ��!
			m2��������ִ��!
			m1��������ִ��!
			main��������ִ��!
			һ��ջ��java������϶�������ִ��
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println("main������ʼִ��!");
		m1();
		System.out.println("main��������ִ��!");
		
	}

	private static void m1() {
		// TODO �Զ����ɵķ������
		System.out.println("m1������ʼִ��!");
		m2();
		System.out.println("m1��������ִ��!");
	}

	private static void m2() {
		// TODO �Զ����ɵķ������
		System.out.println("m2������ʼִ��!");
		m3();
		System.out.println("m2��������ִ��!");
	}

	private static void m3() {
		// TODO �Զ����ɵķ������
		System.out.println("m3������ʼִ��!");
		System.out.println("m3��������ִ��!");
	}

}
