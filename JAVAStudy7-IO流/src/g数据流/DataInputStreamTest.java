package g数据流;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 		DataInputStream：数据字节输入流。
 * 		
 * 		DataOutputStream写的文件只能由DataInputStream来读取，同时还得知道写进去的顺序
 */

public class DataInputStreamTest {
	
	public static void main(String[] args) {
		
		DataInputStream inputStream = null;
		
		try {
			//创建字节数据输入流，往构造方法放一个字节文件输入流对象
			inputStream = new DataInputStream(new FileInputStream("data"));
			
			//读
			byte b = inputStream.readByte();
			short s = inputStream.readShort();
			int i = inputStream.readInt();
			long l = inputStream.readLong();
			float f = inputStream.readFloat();
			double d = inputStream.readDouble();
			boolean sex = inputStream.readBoolean();
			char c = inputStream.readChar();
			
			//在读取的时候，读int类型时方法没有加Int，而是直接int i = inputStream.read();
			//使得后面大部分数据都变形出错了
			System.out.println("b = "+b);
			System.out.println("s = "+s);
			System.out.println("i = "+i+1000);
			System.out.println("l = "+l);
			System.out.println("f = "+f);
			System.out.println("d = "+d);
			System.out.println(sex?"男":"女");
			System.out.println("c = "+c);
			
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
