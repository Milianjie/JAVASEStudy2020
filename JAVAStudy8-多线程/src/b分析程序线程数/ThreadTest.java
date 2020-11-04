package b分析程序线程数;

/*
 * 分析以下程序的线程数：一个线程（程序只有一个栈）
 * 程序输出为：
			main方法开始执行!
			m1方法开始执行!
			m2方法开始执行!
			m3方法开始执行!
			m3方法结束执行!
			m2方法结束执行!
			m1方法结束执行!
			main方法结束执行!
			一个栈中java语句自上而下逐行执行
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		
		System.out.println("main方法开始执行!");
		m1();
		System.out.println("main方法结束执行!");
		
	}

	private static void m1() {
		// TODO 自动生成的方法存根
		System.out.println("m1方法开始执行!");
		m2();
		System.out.println("m1方法结束执行!");
	}

	private static void m2() {
		// TODO 自动生成的方法存根
		System.out.println("m2方法开始执行!");
		m3();
		System.out.println("m2方法结束执行!");
	}

	private static void m3() {
		// TODO 自动生成的方法存根
		System.out.println("m3方法开始执行!");
		System.out.println("m3方法结束执行!");
	}

}
