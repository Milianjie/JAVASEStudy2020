/*
 * 引入类继承最基本的作用是 代码重用
 * 就是子类继承父类，子类中包括了父类的方法
 * 
 *     语法：
 *     [修饰符列表] class 子类名 extends 父类名{
 *          类体;
 *     }
 *     java语言中，类和类之间只支持单继承
 *     
 *     一个类如果没有显示继承其他类，则该类默认继承Object类
 *     Object是sun提供的
 */
package i类的继承;

public class Sub extends SuperClass {
	
	public void m3(){
		
			System.out.println("m3...");
		
	}

}
