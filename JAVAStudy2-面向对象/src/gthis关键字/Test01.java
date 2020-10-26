/*
 *   this不能用在静态方法中
 *         1.静态方法的执行根本不需要java对象的存在。直接使用  类名. 的方式
 *         而this代表的是当前对象。所以静态方法中根本没有this
 *         2.
 */
package gthis关键字;

public class Test01 {
			
	//如：
	String skr;
	
	//入口
	public static void main(String[] args){
		
		//访问name(成员变量)用  引用.  
		//访问静态方法用  类名.  
		Person.m1();//m1是一个静态方法

		//skr是一个成员变量，只能用  引用.  去访问
		//在静态方法中不能System.out.println(skr);
		//而应该
		Test01 a = new Test01();
		
		System.out.println(a.skr);//null
		
	}

}
class Person{
	
	//Field
	String name;
	
	Person(){}
	
	Person(String name){
		this.name=name;
	}
	
	
	//静态方法
	public static void m1(){
		//System.out.println(name);Error:不能对非静态字段 name 进行静态引用
		
		//要想访问name：
		Person n=new Person("科技开发建设");
		System.out.println(n.name);
	}
}