package jiangtang.com.j��������;


/*
 *    ���뷽�����������������
 *    ʲô�Ƿ�����
 *          ��������һ�δ���Ƭ�Σ����������ض��Ĺ��ܣ����ҿ��ظ�����
 */


    public class MethodTest1 {
    	
    	//���
    	    public static void main(String[] args){
    	    //��main�����е���sumInt��������ɹ���
    	    //ע�⣺����static�ķ���������ʱ�������"����."�ķ�ʽ����
    	    	MethodTest1.sumInt(10,20);
    	    	MethodTest1.sumInt(100,20);
    	    	MethodTest1.sumInt(101,201);
    	    	MethodTest1.sumInt(1011,250);
    	    	
    	    	
    	    	
    	    }
	
    //�������ж���һ��������������������
    //ע�⣺Ŀǰ���еķ��������public static.�Ժ�ὲ
    	    public static void sumInt(int a,int b){
    	    	int c=a+b;
    	    	System.out.println(a+"+"+b+"="+c);
    	    }
}

