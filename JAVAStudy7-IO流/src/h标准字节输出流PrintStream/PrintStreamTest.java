package h标准字节输出流PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/*
 * 	java.io.PrintStream:标准的字节输出流，默认情况下输出到控制台
 * 
 */
public class PrintStreamTest {
	
	public static void main(String[] args) {
		
		//一般输出到控制台，联合使用
		System.out.println("朴初珑小胖胖");
		
		//实际是System.out拿到的是标准流的一个类型引用变量，这样就可以调用PrintStream中的方法，如：
		//println()或者不换行的print()方法
		//【注意】标准流不需要手动关闭close()
		PrintStream pStream = System.out;//out是System类中定义的一个PrintStream类型的常量，其值out = null;
		
		//用pStream调标准流的方法
		pStream.println("曾志伟是伟哥");
		pStream.println("曹阿满无敌天下");
		pStream.println("精武门大战铁血战士");
		
		//之前System类使用过的如下：
//		System.gc();
//		System.arraycopy(src, srcPos, dest, destPos, length);
//		System.currentTimeMillis();
//		System.exit(0);
//		PrintStream pStream2 = System.out;
	
		//默认输出到控制台，其实可以改变其输出的方向，也就是以后用到的日志雏形,如下
		
		//方法里面需要一个标准输出流对象，而创建标准流对象的构造方法中又需要一个输出流对象，这个对象当然一般情况都是放输出流子类文件输出流对象
		//选择的标准输出流是字节的还是字符的看自己选择，但是标准输出流和文件输出流要一致是同一类型，当然你也可以利用转换流，这就很繁琐
		//那么改变输出方向正好是打印在传入的文件输出流对象包含的路径的指定文件
		//创建标准字节输出流，传入字节文件输出流对象，路径在本包下，自动创建
		PrintStream printStream;
		try {
			
			printStream = new PrintStream(new FileOutputStream("src/h标准字节输出流PrintStream/log1"));
			
			System.setOut(printStream);
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println("徐贤不要太美");
		System.out.println("朴智妍是小阿呆");
		
		
		
	}

}
