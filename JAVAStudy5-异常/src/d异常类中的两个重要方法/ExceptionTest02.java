package d�쳣���е�������Ҫ����;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 		���鿴�쳣��׷����Ϣ��Ȼ����ٵĵ��Գ���
 * 			��ӡ�����쳣��ջ׷����Ϣ����������һ��һ�п�
 * 			��ע����ǣ���SUNд�Ĵ��벻��Ҫ��(����������)����Щ�϶�û����Ҫ�������Լ��Ĵ���
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			//��ӡ�쳣��ջ׷����Ϣ
			//��ʵ�ʿ�����Ҫд�����еĴ��룬�������ⷽ����ҽ��
			e.printStackTrace();
			/*
			 * 
	java.io.FileNotFoundException: C:\User\taobao.txt (ϵͳ�Ҳ���ָ����·����)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at d�쳣���е�������Ҫ����.ExceptionTest02.m3(ExceptionTest02.java:54)
	at d�쳣���е�������Ҫ����.ExceptionTest02.m2(ExceptionTest02.java:49)
	at d�쳣���е�������Ҫ����.ExceptionTest02.m1(ExceptionTest02.java:45)
	at d�쳣���е�������Ҫ����.ExceptionTest02.main(ExceptionTest02.java:17)
			 */
			//�쳣��Ϣ�ı������
			//55�г����⣬������50�г�����
			//50�г����⣬������46�г�����
			//46�г����⣬������17�г�����
			//����˵��Դ������ڵ�55�д���
		}
		
		System.out.println("Ŷi�ٶȼӰ���ʮ���");
		
	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	
	public static void m2() throws FileNotFoundException {
		m3();
	}

	public static void m3() throws FileNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("C:\\User\\taobao.txt");
		
	}

}
