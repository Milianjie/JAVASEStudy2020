package l序列化版本号详解;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 【序列化版本号的作用】
 * 			1、十年前，Student类实现了Serializable接口，进行编译，生成.class文件时JVM默认给了其一个序列版本号，将Student类对象进行了序列化，反序列化能进行；
 * 			十年后，由于需求的改变，需要改动Student类中的代码，如添加了学生的地址或电话字段，重新编译生成新的.class文件，JVM又默认给
 * 			了一个新的序列化版本号，当此时并没有进行序列化，只是进行反序列化时，报了以下异常：
 * 			java.io.InvalidClassException: l序列化版本号详解.Student; 
 * 			local class incompatible: stream classdesc serialVersionUID = -532431968437790278,
 * 			local class serialVersionUID = -3367965350685223874
 * 			意思是当前流中的序列化版本号stream classdesc serialVersionUID = -532431968437790278，现在重新编译后的
 * 			与本地的序列化版本号local class serialVersionUID = -3367965350685223874就是十年前序列化放置Student的版本号不一致，没法反序列化
 * 			
 * 			2、java语言中区分类首先是根据类名，再是根据其序列化版本号（当然前提是实现了Serializable接口）
 * 			有时候多个人写了在同一个包下写了类名相同的两个类，两个都实现了Serializable接口编译后JVM默认给两个类一个序列化版本号，
 * 			JVM就根据它们的序列化版本号来区分它们
 * 
 * 			3、让java虚拟机自动给类提供序列化版本号，使得代码在后期无法修改，不方便。可以考虑自己手动提供该类的序列化版本号
 * 			参考已实现了Serializable接口的String类，ArrayList集合类，因为在JDK版本的更新中，这些类也会更新代码，所以SUN公司
 * 			都给它们手动提供一个序列化版本号
 * 			
 */

public class ObjectOutputStreamTest {
	
	public static void main(String[] args) {
		
		//创建一个student对象
		Student s = new Student(10, "是江户时代");
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("src\\l序列化版本号详解\\student"));
			
			oos.writeObject(s);
			
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
