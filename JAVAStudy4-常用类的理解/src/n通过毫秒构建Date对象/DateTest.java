package n通过毫秒构建Date对象;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Date类中的构造方法中传参数--long类型的毫秒数
 */

public class DateTest {
	
	public static void main(String[] args) {
		
		//如下构建的对象时间是什么？
		Date time = new Date(1);//1970-01-01 00:00:00 001
		
		//建个合适的输出(或者说格式化)时间的模板
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		//因为本电脑北京是东8区，所以输出的时间早8个小时
		System.out.println(sdf1.format(time));//1970-01-01 08:00:00 001
		
		//获取昨天此时的日期
		Date time2 = new Date(System.currentTimeMillis()-1000*24*60*60);
		System.out.println(sdf1.format(time2));//2020-10-17 16:48:59 510

		
		
	}

}
