package c实现线程的方式;

/*
 * 【实现线程的第二种方式】编写一个类，实现java.lang.Runnable接口。
 * 
 * 		【注意】编程都是面向对象，也可以说面向接口编程，通过实现接口的方式实现线程，同时还可以让该类去继承其他的类
 * 				使这个类有更强的灵活实用性，多功能性。所以第二种方法是建议采用的
 */

public class ThreadTest02 {
	
	public static void main(String[] args) {
		
//		//创建一个可运行的对象
//		MyThread2 myThread = new MyThread2();
//		
//		//将可运行的对象封装成一个线程对象
//		Thread thread = new Thread(myThread);
		
		Thread thread = new Thread(new MyThread2());//合并代码
		
		//然后调用该线程对象的start方法，启动线程
		thread.start();
		
		//这里的代码还是运行在主线程中
		for(int i = 0;i < 10;i++) {
			System.out.println("主线程-->"+i);
		}
	
		
	}

}

//这个类并不是一个线程类，只是一个可运行的类。还不是一个线程
class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 0 ; i < 10 ;i++) {
			System.out.println("分支线程-->"+i);
		}
	}
	
}