package f如何自定义异常;

/*
 * 	1、SUN在JDK中提供的内置异常是不够用的。在实际开发中，业务多，这些业务出现的异常
 * 	     是在JDK中没有的。那么此时我们就需要自己定义异常。
 * 	2、Java中怎么自定义异常？
 * 			两步：	
 * 				第一步：编写一个类继承Exception或者RunTimeException
 * 				第二部：提供两个构造方法，一个无参的，一个带有String参数的
 * 			直接死记硬背
 */

public class MyException extends Exception { //继承Exception编译时异常
	
	public MyException() {
		// TODO 自动生成的构造函数存根
		super();
	}
	
	public MyException(String s) {
		super(s);
	}
	
}
//
//public class MyException extends RunTimeException { //继承RunTimeException运行时异常
//	
//	public MyException() {
//		// TODO 自动生成的构造函数存根
//		super();
//	}
//	
//	public MyException(String s) {
//		super(s);
//	}
//	
//}
