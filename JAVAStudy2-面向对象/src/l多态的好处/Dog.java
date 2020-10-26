/*
 * 宠物
 */
package l多态的好处;

public class Dog extends Animal{
	
	public void eat(){
		System.out.println("主人在喂狗");
	}
	
	public static void name() {
		
		System.out.println("能否覆盖静态方法");
		
	}

}
