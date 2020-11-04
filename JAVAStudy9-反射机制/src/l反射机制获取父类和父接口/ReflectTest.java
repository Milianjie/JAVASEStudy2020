package l反射机制获取父类和父接口;

import java.lang.reflect.AnnotatedType;

/*
 * 获取到Class后怎么获取其父类和实现的接口
 */

public class ReflectTest {
	
	public static void main(String[] args) throws Exception{
		
		//以String举例
		Class stringClass =Class.forName("java.lang.String");
		
		//获取String父类
		Class stringSuperClass = stringClass.getSuperclass();
		System.out.println(stringSuperClass.getName());
		
		//获取String的所有实现接口，一个类可以实现多个接口，将这些接口放进数组中
		Class[] stringIterfaces = stringClass.getInterfaces();
		for (Class class1 : stringIterfaces) {
			System.out.println(class1.getName());
		}
		
	}

}
