package bFileInputStream初识;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 在类FileInputStreamTest01中读取硬盘中的文件，一个字节一个字节的，内存与硬盘交互太频繁，不太好
 * 
 * read()方法构成了重载，我们可以不用无参的read方法，用下面有参的read方法
 * 
 * 	int read(byte[] b)
 * 		一次最多读取b.length个字节
 * 		减少内存与硬盘的交互，提高执行效率
 * 		往byte[]数组当中读
 */

public class FileInputStreamTest02 {
	
	public static void main(String[] args) {
		
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		//如果在构造方法中直接填写文件名的话，该文件必须放在IDEA工程的根或者eclipse的项目目录下
		//因为IDEA和eclipse默认的绝对路径是到IDEA工程的根或者eclipse的项目根路径
		//如果文件存到绝对路径更深的路径的话，路径要跟所存到的各个文件名和包名
		try {
			fis1 = new FileInputStream("test01");
			
			//这里test02存到了本项目中的src文件中的bFileInputStream初识包下，下面读取文件错误，
			//但是建议路径不要有汉字或空格，这里是学习，可以忽略
			//fis2 = new FileInputStream("test02");//java.io.FileNotFoundException: test02 (系统找不到指定的文件。)
			//正确写法
			fis2 = new FileInputStream("src/aIO流的理解/IO流的笔记");
			
			
			//开始读取文件，采用byte数组，一次读取多个字节。最多读取“数组.length”个字节
			byte[] bytes = new byte[3];
			
			
			//该方法的返回值是：读取到的字节的数量。不是字节本身
			int readCount = fis1.read(bytes);//第一次读取到了3个字节，test01中共有五个
			System.out.println(readCount);//3
			//将byte数组转换成字符串
			//System.out.println(new String(bytes));//abc
			//应该是读取了多少个，转换多少个，而不是全部转换
			System.out.println(new String(bytes, 0, readCount));
			
			
			readCount = fis1.read(bytes);//第二次只能读取最后两个字节,将byte数组的前两个（下标0和1）元素覆盖掉，下标2的没有读到字节覆盖它，所以还是上次读到的字节
			System.out.println(readCount);//2
			//将byte数组转换成字符串
			//System.out.println(new String(bytes));//mnc
			//应该是读取了多少个，转换多少个，而不是全部转换
			System.out.println(new String(bytes, 0, readCount));
			
			
			readCount = fis1.read(bytes);//第三次没有字节可以读了返回-1，byte数组中还是上一次读到的字节
			System.out.println(readCount);//-1
			//将byte数组转换成字符串
			//System.out.println(new String(bytes));//mnc
			//应该是读取了多少个，转换多少个，而不是全部转换
			//System.out.println(new String(bytes, 0, readCount));//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: -1
			
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (fis1 != null) {
				try {
					fis1.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (fis2 != null) {
				try {
					fis2.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
