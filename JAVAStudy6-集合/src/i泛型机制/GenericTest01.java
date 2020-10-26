package i泛型机制;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 1、JDK5之后推出的新特性：泛型
 * 2、泛型这种语法机制，只是早程序编译阶段起作用，仅仅是给编译器做参考的。运行阶段泛型是不起作用的
 * 3、泛型的好处：
 * 			1、使集合中存储的元素统一
 * 			2、当遍历集合时，如果使用了泛型，取出的元素类型是泛型指定的类型，调用返回类型的方法就不需要大量的向下转型了
 * 4、泛型的缺点：
 * 			1、集合中存储元素缺少了多样性
 * 			泛型只是简化了程序某一阶段实现，有些需强制类型转换的过程还是不可避免
 */

public class GenericTest01 {
	
	public static void main(String[] args) {
		
		//以下程序中集合使用了泛型
		//创建List类型集合
		List<Animal> list = new ArrayList<Animal>();
		
		//创建cat和bird的对象,并将其放进集合,只能放泛型指定类型及其子类的对象，放其他就会编译报错
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		list.add(cat);
		list.add(bird);
		
		//迭代/遍历集合  迭代器也要使用泛型
		for (Iterator<Animal> iterator = list.iterator(); iterator.hasNext();) {
			Animal animal = iterator.next();
			//调用继承Animal类中的方法就不需要向下类型转换了
			animal.move();
			
			//如果想调用子类中特有的方法，还是得向下类型转换，该有的还得有，泛型不能解决所有
			if (animal instanceof Cat) {
				Cat c = (Cat)animal;
				c.catchMouse();
			}
			if (animal instanceof Bird) {
				Bird b = (Bird)animal;
				b.fly();
			}
		}
	}

}

class Animal{
	//Animal中的方法
	public void move() {
		System.out.println("animals is moving.");
	}
}

class Cat extends Animal{
	//Cat特有的方法
	public void catchMouse() {
		System.out.println("The cat is catching the mouse!");
		
	}
}

class Bird extends Animal{
	//Bird特有的方法
	public void fly() {
		System.out.println("The bird is fyling!");
		
	}
}

