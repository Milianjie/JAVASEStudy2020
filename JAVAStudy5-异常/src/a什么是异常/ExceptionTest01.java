/*
 *   1.异常是什么？
 *     一、异常模拟的是现实世界中“不正常”的事件
 *     二、java采用“类”去模拟异常，就如接口一样
 *     三、类是可以创建对象的
 *          NullPointerException e = 0x1234;
 *          e是引用类型，e中保存的内存地址指向“堆”中的对象
 *          此对象就是NullPinterException类型的
 *          这个对象就表示真实存在的异常事件
 *          NullPinterException就是一类异常
 *          
 *          如："抢劫"是一类异常
 *              "张三被抢劫"就是异常事件，因为这一类异常还有其他异常事件
 *     
 *    2.异常机制的作用
 *      java语言为我们提供了一种完善的处理机制
 *      作用：程序发生异常，为我们输出详细信息
 *      程序员通过这个信息，可以对程序进行处理，使程序更加健壮
 *    
 */
package a什么是异常;

public class ExceptionTest01 {
	
	public static void main(String[] args){
		
		int a=10;
		int b=0;
			
		int c=a/b;//JVM执行到此处时，会new异常对象：new ArithmeticException("/ by zero");然后抛出，控制台就看见了
		
		//上面的代码出现了异常，“没有处理”，下面的代码不会执行，直接退出了JVM
		System.out.println(c);
		
		/*以上程序虽然编译通过了，但运行时出现了异常，表示发生了某个异常事件
		 * 本质：程序执行过程中发生了"算数异常"这个事件JVM为我们创建了一个ArithmeticException
		 * 类型的对象，并且这个对象包含了详细的异常信息，JVM将这个对象中的信息输出到控制台
		  JVM向输出台输出如下信息：
		  Exception in thread "main" java.lang.ArithmeticException: / by zero
	at a什么是异常.ExceptionTest01.main(ExceptionTest01.java:26)*/
		
		
	//健壮性，改成以下代码
		/* if(b!=0){
		 int c=a/b;
		 System.out.println(a+"/"+b+"="+c);
		 
		 }else{
		 
		 System.out.println("被除数不能为0！");
		 }*/
	}

}
