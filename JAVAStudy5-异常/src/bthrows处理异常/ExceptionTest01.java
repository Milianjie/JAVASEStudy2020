/*
 *  处理异常有两种方式
 *        1.声明抛出，throws
 *        2.捕捉，try...catch...finally
 *        
 *        以下文件演示：声明抛出，在方法声明的位置上使用throws向上抛出异常
 */
package bthrows处理异常;

import java.io.*;

public class ExceptionTest01 {
	
	public static void main(String[] args) throws FileNotFoundException{
	//public static void main(String[] args) throws IoException{  抛出异常的父类
	//public static void main(String[] args) throws Exception{    抛出异常的父类的父类都行
	
		//java编译器不是那么智能，因为FileInputStream类的构造方法
		//在声明的位置上使用了throws FileNotFoundException
		//所以要在此程序的编写阶段在该方法声明上抛出该异常或该异常的父类或父父类异常，不然编译不通过
		//当然也可以用try/catch语句，用将可能抛出异常的语句放入try语句块中，然后catch异常，就不用
		//在方法声明后面throws了
		
		//创建文件输入流(流：stream)，读取文件
		FileInputStream fis = new FileInputStream("C:/ab.txt");//C盘下没有此文件
		//抛出异常后编译没有了异常
		
		//以上程序编译不通过
		/*
		 * 未处理的异常类型
          FileNotFoundException
		 */
	}

}
