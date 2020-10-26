package e字符流FileReader和FileWriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 	字节输入流FileReader，只能读取纯文本文件
 * 		
 */

public class FileReaderTest {
	
	public static void main(String[] args) {
		
		FileReader reader = null;
			
		try {
			
			reader = new FileReader("src/aIO流的理解/IO流的笔记");
			
			//创建char数组
			char[] chars = new char[2];//一次读两个字符
			
			int readCount = 0;//每次读取到char数组的字符数
			
			while ((readCount = reader.read(chars)) != -1) {
				
				//读取多少个字符，就转换成字符串输出
				String string = new String(chars, 0, readCount);
				System.out.print(string);
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (reader != null) {
				
				try {
					reader.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
				
			}
		}
		
		
	}

}
