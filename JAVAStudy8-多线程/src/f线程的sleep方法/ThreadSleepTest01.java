package f线程的sleep方法;

/*
 * 		【关于线程的sleep()方法】
 * 		static void sleep(long millis) -- 在指定的毫秒数内让当前正在执行的线程休眠（暂停执行），此操作受到系统计时器和调度程序精度和准确性的影响。
 * 		1、静态方法：Thread.sleep(1000);
 * 		2、参数是毫秒
 * 		3、作用：让当前进程进入休眠，进入阻塞状态，使线程在指定时间内放弃占用CPU时间片，让其他线程使用 
 * 		Thread.sleep(1000*5);这段代码
 * 			放入A线程当中，使A线程进入休眠5秒钟
 * 			放入B线程当中，使B线程进入休眠5秒钟
 * 		4、sleep方法的效果：间隔特定的时间，去执行一段特定的代码，隔多久执行一次
 */

public class ThreadSleepTest01 {
	
	public static void main(String[] args) {
		
		
		try {
			//让当前线程进入休眠，5秒钟
			//当前线程是主线程main
			Thread.sleep(1000*5);
			
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//5秒后执行下面代码
		System.out.println("hello word");
		
		
		//这里新建一个线程，并命名
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				for(int i=0;i<6;i++) {
					System.out.println(Thread.currentThread().getName()+"--->"+i);
				}
			}
		});
		thread.setName("副线程1");
		thread.start();
		
		try {
			
			thread.sleep(1000*5);//此处不会让副线程1进入休眠，因为sleep是静态的，执行时还是转成Thread.sleep(1000*5);
								//该代码只会让当前线程即主线程进入休眠
			
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		System.out.println("666666");
		
	}

}
