package oProperties������;

import java.util.Properties;

/*
 * ��Properties������������ط�����
 * 		Properties��һ��Map���ϣ��̳�Hashtable���������̰߳�ȫ��
 * 		�ü��ϵ�key��value����Ĭ��String���͵�
 * 		Properties����Ϊ���������
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		
		Properties pro = new Properties();
		
		//����Properties�������������ȡ
		//��,�÷����ײ���õ���put����
		//�÷����涨�������key��valueֻ����String���ͣ�put�г����÷��ͣ����������
		pro.setProperty("url", "jdbc:mysql://localhost:3306/jiangytangdamen");
		pro.setProperty("driver", "com.mysql.jdbc.Driver");
		pro.setProperty("username", "zhongrongjie");
		pro.setProperty("password", "123456789");
		
		//ȡ,�÷����ײ���õ���get����
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("driver"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
	}

}
