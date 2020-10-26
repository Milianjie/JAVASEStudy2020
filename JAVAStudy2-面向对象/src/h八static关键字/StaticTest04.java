/*
 *  static修饰的变量叫静态变量
 *         变量分类：
 *             1.局部变量
 *             2.成员变量(实例变量、非静态变量)
 *             3.静态变量(存储在方法区)
 *             
 *         什么时候变量声明成静态变量？
 *             如果这个属性所有的对象都有，并且此属性的值都是相同的，
 *             则该属性声明成静态变量
 *             
 *          成员变量：创建java对象的时候初始化
 *          静态变量：在类加载阶段赋值，并且只赋值一次
 *         
 */

package h八static关键字;

public class StaticTest04 {
	
	public static void main(String[] args){
		
		Animal a1 = new Animal("老虎",15656);
		Animal a2 = new Animal("Tiger",156155);
		
		System.out.println(a1.name+"的年龄是"+a1.age);
		System.out.println(a2.name+"的年龄是"+a2.age);
		
		//如何访问静态?(类名.)
		System.out.println(Animal.type);
		
		//也可以用  引用.
		System.out.println(a1.type);
		
		Animal a3;
		a3=null;
		System.out.println(a3.type);
		//静态变量底层访问的时候一定使用的  类名. 的方式，和对象无关，不出现空指针异常
	}

}

//抽象现实中的“陆生”动物
class Animal{
	
	//Filed
	//成员变量(一个对象一份)
	//成员变量在创建对象时初始化，并且存储在堆中的每一个对象中
	String name;
	int age;
	
	//静态变量，被存储在方法区中
	//所有的java对象共享这一份
	//所以静态变量是类级别的，使用"类名."方式访问
	static String type="陆生";
	Animal(){}
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
}