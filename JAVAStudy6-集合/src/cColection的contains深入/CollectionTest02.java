package cColection的contains深入;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 		contains方法源码与remove源码解析：
 * 			以上两种方法被调用时底层都会调用集合存储的对象的所属类中的equals方法
 * 			如果存储的对象的类没有重写其equals方法，调用上面两个方法时无法正常使用
 * 		
 * 		结论：存放在一个集合中的类型，一定要重写equals方法 ! ! !
 * 			   一个程序员一定要养成重写equals方法的习惯
 */

public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//创建集合对象
		Collection c = new ArrayList();
		
		//创建两个用户对象
		User u1 = new User("lisiguang",20);
		User u2 = new User("lisiguang",20);
		
		//往集合添加元素
		c.add(u1);
		
		//判断集合中是否包含u2
		
		//由于User类在未重写其equals方法，contains底层用该类对象调用equals方法比较就是比较内存地址，输出为false
		//System.out.println(c.contains(u2));//false
		
		//重写User类中的equals方法后再用contains
		System.out.println(c.contains(u2));//true
		
	}

}

class User{
	
	private String name;
	private int age;
	
	public User() {
		// TODO 自动生成的构造函数存根
	}
	
	public User(String name,int age) {
		// TODO 自动生成的构造函数存根
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO 自动生成的方法存根
		if (null == obj || !(obj instanceof User)) {
			return false;
		}
		
			User user =(User) obj;
		
		if (this == obj) {
			return true;
		}
		User u = (User)obj;
		return u.name.equals(name) && u.age==age;
	}
	
}
