package oProperties属性类;

import java.util.Properties;

/*
 * 【Properties属性类对象的相关方法】
 * 		Properties是一个Map集合，继承Hashtable，所以是线程安全的
 * 		该集合的key和value都是默认String类型的
 * 		Properties被称为属性类对象
 */
public class PropertiesTest {
	
	public static void main(String[] args) {
		
		Properties pro = new Properties();
		
		//掌握Properties两个方法：存和取
		//存,该方法底层调用的是put方法
		//该方法规定了输入的key和value只能是String类型，put中除非用泛型，否者随便用
		pro.setProperty("url", "jdbc:mysql://localhost:3306/jiangytangdamen");
		pro.setProperty("driver", "com.mysql.jdbc.Driver");
		pro.setProperty("username", "zhongrongjie");
		pro.setProperty("password", "123456789");
		
		//取,该方法底层调用的是get方法
		System.out.println(pro.getProperty("url"));
		System.out.println(pro.getProperty("driver"));
		System.out.println(pro.getProperty("username"));
		System.out.println(pro.getProperty("password"));
	}

}
