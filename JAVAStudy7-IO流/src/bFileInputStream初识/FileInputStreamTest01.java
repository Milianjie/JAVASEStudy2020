package bFileInputStream初识;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	【java.io.FileInputStream】
 * 		1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读取
 * 		2、就是以字节的方式来完成输入的操作，完成读的操作（从硬盘-内存）
 */

public class FileInputStreamTest01 {
	
	public static void main(String[] args) {
		
		//将fis定义在try语句外面，扩大字节文件输入流对象使用范围
		FileInputStream fis = null;//此处的fis变量一定要初始化为null，因为如果创建流失败，fis仍然为null，下面的if语句才好判断执行，不然报错
		
		
		//文件路径E:\JAVAStudy\javaSE\test01 （idea或eclipse会自动把\变为\\,因为java中单斜杠\表示转义，\\这样才能表示单斜杠本身
		//main方法中一般都是try/catch异常，很少throws
		try {
			
			//创建字节文件输入流对象
			fis = new FileInputStream("E:\\JAVAStudy\\javaSE\\IO\\test01");
			//除了上面这样的路径，还可以写成下面这样，但都是绝对路径
			//fis = new FileInputStream("E:/JAVAStudy/javaSE/test01");
			
			//开始读取文件，一个一个读
			//test01中存的是abcd  在第一次调用read()方法前有一指针指在a的前面，第一次调用read方法，由于是字节流读取的，指针移动一个字节，
			//指向a，第二次调用read方法指针又往下移动一个字节，然后指向b。虽然Java中一个字符，如'a'或者'中'，占两个字节，但是文件是存在windows系统中的
			//Windows中一个一个字符占一个字节，一个汉字字符才会占两个字节.所以指针移动一个字节就会指向b，如果有空格的话也会被读取，空格也是字符
			//当指向空时就会返回-1
			//返回的是读出的字符的ASCII码，所以是int类型
//			int readdata = fis.read();
//			System.out.println(readdata);//97
//			
//			readdata = fis.read();
//			System.out.println(readdata);//98
//			
//			readdata = fis.read();
//			System.out.println(readdata);//99
//			
//			readdata = fis.read();
//			System.out.println(readdata);//-1
//			
			/*
			 * 使用循环读取文件,以后使用这个循环读取文件
			 */
			int readdata ;
			while ((readdata = fis.read()) != -1) {
				System.out.println(readdata);
			}

			
		} catch (FileNotFoundException e) {//构造方法FileInputStream()抛出的编译时异常
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {//read()方法抛出的编译时异常
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
