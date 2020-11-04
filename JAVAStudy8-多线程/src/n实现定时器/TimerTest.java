package n实现定时器;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * 	定时器：在指定的时间执行某个程序，并且间隔多久执行一次的线程
 * 			1、最简单的定时器，利用sleep()方法，使程序睡眠，让线程在规定时间运行，太低级不用
 * 			2、利用java.util.Timer创建定时器对象，利用其中的schedule方法进行定时任务
 * 			void schedule(TimerTask task, long delay, long period) 安排指定的任务从指定的延迟后开始进行重复的固定延迟执行。 
 * 			3、但目前开发中使用较多的是Spring框架中SpringTask框架，仅需要简单的配置就能完成定时任务
 * 
 * 		下面简单演示利用Timer工具类实现定时任务
 */

public class TimerTest {
	
	public static void main(String[] args) {
		
		//创建定时器对象
		Timer timer = new Timer();
		//Timer timer2 = new Timer(true);//以守护线程的形式创建
		
		//指定定时任务
		//timer.schedule(定时任务, 第一次执行时间, 间隔多久执行一次/毫秒);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date firstTime =null;
		
		try {
			firstTime =sdf.parse("2020-11-01 15:09:00");
		} catch (ParseException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO 自动生成的方法存根
				
			}
		}, firstTime, 1000*10);//任务对象是一个抽象类或者接口，除了另写一个子类继承或实现之外，就是写一个匿名内部类
		
	}

}

//由于TimerTask是一个抽象类，无法直接new对象，需要编写一个定时任务类
//在这里写的是一个记录日志的任务
class LogerTimerTask extends TimerTask{
	
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		Date nowTime = new Date();
		
		System.out.println(simpleDateFormat.format(nowTime)+":已成功将数据备份!");
	}
	
}
