package kͨ��������Ƶ���Constructor;

import java.lang.reflect.Constructor;

/*
 * ͨ��������Ƶ���Constructor��������
 */

public class ReflectConstructorTest {
	
	public static void main(String[] args) throws Exception{
		
		//��ȡVip��Class
		Class vipClass = Class.forName("bean.Vip");
		
		//������Ƶ����޲����Ĺ��췽����������
		Object vip1 = vipClass.newInstance();
		System.out.println(vip1);
		
		//������Ƶ����в������췽����������
		//��һ��Ҫ�Ȼ�ȡ�в�����Constructor
		//getConstructor(parameterTypes),�÷�������ȥ�Ĳ����ǳ��ȿɱ��Class���Ͳ������͵���Methodһ�������ǲ���Ҫ���췽����
		Constructor constructor = vipClass.getConstructor(String.class,String.class,boolean.class,int.class);
		
		//�øù��췽���������newInstance�������������ݷŽ�ȡ�����Ĳ����б�������
		Object vip2 = constructor.newInstance("lisi","19900219",true,108);
		System.out.println(vip2);
		
	}

}
