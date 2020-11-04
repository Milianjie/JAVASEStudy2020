package cͨ������ʵ��������;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * ����֤������Ƶ�����ԡ�
 * 		����ĳ���ֻ��Ҫ�޸������ļ��Ϳ���ʵ�����Լ���Ҫ��������Ķ�����
 * 		�ǳ�֮���(����OPC����ԭ�򣺶���չ���ţ����޸Ĺر�)
 * 
 * 		�߼���ܣ�ssh ssm
 * 		Spring SpringMVC MyBatis
 * 		Spring Struts Hibernate
 * 		��Щ�߼���ܵײ��ʵ��ԭ�����ǲ��õķ�����ơ�
 */

public class ReflectTest02 {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			//����������
			reader = new FileReader("src/cͨ������ʵ��������/classinfo.properties");
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		//����Properties���ϣ�key��value����String���͵�
		Properties properties = new Properties();
		
		//��ȡ�����ļ��浽����
		try {
			properties.load(reader);
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}

		//ͨ��key��ȡvalue
		Object value1 = properties.get("className1");
		Object value2 = properties.get("className2");
		System.out.println(value1);//bean.User
		
		//�û�ȡ��value��ͨ��������ƣ�ʵ����User����
		Class c;
		try {
			
			c = Class.forName((String)value1);
			Class c2 = Class.forName((String)value2);
			
			Object obj1 = c.newInstance();
			Object obj2 = c2.newInstance();
			
			System.out.println(obj1);
			System.out.println(obj2);
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		
	}

}
