package d线程的周期;

/*
 * 【线程的生命周期有四个状态和一个阻塞状态】
 * 		1、【新建状态】：该状态下是刚new出来的一个线程对象
 * 
 * 		2、【就绪状态】：线程对象调用start方法进入就绪状态。该状态又称可运行状态，该状态下线程具有抢夺CPU时间片的能力
 * 					（CPU时间片就是执行权）。当一个线程抢夺到了CPU时间片之后，run()方法就开始执行，run方法开始执
 * 					行代表线程进入运行状态。
 * 
 * 		3、【运行状态】：该状态是线程对象run方法开始执行后进入，当之前抢夺的CPU时间片用完后，线程就会重新回到就绪状态，
 * 					又开始抢夺CPU时间片，抢夺后又进入运行状态，此时重新进入run方法，并且接着上次的代码继续执行。
 * 
 * 		【这样线程在就绪状态与运行状态之间频繁的来回切换，称为JVM的调度，让人感觉多线程并发】当run方法执行结束后弹栈后，线程就进入死亡状态
 * 
 * 		4、【死亡状态】：run方法执行完毕，线程死亡
 * 
 * 		5、【阻塞状态】：当在运行状态执行run方法时，run方法中的代码有如Scannar s = null;s.nextInt();这种接收用户键盘输入，或者调用sleep方法
 * 					等阻塞事件后，线程就进入了阻塞状态。此时该状态的线程就会释放抢夺到的CPU时间片。当解除该状态后进入就绪状态抢夺执行权，
 * 					然后接着run方法的阻塞代码之后代码执行run方法
 */


public class ThreadTest {	
	
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for(int i = 0; i<20; i++) {
					System.out.println("分支线程-->"+i);
				}
				
			}
		});
		
		thread.start();
		
		for(int i = 0; i<20; i++) {
			System.out.println("主线程-->"+i);
		}
		
		
	}

}