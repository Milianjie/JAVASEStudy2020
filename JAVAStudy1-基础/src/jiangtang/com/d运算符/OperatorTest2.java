package jiangtang.com.d�����;
/*
 *    ���������
 *         &  �߼���     ���߶���true���������true
 *         |  �߼���     ֻҪ��һ����true���������true
 *         !  ȡ��     !true-->false
 *         ^  �߼����     ����ֻҪ��һ�£�����true
 *         
 *         &&  ��·��     �÷���&һ��
 *         ||  ��·��     �÷���|һ��
 *         
 *         �����������ߵ����ӱ����ǲ������ͣ���true��false�����ͣ������Ҳ�����ǲ�������
 */

public class OperatorTest2 {
	     public static void main(String[] args){
	    	 
	    	 //���ڶ�·��
	    	 int a=10;
	    	 int b=10;
	    	 System.out.println(a<b & a++>=b);
	    	 System.out.println(a);//11
	    	 
	    	 //��·�������Ǹ����ʽ��ִ��
	    	 //ʲôʱ������·�룿��һ��������false��ʱ��
	    	 //ʲôʱ������·�򣿵�һ��������true��ʱ��
	    	 System.out.println(b<a || b++>=a);
	    	 System.out.println(b);//10
	    	
	     }

}


