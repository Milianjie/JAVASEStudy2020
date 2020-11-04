package k对象输出输入流和序列化与反序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.User;

/*
 * 反序列化集合
 * 
 */

public class ObjectInputStreamTest02 {
	
	public static void main(String[] args) {
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("user"));
			
//			Object object = ois.readObject();
//			//返回的是一个集合对象
//			System.out.println(object instanceof List);//true
			//就可以使用强转
			List<User> users = (List<User>)ois.readObject();
			//循环该集合
			for (User user : users) {
				System.out.println(user);
			}
			
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
