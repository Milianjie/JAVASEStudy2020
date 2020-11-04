package k通过反射机制调用Constructor;

import java.lang.reflect.Constructor;

/*
 * 通过反射机制调用Constructor创建对象
 */

public class ReflectConstructorTest {
	
	public static void main(String[] args) throws Exception{
		
		//获取Vip的Class
		Class vipClass = Class.forName("bean.Vip");
		
		//反射机制调用无参数的构造方法创建对象
		Object vip1 = vipClass.newInstance();
		System.out.println(vip1);
		
		//反射机制调用有参数构造方法创建对象
		//第一步要先获取有参数的Constructor
		//getConstructor(parameterTypes),该方法传进去的参数是长度可变的Class类型参数，和调用Method一样，但是不需要构造方法名
		Constructor constructor = vipClass.getConstructor(String.class,String.class,boolean.class,int.class);
		
		//用该构造方法对象调用newInstance方法将参数数据放进取方法的参数列表创建对象
		Object vip2 = constructor.newInstance("lisi","19900219",true,108);
		System.out.println(vip2);
		
	}

}
