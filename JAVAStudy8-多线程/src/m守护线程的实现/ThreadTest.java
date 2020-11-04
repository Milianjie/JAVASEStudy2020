package m守护线程的实现;

/*
 * 【守护线程】java语言中线程分为两大类：用户线程和守护线程
 * 		用户线程：代表性的就是main主线程
 * 		守护线程：代表性的就是垃圾回器线程，也称守护线程是后台线程
 * 		守护线程的特点是一个死循环，只有当所有的用户线程结束了，守护线程才自动结束
 * 		一般用在每天零点自动备份数据，此时将一个计时器设置为守护线程。这个线程一直看着数据，一到零点就开始备份
 */
//实现守护线程
public class ThreadTest {
	
	public static void main(String[] args) {
		
		Thread thread = new MyThread();
		
		thread.setName("数据备份线程");
		
		System.out.println(thread.isDaemon());//false --此时不是守护线程
		//在这里执行线程对象的isDeamon()方法，让该线程变为守护线程，使其可以依据所有用户线程的结束而结束循环
		thread.setDaemon(true);
		System.out.println(thread.isDaemon());//true
		
		//启动线程
		thread.start();
		
		//主线程一个for循环
		for(int i = 1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}

}

class MyThread extends Thread {
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		int i = 0;
		//这里设置成死循环
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+(++i));
		}
	}
	
}