package mJava中对日期date的处理;

/*
 * 获取自1970年1月1日到当前系统时间的总毫秒数
 * 1秒=1000毫秒
 * 
 * 			System类的相关属性和方法：
 * 			System.out   out是System类的静态变量
 * 			System.out.println()   System类中的静态变量out的返回类是PrintStream，所以println()是PrintStream类中的方法
 * 			System.gc()  建议启动垃圾回收器
 * 			System.currentTimeMillis()   获取自1970年1月1日到当前系统时间的总毫秒数
 * 			System.exit(0)   退出JVM
 */

public class DateTest02 {
	
	public static void main(String[] args) {
		
		//获取自1970年1月1日到当前系统时间的总毫秒数
		long nowTimeMillis = System.currentTimeMillis();
		System.out.println(nowTimeMillis);//1603007789976
		
		//统计print方法执行到结束耗费了多少毫秒
		//执行前统计一下
		long bigin = System.currentTimeMillis();
		print();
		//执行后统计一下
		long end = System.currentTimeMillis();
		//后前相减
		System.out.println("执行print方法耗费"+(end-bigin)+"毫秒");//每次输出都不一样的,不打印耗时0毫秒
		
		
		
	}
	
	public static void print() {
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("i = "+i);
		}
		
	}

}
