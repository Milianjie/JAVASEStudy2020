package gͨ��������ƻ�ȡField��ֵ;

/*
 * ͨ��������Ƹ�Field��ֵ���߻�ȡ�ֶε�ֵ���������Խ�һЩ���Կɱ���ַ��Լ�Ҫ��ֵ������д�����������ļ�
 * ����ֻ��Ҫ�޸����������ļ��е����ݾͿ��Ը���ͬ������ֶθ�ֵ�ͻ�ȡ�ֶ�ֵ��
 */

import java.lang.reflect.Field;

import bean.Student;

public class ReflectFieldTest {
	
	public static void main(String[] args) throws Exception {
		
		/*
		 * ��ͨ��ֵ�ͻ�ȡ��������ԣ�
		 */
		Student student = new Student();
		student.num = 100;//��Ҫ�أ������Ķ��󡢸ö�����ֶ��Լ�Ҫ��ֵ������
		System.out.println(student.PI);//��Ҫ�أ������Ķ���Ҫ��ȡ�ĸö�����ֶ�
		
		
		/*
		 * �������
		 */
		//��ȡClass
		Class class1 = Class.forName("bean.Student");
		
		Object obj = class1.newInstance();//����Student���ֶΣ�obj��ѧ�������
		
		//��ȡָ���ֶε�Field
		Field numField = class1.getDeclaredField("num");//��ȡָ���ֶ�num��Field
		Field ageField = class1.getDeclaredField("age");//��ȡָ��˽���ֶ�age��Field
		
		//��ֵ����������ȡ���ֶ�.set(����,��ֵ������);
		//������Ȩ�޿��Ʒ����ֶΣ�����ֱ������������ֱ�Ӹ�ֵ�ͻ�ȡ����Ҫ���Ʒ�װ
		ageField.setAccessible(true);//��Ҳ�Ƿ�����Ƶ�ȱ�㣬̫���װѷ�װ�Դ�����
		ageField.set(obj, 28566);//��Ҫ�أ������Ķ��󡢸ö�����ֶ��Լ�Ҫ��ֵ������ ҲҪȱһ����
		
		//��ȡField��ֵ
		Object age = ageField.get(obj);//��Ҫ�أ������Ķ���Ҫ��ȡ�ĸö�����ֶ�
		System.out.println(ageField.getName()+":"+age);
		
	}

}
