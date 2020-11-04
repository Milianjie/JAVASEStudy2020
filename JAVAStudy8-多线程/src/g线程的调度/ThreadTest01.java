package g线程的调度;

/*
 * 【线程的优先级】1-10级，java采用抢占式优先级。优先级高只是抢占的CPU时间片多，使得该线程运行状态时间稍微长一点，并不是抢到的概率高或者快
 * 	刚new出来的线程对象优先级为5.Thread类中有三个优先级常量
 * 	获取线程的优先级：int getPriority() 返回线程的优先级。 成员方法，线程对象调用
 */

public class ThreadTest01 {
	
	public static void main(String[] args) {
		
		//输出三个优先级常量
		System.out.println(Thread.MAX_PRIORITY);//10
		System.out.println(Thread.MIN_PRIORITY);//1
		System.out.println(Thread.NORM_PRIORITY);//5
		
		Thread thread = new Thread(new MyRunnable1());
		
		thread.setName("t1");
		
		//打印线程t1默认优先级
		System.out.println("t1线程默认优先级："+thread.getPriority());//5
		
		//修改线程t1的优先级
		thread.setPriority(10);
		System.out.println("t1线程修改后的优先级："+thread.getPriority());//10
	}

}

class MyRunnable1 implements Runnable{
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		
	}
}