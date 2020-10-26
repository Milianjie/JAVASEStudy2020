package d异常类中的两个重要方法;

/*
 * 		异常对象有两个重要方法：
 * 			1、String msg = exception.getMessage()
 * 			获取异常简单的描述信息
 * 			
 * 			2、exception.printStackTrace
 * 			打印异常追踪的堆栈信息
 */

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		NullPointerException exception = new NullPointerException("不抛出的创建空指针异常对象");
		//throw exception;  -->手动抛异常，该语句表示上报该异常的对象，说明发生异常，下面的代码不再执行
		
		//获取异常简单的描述信息：这个信息就是该异常类构造方法上面的参数
		String msg = exception.getMessage();//不抛出的创建空指针异常对象
		System.out.println(msg);
		
		//打印异常追踪的堆栈信息
		//该信息的打印是采用异步线程的方式打印的
		exception.printStackTrace();
	}

}
