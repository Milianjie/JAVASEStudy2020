package jiangtang.com.l方法的执行过程;

/*
 *      使用图形画出以下程序的执行流程
 *      
 *      方法的执行原理：
 *                 方法在调用的时候，才会给该方法在内存中分配空间。
 *                 如果这个方法只是定义没有调用，则不会在内存中分配空间
 *          
 *          方法在调用的时候在“栈”中分配空间。(JVM内存中有一块内存是栈内存)
 *          方法调用其实就是“压栈”
 *          方法结束其实就是“弹栈”
 */


public class MethodProcess {
	 
	public static void main(String[] args){
		
		int i=100;//局部变量，只在main方法中有效
		
		m1(i);//压栈时，把i=100原原本本的复制给了m1中的局部参数变量i
		
		System.out.println("hello world");//4.执行到此语句main方法结束
	}
	public static void m1(int i){
		m2(i);//3.执行此调用语句m1方法结束
		System.out.println("m1方法中的i="+i);
	}
	public static void m2(int i){
		m3(i);//2.执行此调用语句m2方法结束
		System.out.println("m2方法中的i="+i);
	}
	public static void m3(int i){
		System.out.println("m3方法中的i="+i);//1.弹栈时，执行此java语句，然后m3方法结束
	}

}
