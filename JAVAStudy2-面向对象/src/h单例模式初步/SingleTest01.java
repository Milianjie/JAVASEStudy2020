
package h单例模式初步;

public class SingleTest01 {
	
	public static void main(String[] args){
		
		
		Singleton u1 = Singleton.set();//当要调用方法到不是本类中，类名. 不能省
		Singleton u2 = Singleton.set();//Singleton.set=s = new Singleton()
		
		System.out.println(u1==u2);

}
}