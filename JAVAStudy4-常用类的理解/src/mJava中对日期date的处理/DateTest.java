package mJava中对日期date的处理;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	
	public static void main(String[] args) throws Exception {
		
		//Date类是在java.util包下的类，系统只自动导入java.lang包，所以java.util.Date要自己导包
		Date date = new Date();
		
		//date是Date类型对象的引用，将该参数放进方法println中，pringln内部又将date放入静态方法String.valueOf
		//中，valueOf内部又用Date类型的引用date调用toString方法，该toString方法是Date类中重写了Object类中的
		//所以输出的不是内存地址，而是日期字符串
		System.out.println(date);//Sun Oct 18 14:33:47 CST 2020
		
		//默认的日期输出方式不符合自己的要求，那可以格式化它吗？
		//即将日期类型Date，按照指定的类型转换：Date-->转换成具有一定格式的字符串-->String
		//可以利用SimpleDateFormat类进行格式化，该类是java.text包下的。专门负责日期的格式化
		/*
		 * yyyy 年(年是4位的)
		 * MM 月(月是2位的)
		 * dd 日
		 * HH 时
		 * mm 分
		 * ss 秒
		 * SSS 毫秒(毫秒是3位的，最高999，1000毫秒为1秒)
		 *  需注意的是：在日期格式中，除了y M d H m s S这些字符不能随便写，剩下的符号格式自己组织
		 *  只填一个字母，格式化输出的是年月日时分毫秒的个位，多添加一个就到十位，依次类推，添加过多只会在
		 *  个时间单位前添0，但是月份添到MMM时输出的是中文月份表示,如十月这样
		 */
		
		//下面的语句就是定义一个想要的格式模型，将日期对象材料放进去，然后输出，完成日期-->转换-->String
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//最合适的
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd ");//
		SimpleDateFormat sdf3= new SimpleDateFormat("yy/MM/dd HH:mm:ss");//
		
		String dateStr1 = sdf1.format(date);
		String dateStr2 = sdf2.format(date);
		String dateStr3 = sdf3.format(date);
		System.out.println(dateStr1);//2020-10-18 14:57:48:614
		System.out.println(dateStr2);//2020-10-18 
		System.out.println(dateStr3);//20/10/18 14:57:48
		
		//现有一个日期字符串String，怎么转成Date型
		//String-->Date
		String time = "2028-10-01 12:15:56 666";
		
		//还是通过SimpleDateFormat方法，但是是String-->转换-->Date,所以这需要根据字符串格式
		//创建与提供的日期字符串格式的模板，之后调用转换方法才能将字符串转成Date
		//SimpleDateFormat sdf1 = new SimpleDateFormat("格式要和提供的日期字符串格式相同，不能随便填了");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		Date dateTime = sdf4.parse(time);//此时有ParseException异常未处理，解析异常，就是创建的模板和字符串格式不一致
										//可以用try/catch捕获，也可以在类名后抛出该异常，使代码运行
		
		System.out.println(dateTime);//Sun Oct 01 12:15:56 CST 2028
	}

}
