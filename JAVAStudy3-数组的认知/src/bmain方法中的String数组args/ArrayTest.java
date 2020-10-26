package bmain方法中的String数组args;

import java.awt.print.Printable;

/*
 * main方法中的"String[] args":
 * 								1、入口的main方法由Java虚拟机(JVM)调用
 * 								2、JVM调用main方法时会自动传一个String数组过来
 * 			什么时候args数组中会有值或者说由元素呢？
 *			1、args数组是留给用户的，用户在控制台上输入参数，这个参数会自动转换为"String[] args"
 *			2、例如在doc窗口运行程序：java ArrayTest abc def dyg,此时JVM会自动将"abc def dyg"
 *			   通过空格的方式进行分离，然后存放到数组args中，所以main方法中的String[] args是用来接收用户输入的参数的
 *			3、在IDE中想要输入参数操作为菜单栏的运行()-->Edit Configurations(运行配置)-->选择main方法的类(application)-->选择Program argments(程序自变量)-->键入字符串-->应用			 			
 */

public class ArrayTest {
	//该方法由程序员写出来，由JVM调用
	public static void main(String[] args) {
		
		//JVM默认传过来的String数组长度为0
		//通过测试得出：数组args不是null
		System.out.println("JVM传递过来的String类型数组args的长度为"+args.length);
		for (int i = 0; i < args.length; i++) {
			String string = args[i];
			System.out.println(string);
		}
		
		//以下代码表示数组创建了，但数组中没有数据
		String[] strings = new String[0];
		printLength(strings);
		String[] strings2= {};
		printLength(strings2);
	}
	
	public static void printLength(String[] array) {
		
		System.out.println(array.length);
		
	}

}
