/*
 *   1.super不是引用类型，super中存储的不是内存地址，super指向的不是父类对象
 *   2.super代表的是当前子类对象的父类型特征
 *   
 *   3.什么时候使用super
 *         子类和父类中都有某个数据，如都有name这个属性
 *         如果要在子类中访问父类中的name属性，需要使用  super.
 *         
 *   4.super可以用在什么地方
 *         一、super可以用在成员方法中，不能用在静态方法中
 *         二、super可以用在构造方法中
 */
//经理
package msuper关键字;

public class Manager extends Employ {
	
	String name="一块钱四个";
	
	//成员方法，子类将父类的方法重写了
	public void work(){
		System.out.println("经理在工作");
	}
	
	//成员方法
	public void m1(){
		
		work();//等于this.work();//输出为"经理在工作"
		super.work();//输出为"员工在工作"
		
		System.out.println(name);//窝窝头
		System.out.println(this.name);//窝窝头
		System.out.println(super.name);//一块钱四个 
	}
	/*
	 //super跟this相同，都不能用在静态上下文中
	public static void m2(){
		System.out.println(super.name);
	}
	*/

}
