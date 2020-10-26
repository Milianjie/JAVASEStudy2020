/*
 *  处理异常第二种方式：捕捉...try...catch...
 *       
 *       语法：
 *           try{
 *           
 *           可能出现异常的代码;
 *           
 *           }catch(异常类型1 变量){
 *              处理异常的代码;
 *           }catch(异常类型2 变量){
 *              处理异常的代码;
 *           }....
 *           
 *           1.catch语句块可以写多个，因为try语句块中调的其他方法或者运行时都有可能抛出异常或产生异常
 *           但是要求是从上到下catch中的异常类型必须从小到大捕捉，大的在上边被捕捉，小的相当于也被捕捉
 *           也就不能再写小的异常捕捉了
 *           虽然可以直接写一个catch，里面给个最大异常类，但是不建议，因为精确的异常精确处理
 *           把所有可能出现的异常都分别catch，到时就可以根据精确异常的反馈精确的找出问题所在的具体原因
 *           
 */
package ctrycatch处理异常;

import java.io.*;

public class ExceptionTest03 {
	
	public static void main(String[] args){
		
		try{
			FileInputStream fis = new FileInputStream("C:/ab.txt");
		}catch(FileNotFoundException e){
			
		}
		
		/*以下代码无法被编译因为FileNotFoundException没有被处理
		try{
			FileInputStream fis = new FileInputStream("C:/ab.txt");
		}catch(ArithmeticException e){//捕捉的是算数异常
			
		}*/
		

		/*以下代码无法被编译
		 * 因为还有IOException没有被处理(read方法继承IOException)
		try{
		
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		}catch(FileNotFoundException e){
			
		}*/
		
		
		//以下代码编译可通过
		try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();//read方法在声明上抛出了IoException
			
		}catch(FileNotFoundException e){
			
		}catch(IOException e){
			
		}
		//或写成这样，但上面的方式好
        try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		}catch(IOException e){//这样捕捉的异常比较宽泛
			
		}
		
        
        /*编译无法通过
         * catch可以写多个，但是必须是有异常的代码从上到下，从小到大捕捉
         * 意思就是对照API，查以下每行有异常的代码的异常类哪个大哪个小，然后捕捉
        try{
			
			FileInputStream fis = new FileInputStream("C:/ab.txt");
			fis.read();
			
		})catch(IOException e){//此处已经捕捉了两个异常
			
		}catch(FileNotFoundException e{//上面已经捕捉过了，不能再捕捉
			
		}*/
	}

}
