package d异常类中的两个重要方法;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 * 		怎查看异常的追踪信息，然后快速的调试程序？
 * 			打印出的异常堆栈追踪信息，从上往下一行一行看
 * 			须注意的是，：SUN写的代码不需要看(看包名区分)，这些肯定没错，需要看的是自己的代码
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		
		try {
			m1();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			//打印异常堆栈追踪信息
			//在实际开发中要写上下行的代码，出了问题方便查找解决
			e.printStackTrace();
			/*
			 * 
	java.io.FileNotFoundException: C:\User\taobao.txt (系统找不到指定的路径。)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at java.io.FileInputStream.<init>(Unknown Source)
	at d异常类中的两个重要方法.ExceptionTest02.m3(ExceptionTest02.java:54)
	at d异常类中的两个重要方法.ExceptionTest02.m2(ExceptionTest02.java:49)
	at d异常类中的两个重要方法.ExceptionTest02.m1(ExceptionTest02.java:45)
	at d异常类中的两个重要方法.ExceptionTest02.main(ExceptionTest02.java:17)
			 */
			//异常信息的表述理解
			//55行出问题，导致了50行出问题
			//50行出问题，导致了46行出问题
			//46行出问题，导致了17行出问题
			//就是说根源错误出在第55行代码
		}
		
		System.out.println("哦i速度加啊四十多斤");
		
	}
	public static void m1() throws FileNotFoundException {
		m2();
	}
	
	public static void m2() throws FileNotFoundException {
		m3();
	}

	public static void m3() throws FileNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("C:\\User\\taobao.txt");
		
	}

}
