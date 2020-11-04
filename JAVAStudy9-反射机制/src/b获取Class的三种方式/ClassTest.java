package b��ȡClass�����ַ�ʽ;

import java.util.Date;

/*
 * 	Ҫ����һ���ֽ����ļ�����Ҫ�Ȼ�ȡ�������ֽ����ļ�
 * 	����ȡjava.lang.Classʵ�������ַ�����
 * 		��һ�֣�static Class<?> forName(String className) --��������и����ַ����������ӿ�������� Class ���� 
 * 				Class c = Class.forName("����������������");
 * 		
 * 		�ڶ��֣�Class<?> getClass() --���ش� Object ������ʱ�ࡣ 
 * 				Class c = ����.getClass();
 * 
 * 		�����֣�Class c = �κ�����.class;
 */

public class ClassTest {
	
	public static void main(String[] args) {
		
		/*
		 * Class.forName()
		 * 1������һ����̬����
		 * 2�������Ĳ�����һ���ַ��������ַ���������һ�������������������а�����java.lang����ʡ
		 */
		Class class1 = null;//�ֲ�������Ҫ��ʾ�ĸ�ֵ����Ȼtry�������и�ֵ�������ܱ��쳣����ֵ���ɹ�������Ͳ��������������
		try {
			class1 = Class.forName("java.lang.String");//class1����String.class�ļ�������˵class1��String����
			Class class2 = Class.forName("java.util.Date");//class2��Date
			Class class3 = Class.forName("java.lang.Integer");//class3��Integer����
			Class class4 = Class.forName("java.lang.System");//class4��System����
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
		/*
		 * java�е��κ�һ��������һ��������getClass()
		 * ��Ϊ�÷�����Object�еģ�Object����������ĸ���
		 */
		String string = "abc";
		Class class5 = string.getClass();//class5����String.class�ֽ����ļ�����String����
		
		System.out.println(class1 == class5);//true  -->JVM�ڷ�������ֻ�ṩһ��String.class�ֽ����ļ�����������ָ�����ͬһ��
		
		/*
		 * java�������κ�һ�����ͣ����������������ͣ�����.class����
		 */
		Class class6 = String.class;
		Class class7 = Date.class;
		Class class8 = Integer.class;
		Class class9 = int.class;
		System.out.println(class1 == class6);//true
		
	}

}
