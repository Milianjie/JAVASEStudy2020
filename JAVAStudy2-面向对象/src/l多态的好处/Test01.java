/*
  *   多态的好处：
 *        1.使用多态可以使代码与代码之间的耦合度降低
 *        2.项目的扩展能力增强
 */
package l多态的好处;

public class Test01 {
	
	public static void main(String[] args){
		
		//创建主人
		Person milen = new Person();
		
		//创建宠物
		Dog d = new Dog();
		Cat c = new Cat();

		
		//喂
		milen.feed(d);//此时调用Animal a = d;
		milen.feed(c);//此时调用Animal a = c;
		
		d.name();//子类中的name方法
		milen.test(d);//父类中的静态方法
		
		//所以在方法覆盖中静态方法不建议重写，因为多态的好处项目代码多数使用多态，此间不调用子类的静态方法，重写了也没有意义
	}

}
