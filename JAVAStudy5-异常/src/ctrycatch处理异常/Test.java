package ctrycatch处理异常;

/*
 * 			在以后的开发中，处理编译时异常选择上抛还是try/catch呢？
 * 				如果希望调用者处理，选择上抛throws
 * 				其他选择捕捉
 */

import java.io.*;

public class Test {
	
	/*
	public static void main(String[] args) throws FileNotFoundException,IOException{
		
		FileInputStream fis = new FileInputStream("abc");
	}
	或只抛出最大的
	public static void main(String[] args) throws IOException{
		
		FileInputStream fis = new FileInputStream("abc");
	}
	*/
    public static void main(String[] args){
		
    	try{
    		
    		//程序执行到此处发生了FileNotFoundExcception类型的异常
    		//JVM会自动new一个FileNotFoundExcception类型的对象，并且new对象时异常类的构造方法所放参数是"abc"
    		//将该对象的内存地址赋值给catch语句块中的e变量
    		FileInputStream fis = new FileInputStream("abc");
    		//上面的代码如果出现异常，try语句块的代码不再执行
    		//直接进入catch语句块执行，如：
    		System.out.println("FFFFFF");//无输出
    		
    		fis.read();
    		
    	}catch(FileNotFoundException e){//此处的e内存地址指向堆中的哪个对象
    		                            //是"FileNotFoundException类型对象"
    		
    		System.out.println("读取的文件不存在");//读取的文件不存在
    	
    		//异常类FileNotFoundException中将Object类中的toString方法重写，所以输出如下：
    		System.out.println(e);//java.io.FileNotFoundException: abc (系统找不到指定的文件。)
    		
    	}catch(IOException e){
    		
    		System.out.println("其他IO异常");//无输出
    		
    	}
    	//异常捕捉处理后下面代码可执行
    	System.out.println("ABC");//ABC
	}

}
/*  原理分析：
 *          JVM的底层：
 *          FileNotFoundException e =  new xxx;
 *          catch(e);
 *
 *          catch相当于一个方法：
 *          public static void catch(Exception e){
 *          }
*/