/*
 *   1.�쳣��ʲô��
 *     һ���쳣ģ�������ʵ�����С������������¼�
 *     ����java���á��ࡱȥģ���쳣������ӿ�һ��
 *     �������ǿ��Դ��������
 *          NullPointerException e = 0x1234;
 *          e���������ͣ�e�б�����ڴ��ַָ�򡰶ѡ��еĶ���
 *          �˶������NullPinterException���͵�
 *          �������ͱ�ʾ��ʵ���ڵ��쳣�¼�
 *          NullPinterException����һ���쳣
 *          
 *          �磺"����"��һ���쳣
 *              "����������"�����쳣�¼�����Ϊ��һ���쳣���������쳣�¼�
 *     
 *    2.�쳣���Ƶ�����
 *      java����Ϊ�����ṩ��һ�����ƵĴ������
 *      ���ã��������쳣��Ϊ���������ϸ��Ϣ
 *      ����Աͨ�������Ϣ�����ԶԳ�����д���ʹ������ӽ�׳
 *    
 */
package aʲô���쳣;

public class ExceptionTest01 {
	
	public static void main(String[] args){
		
		int a=10;
		int b=0;
			
		int c=a/b;//JVMִ�е��˴�ʱ����new�쳣����new ArithmeticException("/ by zero");Ȼ���׳�������̨�Ϳ�����
		
		//����Ĵ���������쳣����û�д���������Ĵ��벻��ִ�У�ֱ���˳���JVM
		System.out.println(c);
		
		/*���ϳ�����Ȼ����ͨ���ˣ�������ʱ�������쳣����ʾ������ĳ���쳣�¼�
		 * ���ʣ�����ִ�й����з�����"�����쳣"����¼�JVMΪ���Ǵ�����һ��ArithmeticException
		 * ���͵Ķ��󣬲�����������������ϸ���쳣��Ϣ��JVM����������е���Ϣ���������̨
		  JVM�����̨���������Ϣ��
		  Exception in thread "main" java.lang.ArithmeticException: / by zero
	at aʲô���쳣.ExceptionTest01.main(ExceptionTest01.java:26)*/
		
		
	//��׳�ԣ��ĳ����´���
		/* if(b!=0){
		 int c=a/b;
		 System.out.println(a+"/"+b+"="+c);
		 
		 }else{
		 
		 System.out.println("����������Ϊ0��");
		 }*/
	}

}
