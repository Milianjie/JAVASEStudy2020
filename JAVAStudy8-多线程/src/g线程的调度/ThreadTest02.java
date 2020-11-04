package g线程的调度;

/*
 * 		【线程的让位】static void yield() --暂停当前正在执行的线程对象，并执行其他线程。 
 * 		静态方法：Thread.yield 
 * 		线程中执行该方法，使得该线程放弃当前持有的CPU时间片，让其他线程先执行，而自己返回到就绪状态抢夺CPU时间片
 * 		也有这样的可能，刚放弃去抢夺时间片立马又抢到CPU时间片的可能，线程又继续进入运行状态，继续执行上次未执行的run方法代码。
 * 	
 * 		看到下面程序中输出结果，t1线程输出到9之后i到10执行让位方法，必到main线程输出，虽然又少数不让位
 */

public class ThreadTest02 {
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyRunnable2());
		
		thread.setName("t2");
		
		thread.start();
		
		for(int i = 1;i <= 1000;i++) {
			System.out.println(Thread.currentThread().getName()+"线程-->"+i);
		}
		
	}

}

class MyRunnable2 implements Runnable{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i = 1;i <= 1000;i++) {
			
			//如果i达到100的整数，线程进行让位
			if (i%10 == 0) {
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName()+"线程-->"+i);
			
		}
	}
}