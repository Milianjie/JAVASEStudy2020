/*
 *   关于实例语句块
 *         1.每一次调用构造方法之前执行一次，调用n次，就执行n次
 *         2.实例语句块执行顺序也是自上而下
 */
package h八static关键字;

public class StaticTest02 {
	
	//静态语句块
	static{
		System.out.println('A');
	}
	
	//实例语句块
	{
		System.out.println('1');
	}
	{
		System.out.println('2');
	}
	{
		System.out.println('3');
	}
	{
		System.out.println('4');
	}
	//入口
	public static void main(String[] args){
		    new StaticTest02();//别忘了构造方法后的小括号
		    new StaticTest02();
		    new StaticTest02();
	}
	
	//构造方法
	StaticTest02(){
		System.out.println("StaticTest02执行无参数构造方法");
	}

}
