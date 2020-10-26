package bFileInputStream初识;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 	【最终版程序】掌握
 */

public class FileInputStreamTest03 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("src/aIO流的理解/IO流的笔记");
			
			//获取文本的长度，该文件有中文有英文，需要一次性读取全部字节才能避免乱码，这里获取该文件的长度作byte数组的长度
			File file = new File("src/aIO流的理解/IO流的笔记");//返回的是long类型的，byte数组中只允许定义int类型长度
			System.out.println(file.length());//3794
			//或者用FileInputStream中的available()方法获取未读取的字节数，而且返回的是int类型的
			System.out.println(fis.available());//3794
			
			//创建byte数组
			byte[] bytes = new byte[(int) file.length()];
			
			//将文件中的字节一次读取10个存到byte数组中，用while循环
//			int readdata ;
//			while ((readdata = fis.read(bytes)) != -1) {
//				
//				//读到多少个，就转化多少个，如果想像文件中的样式输出，不能用换行输出
//			System.out.print(new String(bytes, 0, readdata));//发现输出有些是乱码,如果读取的文件全是英文，那设置多少个一起读都没问题
//											//如果全是中文，应设置2个字节一起读，不出现乱码。如果中英混合，那就得全部字节一起读取出来才不乱码，
										//一次读出来就不需要循环了,或者采用字符输入流FileReader，读进char数组当中
//			}
			//一次性读取
			fis.read(bytes);
			System.out.println(new String(bytes));
			
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
