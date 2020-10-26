package jiangtang.com.k方法的重载;

/*
 *      关于方法重载(Overload)
 *      
 *      以下程序使用方法重载，分析优缺点：
 *      1.程序员只需要记忆很少的方法名，方便调用
 *      2.代码更加美观
 *      
 *      什么时候会发生方法的重载？
 *      1.发生在同一个类中
 *      2.方法名相同
 *      3.参数列表不同(类型、数量、类型顺序)
 *      4.和返回值类型无关
 *      5.和修饰符列表无关
 */

public class Test1 {
	//入口
	public static void main(String[] args){
		
		//对于程序员来讲只需要记忆一个方法名
		    System.out.println(Computer.sum(10,20));//是Computer.而不是Test01.
		    System.out.println(Computer.sum(10.2,20.3));
		    System.out.println(Computer.sum(10l,20l));
		    
		    
		  //分析System.out.println()是否构成方法的重载？
			System.out.println(10);
			System.out.println(3.14);
			System.out.println(true);
			System.out.println("hello world");
			//System.out是sun提供的PrintStream类型
			//println是printString类型的方法，该方法已经构成了重载
	}
	

}

class Computer{
	
	public static int sum(int a,int b){
		return a+b;
	}
	public static double sum(double a,double b){
		return a+b;
	}
	public static long sum(long a,long b){
		return a+b;
	}
	

}
