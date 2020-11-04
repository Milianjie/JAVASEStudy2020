package l序列化版本号详解;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamTest {
	
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("src/l序列化版本号详解/student"));
			Object object = ois.readObject();
			System.out.println(object instanceof Student);//true
			System.out.println(object);
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (ois != null) {
				try {
					ois.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
