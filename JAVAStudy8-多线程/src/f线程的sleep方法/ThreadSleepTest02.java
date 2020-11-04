package f线程的sleep方法;

/*
 * 【如何唤醒一个正在睡眠的线程，强行终止睡眠】
 */

public class ThreadSleepTest02 {
	
	public static void main(String[] args) {
		
		MyThread02 myThread02 = new MyThread02();
		
		Thread thread = new Thread(myThread02);
		
		thread.setName("t1");
		
		thread.start();
		
		//希望在5秒后终止线程t1的睡眠,此处让主线程睡眠5秒，执行终止t1线程休眠的方法
		try {
			Thread.sleep(1000*5);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		thread.interrupt();//通过该方法，使得该线程对象中的睡眠语句报异常，执行catch语句块从而结束try/catch语句块。使得线程该语句块下面的代码得以执行
		//控制台输出的信息
		/*
			t1线程-->开始启动
			java.lang.InterruptedException: sleep interrupted
			t1线程-->结束
			at java.lang.Thread.sleep(Native Method)
			at f线程的sleep方法.MyThread02.run(ThreadSleepTest02.java:46)
			at java.lang.Thread.run(Unknown Source)
			
			
		 */
		
	}

}

class MyThread02 implements Runnable{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
		System.out.println(Thread.currentThread().getName()+"线程-->开始启动");
		
		try {					//由于该run方法是重写的，父类中的run方法没有抛出异常，所以此处只能try/catch该异常，不能抛异常
			//子类中重写的方法不能比被重写的方法抛出更宽泛的异常
			Thread.sleep(1000*60*60*24*360);//让该线程睡眠一年
		
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();//如果不希望终止线程输出异常信息，可以把此句删掉
		}
		
		
		System.out.println(Thread.currentThread().getName()+"线程-->结束");
	}
	
}