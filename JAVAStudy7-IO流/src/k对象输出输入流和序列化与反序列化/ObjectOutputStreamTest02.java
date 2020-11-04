package k对象输出输入流和序列化与反序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import bean.User;

/*
 * 	序列化可以一次性序列化多个对象
 * 			方法是将对象放进集合中，将集合序列化
 * 以及【transient关键字】
 * 					如果不想对象中的某个字段不参与序列化，可以在对象的类中该字段前面添加transient关键字
 * 					表示该字段是游离的，这样对象被序列化时该字段不会被序列化了
 * 			效果就是反序列化后的每个对象中这个字段没有创建对象时所赋的值，都是系统给的默认值0，或null
 * 			原因就是反序列化时需要new对象，由于该字段没有被序列化，被默认赋值
 */

public class ObjectOutputStreamTest02 {
	
	public static void main(String[] args) {
		
		//创建ArrayList集合
		ArrayList<User> list = new ArrayList<>();
		
		//往集合list添加元素，这里是对象
		list.add(new User(10, "阿宝"));
		list.add(new User(20, "谢广坤"));
		list.add(new User(40, "贾宝亮"));
		list.add(new User(26, "段坤"));
		list.add(new User(1062, "曹阿满"));
		
		ObjectOutputStream oos =null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("user"));
			
			//将集合进行序列化，就可一次序列化多个对象了
			//需要注意的是不仅是集合中对象的类要实现Serializable接口，集合类也要实现，看源码发现已经实现了
			oos.writeObject(list);
			
			oos.flush();
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			if (oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
		
	}

}
