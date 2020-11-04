package o实现线程的第三种方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/*
 * 	【第三种方式实现线程】实现Callable接口，以这种方式实现的接口可以得到线程的返回值或者说执行结果。具体方式如下
 */

public class ThreadTest {
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//新建一个未来任务类对象，构造方法中要传一个Callable对象，当然也可以传Runnable对象但这个无法获取返回值
		//Callable接口无法new对象，所以要传一个该接口的实现类对象，可以另写一个类实现，也可以用匿名内部类方式
		FutureTask task = new FutureTask<>(new Callable() {
			@Override
			public Object call() throws Exception {//这里相当于run方法，写需要执行的代码，只不过这里有返回值
				// TODO 自动生成的方法存根
				//模拟任务
				System.out.println(Thread.currentThread().getName()+"call method-->Bigin!");
				Thread.sleep(1000*5);
				System.out.println(Thread.currentThread().getName()+"call method-->End!");
				int a = 5;
				int b = 5;
				return a+b;//将a+b自动装箱，转为Integer
			}
		});
		
		//将task任务对象放进线程对象
		Thread thread = new Thread(task);
		
		thread.setName("第三种方式实现线程");
		
		//启动线程
		thread.start();
		
		Object obj = null;
		//如何在main主线程中获取另一个线程的返回值?用get方法
		try {
			obj = task.get();//因为是在主线从中获取返回值，必须让这段代码执行完后才能执行下面的代码，而get方法需要让另一个线程执行完后才能
									//获取返回值，所以这个方法会阻塞main线程，效率变低。但优点却是能拿到线程的执行结果
		} catch (InterruptedException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		System.out.println(thread.getName()+"执行结果："+obj);
		
		System.out.println("hello world!");
		
	}

}
