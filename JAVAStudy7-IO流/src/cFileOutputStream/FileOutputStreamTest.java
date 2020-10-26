package cFileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		【文件字节输出流，负责写】
 * 		从内存到硬盘
 */

public class FileOutputStreamTest {
	
	public static void main(String[] args) {
		
		FileOutputStream fos1 = null;
		FileOutputStream fos2 = null;
		
		try {
			//在new输出流时，构造方法中的路径填写的是没有创建的文件会自动创建
			
			//用下面方式new出的输出流对象，在将数组中的字节写到文件中时会清空原文件中的内容，要谨慎使用
			fos1 = new FileOutputStream("test03");
			
			
			//下面new出的输出流对象，是不会清空文件中原有的字节而写进去的，是一种追加写入的方式
			fos2 = new FileOutputStream("test04",true);
			
			
			//创建一个byte数组
			byte[] bytes = {97,98,99,100,101,102,103,104,105};
			
			
			//不追加输出流对象一次性写所有字节进文件
			fos1.write(bytes);//文件中是abcdefghi --再写第二次仍然是abcdefghi，这个输出流对象并不是追加写入的
			//将数组中的字节一部分写出
			//fos1.write(bytes, 0, 2);
			
			
			//追加输出流对象一次性写所有字节进文件
			fos2.write(bytes);//文件中是abcdefghi --再写第二次仍然是abcdefghiabcdefghi，这个输出流对象是追加写入的
			//将数组中的字节一部分写出
			//fos2.write(bytes, 0, 2);
			
			
			//最后要刷新输出流
			fos1.flush();
			fos2.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {					//分开try是最好的
			if (fos1 != null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (fos2 != null) {
				try {
					fos1.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
