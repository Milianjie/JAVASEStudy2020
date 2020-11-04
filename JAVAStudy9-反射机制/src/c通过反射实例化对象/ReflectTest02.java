package c通过反射实例化对象;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * 【验证反射机制的灵活性】
 * 		下面的程序，只需要修改配置文件就可以实例化自己想要的任意类的对象了
 * 		非常之灵活(符合OPC开闭原则：对扩展开放，对修改关闭)
 * 
 * 		高级框架：ssh ssm
 * 		Spring SpringMVC MyBatis
 * 		Spring Struts Hibernate
 * 		这些高级框架底层的实现原理，都是采用的反射机制。
 */

public class ReflectTest02 {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
		try {
			//创建输入流
			reader = new FileReader("src/c通过反射实例化对象/classinfo.properties");
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//创建Properties集合，key和value都是String类型的
		Properties properties = new Properties();
		
		//读取配置文件存到集合
		try {
			properties.load(reader);
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}

		//通过key获取value
		Object value1 = properties.get("className1");
		Object value2 = properties.get("className2");
		System.out.println(value1);//bean.User
		
		//用获取的value，通过反射机制，实例化User对象
		Class c;
		try {
			
			c = Class.forName((String)value1);
			Class c2 = Class.forName((String)value2);
			
			Object obj1 = c.newInstance();
			Object obj2 = c2.newInstance();
			
			System.out.println(obj1);
			System.out.println(obj2);
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}

}
