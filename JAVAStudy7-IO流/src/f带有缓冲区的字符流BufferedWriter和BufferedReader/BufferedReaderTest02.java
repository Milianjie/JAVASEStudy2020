package f带有缓冲区的字符流BufferedWriter和BufferedReader;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 	InputStreamReader：字节转字符的输入转换流
 */

public class BufferedReaderTest02 {
	
	public static void main(String[] args) {
		
		BufferedReader reader = null;
		
		try {
			
//			//这里是字节输入流
//			FileInputStream in = new FileInputStream("src/aIO流的理解/IO流的笔记");//相对于temp来说，in是节点流
//			
//			//由于字节流不能直接作为参数放进缓冲字符流，字节和字符是不同的，这时需要一个转换流
//			//这是一个字节转字符是输入转换流
//			InputStreamReader temp = new InputStreamReader(in);//相对于in来说，temp是包装流；而相对于reader来说，temp又是节点流了
//			
//			//字符缓存输入流
//			 reader = new BufferedReader(temp);//相对于temp来说，reader是包装流
			
			 //三个可合并
			 reader = new BufferedReader(new InputStreamReader(new FileInputStream("src/aIO流的理解/IO流的笔记")));
			
		} catch (FileNotFoundException e) {
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
