package jiangtang.com.k����������;

/*
 *      ���ڷ�������(Overload)
 *      
 *      ���³���ʹ�÷������أ�������ȱ�㣺
 *      1.����Աֻ��Ҫ������ٵķ��������������
 *      2.�����������
 *      
 *      ʲôʱ��ᷢ�����������أ�
 *      1.������ͬһ������
 *      2.��������ͬ
 *      3.�����б�ͬ(���͡�����������˳��)
 *      4.�ͷ���ֵ�����޹�
 *      5.�����η��б��޹�
 */

public class Test1 {
	//���
	public static void main(String[] args){
		
		//���ڳ���Ա����ֻ��Ҫ����һ��������
		    System.out.println(Computer.sum(10,20));//��Computer.������Test01.
		    System.out.println(Computer.sum(10.2,20.3));
		    System.out.println(Computer.sum(10l,20l));
		    
		    
		  //����System.out.println()�Ƿ񹹳ɷ��������أ�
			System.out.println(10);
			System.out.println(3.14);
			System.out.println(true);
			System.out.println("hello world");
			//System.out��sun�ṩ��PrintStream����
			//println��printString���͵ķ������÷����Ѿ�����������
	}
	

}

class Computer{
	
	public static int sum(int a,int b){
		return a+b;
	}
	public static double sum(double a,double b){
		return a+b;
	}
	public static long sum(long a,long b){
		return a+b;
	}
	

}
