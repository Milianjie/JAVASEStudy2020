package c实现线程的方式;

/*
 * 采用匿名内部类的方式实现多线程：
 * 		匿名内部类：这个类没有名字，直接在需要放一个对象的参数位置 (new 接口名(){实现接口的方法})
 */

public class ThreadTest03 {	
	
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
