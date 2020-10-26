/*
 *    static 关键字
 *         1.static修饰的变量叫做静态变量
 *         2.static修饰的方法叫做静态方法
 *         3.static还可以定义静态语句块
 *         
 */
//以下例子演示:static定义静态语句块
//static定义的静态语句块在类加载阶段执行，并且只执行一次，是自上而下的顺序执行
package h八static关键字;

public class StaticTest001 {
	
	//静态语句块
	static{
		System.out.println('1');
	}
	static{
		System.out.println('2');
	}
	static{
		System.out.println('3');
	}
	static{
		System.out.println('4');
	}
	public static void main(String[] args){
			System.out.println("what do you know?");
	}

}
