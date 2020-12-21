package k对象输出输入流和序列化与反序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * 		流对于文件有读和写，即发生在硬盘与内存之间
 * 		那么对于对象在内存与硬盘中是怎么实现交互的呢？
 * 	序列化：内存中的对象要存到硬盘文件中，需要将该对象拆分，即序列化Serialize，将对象分成一块一块的有序号的东西，然后保存存到硬盘文件中
 * 	反序列化：硬盘中所拆分的对象重新恢复到内存中，叫反序列化DeSerialize，此时根据序号将拆分的对象块组装成原来的对象，传到内存中
 * 
 * 【实现序列化与反序列化如下】要求是要序列化的对象一定得实现Serializable接口，该接口是标志性接口，里面并没有方法，
 * 							  实现该接口只是让这个类在被加载时让JVM特殊对待，例如现在Student类实现了这个接口使得
 * 							  其对象可以可序列化。java虚拟机看到该接口后会为这个类自动生成一个序列化版本号。
 */


public class ObjectOutputStreamTest {
	
	public static void main(String[] args) {
		
		//创建Student对象
		Student student = new Student(1004,"zhanshan");
		
		ObjectOutputStream ooStream = null;
		ObjectInputStream oiStream = null;
		
		try {
			//序列化
			ooStream = new ObjectOutputStream(new FileOutputStream("student"));//需要节点流
			ooStream.writeObject(student);
			//如果这里还想序列化第二个对象会报错，所以像序列化多个需要放进集合，序列化集合
			
			
			//反序列化
			oiStream = new ObjectInputStream(new FileInputStream("student"));
			//返回的是一个学生对象
			Object obj = oiStream.readObject();
			System.out.println(obj);//所以调用Student类的toString方法
	
			ooStream.flush();
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
			if (ooStream != null) {
				try {
					ooStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
			if (oiStream != null) {
				try {
					oiStream.close();
				} catch (IOException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}

}

class Student implements Serializable{
	
	//JVM看到Serializable接口被实现后，就自动生成一个序列化版本号
	//这里没有手动写出来，JVM会默认提供一个序列化版本号
	
	private int num;
	
	private String name;

	public Student() {
		super();
	}

	public Student(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//重写toString方法
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}
	
	
	
	
}