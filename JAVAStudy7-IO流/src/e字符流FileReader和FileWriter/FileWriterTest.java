package e字符流FileReader和FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 	FileWriter：文件字符输出流，写
 * 		只能写普通文本
 */

public class FileWriterTest {
	
	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {
			
			writer = new FileWriter("我的区长父亲",true);//自动追加字符输出流
			
			char[] chars = {'	','	','	','	','	','	','	','	','	','	','	','	','	',
			'我','的','区','长','父','亲','\n'};
			
			writer.write(chars);
			for (int i = 0; i < chars.length; i++) {
				writer.write("                                                              我是一名Java工程师                                                                                            \n ");
				
			}
			//刷新
			writer.flush();
			
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
