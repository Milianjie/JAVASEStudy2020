package a�����Ҫ;

/*
 * �����е��������
 */

public class ArrayTest3 {
	
	public static void main(String args[]) {
		
		//����int�������鴫��
		int[] a = {1,2,3};
		m1(a);
		System.out.println("==============================>");
		
		//ֱ�Ӵ��ݾ�̬����ʱ�﷨����
		//Error-->m1({45,46,89});
		m1(new int[] {78,56,84});
		System.out.println("==============================>");
		
		//������̬��ʼ��String��������
		String[] strings = new String[4];
		m2(strings);
		System.out.println("==============================>");
		
		//����ֱ�Ӵ���̬����
		m2(new String[3]);
		
	}
	//������Ϊint��������
	public static void m1(int[] array1) {
		
		for (int i = 0; i < array1.length; i++) {
			
		System.out.println(array1[i]);

		}
		
	}
	
	//����ΪString��������
	public static void m2(String[] array1) {
		
		for (int i = 0; i < array1.length; i++) {
			
		System.out.println(array1[i]);
			
		}
		
	}

}
