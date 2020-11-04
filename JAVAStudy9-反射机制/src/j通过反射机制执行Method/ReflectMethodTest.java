package jͨ���������ִ��Method;

import java.lang.reflect.Method;

/*
 * ͨ��������Ƶ���Method����
 */

public class ReflectMethodTest {
	
	public static void main(String[] args) throws Exception{
		
		/*
		 * ��ͨ��ʽ���÷�������Ҫ��
		 * 	1������Ķ���
		 * 	2���������ķ�����
		 * 	3�����п��ܷ������������أ�������Ҫ��ʽ�����б�
		 * 	4������ֵ
		 * 
		 * ���ĸ�Ҫ���ڷ��������Ҳ���붼����!!!
		 */
		
		//��ȡClass
		Class userServicerClass = Class.forName("iservice.UserService");
		
		/*
		 * ͨ���������Ҫ�أ�ͨ���������������Method����
		 */
		//ͨ�����䴴������
		Object userService = userServicerClass.newInstance();
		
		//��ȡ��Ҫ�ķ���
		//��ȡĳ��ָ���ķ�������Ϊ�з��������أ���������Ҫ��������������Ҫ��������ʽ�����б�
		//���Ի�ȡMethod��getDeclaredMethod(������, parameterTypes)�����е�parameterTypes�ǿɱ䳤�Ȳ���������������Class
		Method loginMethod = userServicerClass.getDeclaredMethod("login",String.class,String.class);
		
		//����������÷��������Ҹ�һ���������͵ı���
		//invoke����Ϊ���ã��������˼�ǣ�ͨ����������String���͵Ĳ���"abcdef","123456"���ö���userService��loginMethod������
		//����loginMethod��������ľ���login����
		Object loginRetrun = loginMethod.invoke(userService, "abcdef","123456");
		System.out.println((boolean) loginRetrun?"��¼�ɹ�":"��¼ʧ��");
		
	}

}
