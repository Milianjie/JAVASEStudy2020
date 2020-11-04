package h标准字节输出流PrintStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;


/*
 * 一个简单的日志打印工具类
 */

public class Logger {
	
	public static void log(String mgs) {
		
		try {
			PrintStream printStream = new PrintStream(new FileOutputStream("log.txt",true));
			System.setOut(printStream);
			
			//获取时间
			Date nowTime = new Date();
			
			//为时间创建可读模板
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
			String time = sdf.format(nowTime);
			
			//调用方法就往log2打印日志
			System.out.println(time+":"+mgs);
		
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		
	}

}
