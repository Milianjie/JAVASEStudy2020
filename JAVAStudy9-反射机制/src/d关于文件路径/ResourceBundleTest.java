package d关于文件路径;

import java.util.ResourceBundle;

/*
 * java.util包下提供了一个资源绑定器，便于获取属性配置文件中的内容
 * 	使用以下这种方式的时候，属性配置文件必须放到类路径下
 */

public class ResourceBundleTest {
	
	public static void main(String[] args) {
		
		//资源绑定器ResourceBundle只能绑定xxx.properties文件。并且该文件只能在类文件路径下
		//在getBundle()方法中写路径的时候，路径后面的扩展名不能写
		ResourceBundle bundle1 = ResourceBundle.getBundle("db");
		ResourceBundle bundle2 = ResourceBundle.getBundle("bean/classinfo");
		
		Object obj1 = bundle1.getObject("className");
		Object obj2 = bundle2.getObject("className2");
		
		System.out.println(obj1);
		System.out.println(obj2);
		
	}

}
