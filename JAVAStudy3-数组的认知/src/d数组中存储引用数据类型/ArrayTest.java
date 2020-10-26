package d数组中存储引用数据类型;

/**
 *						深入数组：数组中存放引用数据类型
 * 
 * @author 钟荣杰
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		
		Animal[] animals = {animal1,animal2};
		
		for (int i = 0; i < animals.length; i++) {
			Animal animal = animals[i];
			animal.move();
			//或者这样调用move方法,代码合并
			animals[i].move();
		}
		System.out.println("==============================>");
		//创建Animal类型数组，该数组不能存放其他类型的数据，却可以存放其子类型引用数据
		Animal[] animals2 = {new Cat(),new Bird()};
		
		//访问的是继承父类重写的方法，是向上转型，可直接访问
		for (int i = 0; i < animals2.length; i++) {
			animals2[i].move();
		}
		System.out.println("==============================>");
		
		//要访问子类对象特有的方法，须向下转型
		for (int i = 0; i < animals2.length; i++) {
			if (animals2[i] instanceof Cat) {
				Cat cat = (Cat)animals2[i];
				cat.eat();
			}else if (animals2[i] instanceof Bird) {
				Bird bird = (Bird)animals2[i];
				bird.sing();
			}
			
		}
		System.out.println("==============================>");
		
		}

}

class Animal{
	
		public void move() {
			
			System.out.println("动物跑啊跑.......");
			
		}
	
}

class Cat extends Animal{
	public void move() {
		System.out.println("猫在走猫步");
	}
	
	//Cat类特有的方法
	public void eat() {
		System.out.println("小猫要吃鱼.......");
	}
}
class Bird extends Animal{
	public void move() {
		System.out.println("Bird Fly");	
	}
	
	//Bird类特有的方法
		public void sing() {
			System.out.println("小鸟在唱歌.......");
		}
}