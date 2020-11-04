package f线程的sleep方法;

/*
 * 	【合理是终止线程的运行】
 * 		在实现Runnable接口的可运行类中（实现线程常用）或者继承Thread类的线程类中打一个布尔标记字段
 * 		如：boolean run = true;
 * 		然后构建条件语句，当run=true时执行线程，当run=false终止线程执行，具体如下程序所示
 */

public class ThreadSleepTest04 {
	
	public static void main(String[] args) {
		
		//为了控制可运行类中的布尔标记字段，不要合并代码，将运行类对象存到一个引用变量中方便改变run字段的值
		MyRunnable myRunnable = new MyRunnable();
		
		Thread thread = new Thread(myRunnable);
		
		thread.setName("线程终止测试");
		
		thread.start();
		
		//运行10秒后终止线程的执行
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		//10秒已过，终止线程运行
		System.out.println("10秒已过，线程'线程终止测试'终止运行");
		myRunnable.run = false;
		
	}

}

class MyRunnable implements Runnable{
	
	//布尔标记字段
	boolean run = true;
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<100;i++) {
			if (run) {
				System.out.println(Thread.currentThread().getName()+"线程："+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			} else {
				//终止当前线程执行
				return;
			}
		}
	}
	
}