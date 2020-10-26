/*
 *    深入throws
 */
package bthrows处理异常;

import java.io.*;//*表示调用java.io包下的所有类
//import 后面的包名最后的.xxx表示类名

public class ExceptionTest02 {
	
	public static void main(String[] args) throws FileNotFoundException{
		
		/*
		 * 
		m1();
		
		
		使用throws处理异常不是真正处理异常，而是推卸责任
		 * 
		谁调用就抛给谁，如果往上抛异常的过程中，每个方法都是采用throws的方式处理异常，而不是抓住解决异常
		 * 的话，最终会抛给JVM，而JVM就会终止程序的运行
		 * 
		 * 
		上面的m1方法如果出现了异常，因为采用的是上抛给了JVM
		JVM遇到这个异常就会退出JVM下面的代码不会执行
		System.out.println("shkjhakjf");
		*/
		
		//真正的处理，尝试运行m1,m1方法调用m2，m2调用m3，m3中new FileInputStream对象，调用该类构造方法
		//此时将参数即文件地址的字符串传入进去，发现地址无效或没有相应内容，new了一个FileNotFoundException对象
		//由于源代码中new的前面有个关键字throw，所以发生异常，而FileInputStream类的构造方法采用的是
		//向上throws抛出该异常，m3调用该构造方法，异常给了m3，
		//m3不解决抛给了m2，m2也不解决抛给m1，m1不解决往上抛，被catch捕获，然后对异常进行处理
		//你可以在异常刚产生时try/catch，立马解决异常，也可以让它抛到指定方法解决异常
		try{
			m1();
		}catch(FileNotFoundException e){}
		System.out.println("文件不存在，可能是路径错误，也可能文件被删除!");//钟荣杰无敌
	}
	//相当于异常抛到此处时不在往上抛，处理掉了
	
public static void m1() throws FileNotFoundException{
m2();	
}
public static void m2() throws FileNotFoundException{
m3();	
}
public static void m3() throws FileNotFoundException{
	new FileInputStream("C:/ab.txt");//FileInputStream构造方法声明位置上使用throws(向上抛)
}


}
