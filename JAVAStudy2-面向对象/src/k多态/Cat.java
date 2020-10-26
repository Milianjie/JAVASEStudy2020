package k多态;

//子类1
public class Cat extends Animal {
	
	//重写
	public void eat(){
		System.out.println("猫吃鱼!");
	}
	
	//成员方法
	public void move(){
		System.out.println("猫走猫步!");
	}

}
