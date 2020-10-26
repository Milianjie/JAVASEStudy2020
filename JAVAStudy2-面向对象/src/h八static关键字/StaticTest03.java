/*
 *     static修饰的方法叫静态方法
 *     
 *     一般情况下工具类的方法大部分是静态方法
 *     
 *     静态方法不用创建对象也	能直接访问该方法
 */
package h八static关键字;

public class StaticTest03 {
	
	//成员方法
	//成员方法必须使用"引用."调用
	public void m1(){
		
	}
	
	//静态方法
	//静态方法必须使用"类名."去调用
	//静态方法不能直接访问静态类数据(成员变量、成员方法等)
	//静态方法不能使用this
	public static void m2(){
	System.out.println("类名点");	
	}

	//入口
	public static void main(String[] args){
		
		//如何调用，如下
		StaticTest03 s = new StaticTest03();
		s.m1();
		m2();//在同一个类中可省略"类名."
		
		//静态方法按正规的方式去调用： 类名.
		//其也能用“引用.”去调用
		s.m2();
		/*编译阶段检查出s是StaticTest03类型，编译通过，在运行的时候，
		 * 任然使用"StaticTest03."方式去访问
		 * 该方法执行不需要对象
		 */
		//空的引用去访问成员的时候会出县空指针异常
		//m2方法不是成员而是静态的
		//所以即使引用是空的也不会报空指针异常
		StaticTest03 s1;
		s1=null;
		s1.m2();
		       
		
	}

}
