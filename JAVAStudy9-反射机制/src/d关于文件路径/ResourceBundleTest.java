package d�����ļ�·��;

import java.util.ResourceBundle;

/*
 * java.util�����ṩ��һ����Դ���������ڻ�ȡ���������ļ��е�����
 * 	ʹ���������ַ�ʽ��ʱ�����������ļ�����ŵ���·����
 */

public class ResourceBundleTest {
	
	public static void main(String[] args) {
		
		//��Դ����ResourceBundleֻ�ܰ�xxx.properties�ļ������Ҹ��ļ�ֻ�������ļ�·����
		//��getBundle()������д·����ʱ��·���������չ������д
		ResourceBundle bundle1 = ResourceBundle.getBundle("db");
		ResourceBundle bundle2 = ResourceBundle.getBundle("bean/classinfo");
		
		Object obj1 = bundle1.getObject("className");
		Object obj2 = bundle2.getObject("className2");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
