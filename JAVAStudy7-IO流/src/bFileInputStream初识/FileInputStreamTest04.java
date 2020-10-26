package bFileInputStream初识;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * FileInputStream中常用的方法：
 * 
 * 			1、int available(); 返回流当中剩余没有读到的字节数量
 * 			2、long skip(long n); 跳过几个字节不读
 */

public class FileInputStreamTest04 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("test01");
			
			byte[] bytes = new byte[fis.available()];//这种方式不适合太大文件，因为byte数组不能太大
			
			//文件字节数
			System.out.println("文件字节总数："+fis.available());//5
			
			//先读一个字节,然后获取剩余字节数
			//System.out.println(fis.read());
			//System.out.println("剩余未读文件字节数："+fis.available());//4
			
			//该方法的用处：用该方法获取文件字节数创建相应长度的byte数组，直接读取所有字节，不需要循环了
//			fis.read(bytes);
//			//转化成字符串输出
//			System.out.println(new String(bytes));
//			System.out.println("剩余未读文件字节数："+fis.available());//0
			
			//skip跳过几个字节不读，以后也会用到
			fis.skip(3);
			System.out.println(fis.read());//109  'm'
			
			
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
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
