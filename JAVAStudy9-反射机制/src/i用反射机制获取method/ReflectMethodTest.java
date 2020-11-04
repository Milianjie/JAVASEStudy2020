package i用反射机制获取method;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
 * 通过反射机制操作字节码文件的Method
 */

public class ReflectMethodTest {
	
	public static void main(String[] args) throws Exception{//为了方便这里直接抛出所有编译时异常，开发中在main方法不能抛出
		
		//获取User Service类的Class
		Class userServiceClass = Class.forName("iservice.UserService");
		
		/*
		 * 跟操作Field一样，操作Method的方法是一样的
		 * 获取Method一般直接获取包括私有的方法，只获取public的不常用
		 */
		//获取所有的Method，包括私有，这种获取的方式存到数组中的方法是不确定的，想要拿到确定的要指定某个方法名以及该方法的形参类型
		Method[] methods = userServiceClass.getDeclaredMethods();
		System.out.println(methods.length);//2
		
		//获取某个Method对象的名字
		Object  methodName = methods[0].getName();
		System.out.println(methodName);//logout --logout与login随机
		
		//获取某个Method对象的返回值类型
		Class methodClass = methods[0].getReturnType();//返回值类型所以是ReturnType
		System.out.println(methodClass.getSimpleName());//String或者boolean，因为数组中获取的方法顺序好像是随机的
		
		//获取某个Method对象方法的访问控制修饰符
		int methoNo = methods[0].getModifiers();
		System.out.println(Modifier.toString(methoNo));
		
		//与Field有区别的，就是获取方法的参数修饰符列表，因为里面有类型和变量名，类型有多个，参数也有多个，所以返回的是数组
		Class[] parametersTypes = methods[0].getParameterTypes();//有些方法没有参数列表，获取不到时，执行下面代码就会报数组下标越界异常
		System.out.println(parametersTypes[0].getSimpleName());
		//通过多次运行测试，.getParameterTypes()方法获取的形式参数类型是按顺序放进数组的
		
	}

}
