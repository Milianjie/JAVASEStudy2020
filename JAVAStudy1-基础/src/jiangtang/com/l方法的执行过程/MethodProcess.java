package jiangtang.com.l������ִ�й���;

/*
 *      ʹ��ͼ�λ������³����ִ������
 *      
 *      ������ִ��ԭ��
 *                 �����ڵ��õ�ʱ�򣬲Ż���÷������ڴ��з���ռ䡣
 *                 ����������ֻ�Ƕ���û�е��ã��򲻻����ڴ��з���ռ�
 *          
 *          �����ڵ��õ�ʱ���ڡ�ջ���з���ռ䡣(JVM�ڴ�����һ���ڴ���ջ�ڴ�)
 *          ����������ʵ���ǡ�ѹջ��
 *          ����������ʵ���ǡ���ջ��
 */


public class MethodProcess {
	 
	public static void main(String[] args){
		
		int i=100;//�ֲ�������ֻ��main��������Ч
		
		m1(i);//ѹջʱ����i=100ԭԭ�����ĸ��Ƹ���m1�еľֲ���������i
		
		System.out.println("hello world");//4.ִ�е������main��������
	}
	public static void m1(int i){
		m2(i);//3.ִ�д˵������m1��������
		System.out.println("m1�����е�i="+i);
	}
	public static void m2(int i){
		m3(i);//2.ִ�д˵������m2��������
		System.out.println("m2�����е�i="+i);
	}
	public static void m3(int i){
		System.out.println("m3�����е�i="+i);//1.��ջʱ��ִ�д�java��䣬Ȼ��m3��������
	}

}
