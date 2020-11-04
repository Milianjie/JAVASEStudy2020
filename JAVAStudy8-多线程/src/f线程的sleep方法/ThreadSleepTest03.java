package f线程的sleep方法;

/*
 * 	【强行终止线程的执行】
 */

public class ThreadSleepTest03 {
	
	public static void main(String[] args) {
		
		//创建实现Runnable接口的可运行对象
		MyThread03 myThread03 =new MyThread03();
		
		//将可运行对象包装成线程对象
		Thread thread = new Thread(myThread03);
		
		//给线程对象命名
		thread.setName("t2");
		
		//启动线程
		thread.start();
		
		//10秒后终止t2线程的运行
		try {
			Thread.sleep(1000*10);
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		//终止线程的执行
		thread.stop();//加横线表示已过时（而且不建议使用，这样强行终止线程没有保存的数据会丢失）
		
	}

}

class MyThread03 implements Runnable{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		for(int i=0;i<100;i++) {
			
			System.out.println(Thread.currentThread().getName()+" 线程-->"+i);
			//每隔一秒输出一个i
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
	
}