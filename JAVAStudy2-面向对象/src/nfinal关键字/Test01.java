package nfinal关键字;

public class Test01 {

}
/*
 * final修饰的类无法被击继承
 * 
 * final class A{}

   class B extends A{}//会报错
*/

//final修饰的方法无法被覆盖
/*
class A{
	public final void m1(){
		
	}
}
class B extends A(){
	
   public void m1(){//Multiple markers at this line
		            //- Cannot override the final method from A
		
		 
	}
}
*/

//final修饰的局部变量，一旦被赋值，不可再改变
/*
class A{
	public void m1(){
		//声明
		final int i;
		
		//第一次赋值
		i =1;
		
		//不能重新赋值
		i=2;//The final local variable i may already have been assigned
		
	}
}
*/

//final修饰的成员变量必须"显示的"初始化
/*
class A{
	
	//final修饰的成员变量必须手动的初始化
	//final int k;//The blank final field k may not have been initialized
	final int i=100;
	
	//成员
	final int k;
	
	//Constructor
	A(){
		k=200;//也就是说final修饰的成员变量必须在调用构造方法之前赋完值
	}
}
*/

//final修饰的成员变量一般和static连用
class MyMath{
	
	//此时称这样的变量为 常量 
	//java规范中要求所有的常量"大写"
	//常量：值不可再改变的量
	public static final double PI=3.14;
}