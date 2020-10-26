/*
 *    1.如何定义抽象类
 *      class关键字前加abstract
 *      
 *    2.抽象类无法被实例化
 *    
 *    3.虽然抽象类没有办法实例化，但是抽象类也有构造方法
 *      该构造方法是给子类创建对象用的
 *      
 *    4.抽象类中可以定义抽象方法
 *      语法：在方法的修饰符列表中添加abstract关键字，并且抽象方法应该以;结束
 *            不能带有{}
 *    
 *    5.抽象类中不一定有抽象方法，但抽象方法只能出现在抽象类中
 *    
 *    6.一个非抽象类继承抽象类，必须在子类中将父类的抽象方法覆盖(重写、实现)
 *    
 *    7.抽象类不能被final修饰
 *      抽象方法不能被final修饰，就是说final与abstract不能共存
 */
package o抽象类;

public abstract class A {
	
	//抽象方法
	public abstract void m1();
	
	//Constructor
	public A(){
		System.out.println("A...");
	}
	
	//入口
	public static void main(String[] args){
		
		//抽象类无法创建对象
		//A a=new A();
		
		//多态
		A b = new B(); //父类型引用指向子类型对象
		//输出为： A...
		//        B...
	}

}
class B extends A{
	
	public  void m1(){//因为B为非抽象类，所有重写的抽象方法是一个成员方法
		
	}
	
	B(){
		//此处隐藏super();
		System.out.println("B...");
	}
}
