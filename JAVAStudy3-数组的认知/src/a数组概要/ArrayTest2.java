package a�����Ҫ;

/*
 * �����ʼ����ʽ��ѡ��
 * 					1�����Ѿ�ȷ����������Ҫ�洢Ԫ�ص�ֵʱ�����þ�̬��ʼ��
 * 					2����ȷ����������Ҫ�洢��Щ��������ʱ�����ö�̬��ʼ����Ԥ�ȷ����ڴ�ռ�
 */

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		//��̬��ʼ��һά����
		int[] a = new int[5];//����һ��int���ͳ���Ϊ5��һά���飬ÿ��Ԫ��Ĭ��ֵΪ0
		
		//��������a
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("�±�Ϊ"+i+"��Ԫ��ֵ�� "+a[i]);
			
		}
		//���ڸ�ֵ
		a[0]=2;
		a[1]=5;
		a[2]=9;
		a[3]=8;
		a[4]=6;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("�±�Ϊ"+i+"��Ԫ��ֵ�� "+a[i]);
			
		}
		System.out.println("=========================================");
		
		//��̬��ʼ��һ��Object���͵�һά����
		Object[] o = new Object[3];
		
		for (int i = 0; i < o.length; i++) {
			Object object = o[i];
			System.out.println("�±�Ϊ"+i+"��Ԫ��ֵΪ"+object);
			
		}
		//��̬��ʼ��Object��������
		//��������
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		//��������
		Object[] objects = {o1,o2,o3};
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);//����Object�е�toString()��������Ϊδ��д��toString�����õ��ַ�����ʾ	
		}
		
		System.out.println("=========================================");
		
		
	}

}
