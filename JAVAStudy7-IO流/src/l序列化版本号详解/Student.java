package l序列化版本号详解;

import java.io.Serializable;

public class Student  implements Serializable{
	
		
		//JVM看到Serializable接口被实现后，就自动生成一个序列化版本号
		//这里没有手动写出来，JVM会默认提供一个序列化版本号
		//实现了Serializable接口的类，建议都手动提供一个序列化版本号，使得以后代码改动后保证是同一个类
		private static final long serialVersionUID = 16020520009L;//以后该类无论怎么改，都只用改序列化版本号
		
		private int num;
		
		private String name;
		
		//十年后需求的需要添加了地址字段
		private String addr;
		
		private int age;
		

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
