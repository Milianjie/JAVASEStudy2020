package i�÷�����ƻ�ȡmethod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * ͨ��������Ʋ����ֽ����ļ���Method
 */

public class ReflectMethodTest {
	
	public static void main(String[] args) throws Exception{//Ϊ�˷�������ֱ���׳����б���ʱ�쳣����������main���������׳�
		
		//��ȡUser Service���Class
		Class userServiceClass = Class.forName("iservice.UserService");
		
		/*
		 * ������Fieldһ��������Method�ķ�����һ����
		 * ��ȡMethodһ��ֱ�ӻ�ȡ����˽�еķ�����ֻ��ȡpublic�Ĳ�����
		 */
		//��ȡ���е�Method������˽�У����ֻ�ȡ�ķ�ʽ�浽�����еķ����ǲ�ȷ���ģ���Ҫ�õ�ȷ����Ҫָ��ĳ���������Լ��÷������β�����
		Method[] methods = userServiceClass.getDeclaredMethods();
		System.out.println(methods.length);//2
		
		//��ȡĳ��Method���������
		Object  methodName = methods[0].getName();
		System.out.println(methodName);//logout --logout��login���
		
		//��ȡĳ��Method����ķ���ֵ����
		Class methodClass = methods[0].getReturnType();//����ֵ����������ReturnType
		System.out.println(methodClass.getSimpleName());//String����boolean����Ϊ�����л�ȡ�ķ���˳������������
		
		//��ȡĳ��Method���󷽷��ķ��ʿ������η�
		int methoNo = methods[0].getModifiers();
		System.out.println(Modifier.toString(methoNo));
		
		//��Field������ģ����ǻ�ȡ�����Ĳ������η��б���Ϊ���������ͺͱ������������ж��������Ҳ�ж�������Է��ص�������
		Class[] parametersTypes = methods[0].getParameterTypes();//��Щ����û�в����б���ȡ����ʱ��ִ���������ͻᱨ�����±�Խ���쳣
		System.out.println(parametersTypes[0].getSimpleName());
		//ͨ��������в��ԣ�.getParameterTypes()������ȡ����ʽ���������ǰ�˳��Ž������
		
	}

}
