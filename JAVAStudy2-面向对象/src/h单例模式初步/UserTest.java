
/*
 *   单例模式是23种设计模式中最简单的模式
 *   主要作用：
 *           为了保证JVM中某一个类型的java对象永远只有一个。
 *           为了节省内存开销
 */
package h单例模式初步;

public class UserTest {
	
	public static void main(String[] args){
		
		
	User u1 = new User();
	User u2 = new User();
	
	//如果==两边都是基本数据类型，则比较这两个基本数据的大小
	//如果==两边都是引用数据类型，则比较的是内存地址是否相同
	System.out.println(u1==u2);//false
	//u1.setName("dshkasjh");
	System.out.println(u1.getName());
	System.out.print(u1.age);

	}
	
}
