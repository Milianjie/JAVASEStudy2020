package e获取线程名字以及当前线程对象;

/*
 * 【获取当前线程对象的引用】static Thread currentThread() --返回对当前正在执行的线程对象的引用。 
 * 		用法：Thread t = Thread.currentThread();
 * 		这段代码放在一个方法中，返回的是方法运行于某个线程的那个线程对象（引用）或者说当前正在执行的线程对象
 * 		例如	下面代码中在MyThread运行类中run()方法和ThreadTest类中的m1()方法中添加Thread t = Thread.currentThread();
 * 		并通过t.getName()获取各自返回线程对象的名字，因为run方法是在"第一个"线程下运行的，m1方法是在"main"主线程下运行的
 * 		所以前者返回的是线程对象是"第一个"，后者是"main"。
 * 
 * 【给线程对象命名】
 * 		线程对象的引用.setName();
 * 
 * 【获取线程对象的名字】
 * 		线程对象的引用.getName();
 * 
 * 【当未给一个线程对象命名时的默认名字是？】
 * 			Thread-0
 * 			Thread-1
 * 			Thread-2
 * 			Thread-3
 * 			Thread-4
 * 				....
 */

public class TreadTest {
	
	public static void main(String[] args) {
		
		
		
		Thread t1 =new Thread(new MyThread());
		Thread t2 =new Thread(new MyThread());
		
		//给线程对象t1和t2命名
		t1.setName("第一个");
		t2.setName("第二个");
		
		//获取线程的名字
		t1.getName();//第一个
		t2.getName();//第二个
		
		//获取main方法运行所在线程即主线从的名字
		Thread t = Thread.currentThread();
		t.getName();//main
		
		//启动'第一个'线程
		t1.start();
		//运行m1方法
		m1();
		
	}
	
	public static void m1() {
		
		for(int i = 0 ;i < 10;i++) {
			Thread thread = Thread.currentThread();
			System.out.println(thread.getName()+"线程-->"+i);
		}
		
	}

}

class MyThread implements Runnable{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
	for(int i = 0 ;i < 10;i++) {
		Thread thread = Thread.currentThread();
		System.out.println(thread.getName()+"线程-->"+i);
	}
	}
}
