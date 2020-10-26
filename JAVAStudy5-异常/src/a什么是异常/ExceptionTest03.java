package a什么是异常;

/*
 * 		异常的继承结构：
 * 			1、Object类一个子类叫做Throwable类，翻译为可抛出的，其有两个直接子类：Error(错误)和Exception(异常)
 * 			     不管是错误还是异常，都是可抛出的
 * 			2、Error是发生在JVM内部的，一旦发生，Java程序只有一个结果，就是终止程序的执行，退出JVM.就是说错误是
 * 			     不能处理的。比如说栈内存溢出错误
 * 			3、异常类Exception的直接子类很多，但常分为两个分支：
 * 			    a  一个是ExceptionSubClass，表示Exception的除RunTimeException
 * 			之外的直接子类，叫做“编译时”异常，但不是编译时发生的异常，而是编写代码时要处理的异常，比如
 * 			你要创建文件输入流FileInputStream对象，该对象构造方法声明位置抛出一个编译时异常，如果不在本方法上
 * 			抛出相同异常或者在方法里边捕捉处理该异常，编译是不通过的。还有就是java语句后少了";"  
 * 			 又或者是调用未声明的变量等等，这些异常idea或者eclipse会 在编写时爆红提醒。这类异常出现最多且必须处理
 * 			    b 另一个就是其直接子类RunTimeException，该类包含的就是“运行时”异常， 比如：
 * 			 ArithmeticException、IndexOutOfBoundsException、NullPointerException、ClassCastException，当然有些异常
 *			  也还有子类，NUmberFormatException的父父类就是RunTimeException，父类是IllegalArgumentException
 *			4、运行时异常可以选择处理也可以不处理	
 */

public class ExceptionTest03 {

}
