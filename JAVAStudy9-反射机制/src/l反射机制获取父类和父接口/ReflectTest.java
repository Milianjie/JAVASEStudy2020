package l������ƻ�ȡ����͸��ӿ�;

import java.lang.reflect.AnnotatedType;

/*
 * ��ȡ��Class����ô��ȡ�丸���ʵ�ֵĽӿ�
 */

public class ReflectTest {
	
	public static void main(String[] args) throws Exception{
		
		//��String����
		Class stringClass =Class.forName("java.lang.String");
		
		//��ȡString����
		Class stringSuperClass = stringClass.getSuperclass();
		System.out.println(stringSuperClass.getName());
		
		//��ȡString������ʵ�ֽӿڣ�һ�������ʵ�ֶ���ӿڣ�����Щ�ӿڷŽ�������
		Class[] stringIterfaces = stringClass.getInterfaces();
		for (Class class1 : stringIterfaces) {
			System.out.println(class1.getName());
		}
		
	}

}
