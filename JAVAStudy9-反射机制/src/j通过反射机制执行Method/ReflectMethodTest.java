package j通过反射机制执行Method;

import java.lang.reflect.Method;

/*
 * 通过反射机制调用Method方法
 */

public class ReflectMethodTest {
	
	public static void main(String[] args) throws Exception{
		
		/*
		 * 普通方式调用方法，四要素
		 * 	1、该类的对象
		 * 	2、这个对象的方法名
		 * 	3、类中可能发生方法的重载，所以需要形式参数列表
		 * 	4、返回值
		 * 
		 * 这四个要素在反射机制中也必须都满足!!!
		 */
		
		//获取Class
		Class userServicerClass = Class.forName("iservice.UserService");
		
		/*
		 * 通过上面的四要素，通过反射机制来调用Method方法
		 */
		//通过反射创建对象
		Object userService = userServicerClass.newInstance();
		
		//获取想要的方法
		//获取某个指定的方法，因为有方法的重载，不仅仅需要方法名，还得需要方法的形式参数列表
		//所以获取Method的getDeclaredMethod(方法名, parameterTypes)方法中的parameterTypes是可变长度参数，而且类型是Class
		Method loginMethod = userServicerClass.getDeclaredMethod("login",String.class,String.class);
		
		//输入参数调用方法，并且给一个返回类型的变量
		//invoke翻译为调用，这里的意思是：通过传入两个String类型的参数"abcdef","123456"调用对象userService的loginMethod方法，
		//其中loginMethod方法保存的就是login方法
		Object loginRetrun = loginMethod.invoke(userService, "abcdef","123456");
		System.out.println((boolean) loginRetrun?"登录成功":"登录失败");
		
	}

}
