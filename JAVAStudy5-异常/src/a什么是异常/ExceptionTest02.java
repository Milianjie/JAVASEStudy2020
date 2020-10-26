package a什么是异常;

/*
 * 	异常的存在形式：
 * 				1、异常在java中以类的形式存在，每一个异常类都可以创建异常对象
 */

public class ExceptionTest02 {
	
	public static void main(String[] args) {
		//通过异常类实例化异常对象
		NumberFormatException numberFormatException = new NumberFormatException("数字格式化异常");
		System.out.println(numberFormatException);//java.lang.NumberFormatException: 数字格式化异常
		
		NullPointerException nullPointerException = new NullPointerException("空指针异常发生");
		System.out.println(nullPointerException);//java.lang.NullPointerException: 空指针异常发生
	}
	

}
