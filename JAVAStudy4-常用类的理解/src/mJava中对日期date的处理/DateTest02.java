package mJava�ж�����date�Ĵ���;

/*
 * ��ȡ��1970��1��1�յ���ǰϵͳʱ����ܺ�����
 * 1��=1000����
 * 
 * 			System���������Ժͷ�����
 * 			System.out   out��System��ľ�̬����
 * 			System.out.println()   System���еľ�̬����out�ķ�������PrintStream������println()��PrintStream���еķ���
 * 			System.gc()  ������������������
 * 			System.currentTimeMillis()   ��ȡ��1970��1��1�յ���ǰϵͳʱ����ܺ�����
 * 			System.exit(0)   �˳�JVM
 */

public class DateTest02 {
	
	public static void main(String[] args) {
		
		//��ȡ��1970��1��1�յ���ǰϵͳʱ����ܺ�����
		long nowTimeMillis = System.currentTimeMillis();
		System.out.println(nowTimeMillis);//1603007789976
		
		//ͳ��print����ִ�е������ķ��˶��ٺ���
		//ִ��ǰͳ��һ��
		long bigin = System.currentTimeMillis();
		print();
		//ִ�к�ͳ��һ��
		long end = System.currentTimeMillis();
		//��ǰ���
		System.out.println("ִ��print�����ķ�"+(end-bigin)+"����");//ÿ���������һ����,����ӡ��ʱ0����
		
		
		
	}
	
	public static void print() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("i = "+i);
		}
		
	}

}
