package aʲô���쳣;

/*
 * 	�쳣�Ĵ�����ʽ��
 * 				1���쳣��java���������ʽ���ڣ�ÿһ���쳣�඼���Դ����쳣����
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		//ͨ���쳣��ʵ�����쳣����
		NumberFormatException numberFormatException = new NumberFormatException("���ָ�ʽ���쳣");
		System.out.println(numberFormatException);//java.lang.NumberFormatException: ���ָ�ʽ���쳣
		
		NullPointerException nullPointerException = new NullPointerException("��ָ���쳣����");
		System.out.println(nullPointerException);//java.lang.NullPointerException: ��ָ���쳣����
	}
	

}
