/*
 *     程序在执行的过程中参数的传递问题:
 *     1.传递的参数是基本数据类型
 *     2.传递的参数是引用数据类型
 */
    //以下程序传递基本数据类型
package f程序执行参数传递问题;

public class Test02 {
	
	public static void m1(Animal a){//有static的方法，懂？
		a.age++;
		System.out.println("age-->"+a.age);//101
		
	}	
	//无论在哪里此处都是程序的入口,最先执行此处
	public static void main(String[] args){
		
		//创建一个Animal类的对象
		Animal b = new Animal(100);
		m1(b);
		System.out.println("age-->"+b.age);//101
	}

}
class Animal{
	int age;
	public Animal(int _age){
		this.age=_age;//this可省略,但省略该赋值语句左右两边不能相同
	}
}
/*   思路：1.先创建一个可以调用的类
 *         2.再在这个类中写一个构造方法
 *         3.然后到main方法中创建一个Animal类的对象，
 *         创建完后用构造方法Animal()给age赋值，并把该对象的age内存地址
 *         赋给引用"a"，设a=0x1234
 *         4.调用m1
 *         5.此时m1中Animal型的局部变量a=0x1234
 *         6.a.age++就是访问对象的age并自加1
 *         7.此时堆中对象的age值是101
 *         8.弹栈到main方法时去访问的age就是101
 *         9.这就是引用类型数据的参数传递
 *         总结：
 *         传的是内存地址
 *         参数传递改变了访问对象的属性，导致所有访问对象的语句都一致变化
 * 
 */
