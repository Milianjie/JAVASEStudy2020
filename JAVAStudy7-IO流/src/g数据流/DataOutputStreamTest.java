package g数据流;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 		java.io.DataOutputStream:数据专属流，该流的构造函数要放一个OutputStream类的流，当然子类也行
 * 
 * 		这个流可以连同数据的类型一并写入文件，
 * 		这个文件就不是普通文本文档了，用记事本打不开的。只能创建数据输入流进行读取，而且读取的顺序要和文件写入的顺序一样
 */
public class DataOutputStreamTest {
	
		public static void main(String[] args) {
			
			DataOutputStream outputStream = null;
			
			try {
				
				//创建数据专属的输出流，包装流。该流的构造函数中可以new一个节点流，可以是FileOutputStream
				outputStream = new DataOutputStream(new FileOutputStream("data"));
				
				//声明数据变量
				byte t = 97;
				short s = 200;
				int i = 100;
				long l = 100L;
				double d = 3.14;
				boolean sex = true;
				char c = 'A';
				float f = 3.0F;
				
				//写入文件
				outputStream.writeByte(t);
				outputStream.writeShort(s);
				outputStream.writeInt(i);
				outputStream.writeLong(l);
				outputStream.writeFloat(f);
				outputStream.writeDouble(d);
				outputStream.writeBoolean(sex);
				outputStream.writeChar(c);
				
				//刷新输出流
				outputStream.flush();
				
			} catch (FileNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}finally {
				if (outputStream != null) {
					try {
						outputStream.close();
					} catch (IOException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
		}

}
