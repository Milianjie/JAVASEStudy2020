package d文件的拷贝;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 【使用FileInputStream和FileOutputStream完成文件的拷贝】
 * 		理解：拷贝的过程应是一边读一边写。
 * 		使用上面的字节流拷贝文件是万能的，因为字节流读和写都是以字节byte为单位的，或者说读的和写的是8个位（bit）的二进制形式
 * 		而所有的文件在机器中都是以二进制的形式存在的，明面上文件最小单位是字节，1024byte=1KB，1024KB=1MB，1024MB=1GB...
 * 		所以上面的流可以使用任何类型的文件
 */

public class CopyTest {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			
			fis = new FileInputStream("F:\\www\\SAR.docx");
			
			fos = new FileOutputStream("D:\\SAR.docx");
			
			//定义byte数组大小，决定每一次拷贝的大小
			byte[] bytes = new byte[1024*1024];//1024byte =1kB;1kB * 1024 = 1MB -->每次拷贝1MB
			
			//定义存储每次读进来的字节数
			int readCount = 0;
			
			//循环，读取一部分，写进一部分
			while ((readCount = fis.read(bytes)) != -1) {
				
				fos.write(bytes,0,readCount);
				
			}
			
			//最后要刷新
			fos.flush();
			
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
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
