/*
 *    ����throws
 */
package bthrows�����쳣;

import java.io.*;//*��ʾ����java.io���µ�������
//import ����İ�������.xxx��ʾ����

public class ExceptionTest02 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		/*
		 * 
		m1();
		
		
		ʹ��throws�����쳣�������������쳣��������ж����
		 * 
		˭���þ��׸�˭������������쳣�Ĺ����У�ÿ���������ǲ���throws�ķ�ʽ�����쳣��������ץס����쳣
		 * �Ļ������ջ��׸�JVM����JVM�ͻ���ֹ���������
		 * 
		 * 
		�����m1��������������쳣����Ϊ���õ������׸���JVM
		JVM��������쳣�ͻ��˳�JVM����Ĵ��벻��ִ��
		System.out.println("shkjhakjf");
		*/
		
		//�����Ĵ�����������m1,m1��������m2��m2����m3��m3��new FileInputStream���󣬵��ø��๹�췽��
		//��ʱ���������ļ���ַ���ַ��������ȥ�����ֵ�ַ��Ч��û����Ӧ���ݣ�new��һ��FileNotFoundException����
		//����Դ������new��ǰ���и��ؼ���throw�����Է����쳣����FileInputStream��Ĺ��췽�����õ���
		//����throws�׳����쳣��m3���øù��췽�����쳣����m3��
		//m3������׸���m2��m2Ҳ������׸�m1��m1����������ף���catch����Ȼ����쳣���д���
		//��������쳣�ղ���ʱtry/catch���������쳣��Ҳ���������׵�ָ����������쳣
		try{
			m1();
		}catch(FileNotFoundException e){}
		System.out.println("�ļ������ڣ�������·������Ҳ�����ļ���ɾ��!");//���ٽ��޵�
	}
	//�൱���쳣�׵��˴�ʱ���������ף��������
	
public static void m1() throws FileNotFoundException{
m2();	
}
public static void m2() throws FileNotFoundException{
m3();	
}
public static void m3() throws FileNotFoundException{
	new FileInputStream("C:/ab.txt");//FileInputStream���췽������λ����ʹ��throws(������)
}


}
