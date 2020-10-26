/*
 *   关于 成员内部类
 *       1. 成员内部类可以等同看作 成员变量
 *       
 *       内部类重要作用：可以访问外部类中的私有数据
 *       
 *       2. 成员内部类可以直接访问外部类所有的数据
 *       
 *       3.成员内部类中不能有静态声明
 */
package u成员内部类;

public class OutClasscy {
	
	//静态变量
	private static String s1 = "A";
	
	//成员变量
	private String s2 = "B";
	
	//静态方法
	private static void m1(){
		System.out.println("static's m1 method excuted!");
	}
	
	//成员方法
	private  void m2(){
		System.out.println("m2 method excuted!");
		}
	
	    //静态内部类
		//可以用访问控制权限的修饰符修饰
		//public private protected 缺省
	 class InnerClass{
			
			//不能定义静态方法
			//public static void m3(){}
			
			
			//成员方法
			public void m4(){
				//访问静态数据
				System.out.println(s1);
				m1();
				//访问成员数据
				System.out.println(s2);
				m2();
			}
		
	}
		public static void main(String[] args){
			
			//成员内部类相当于成员变量，要访问须创建外部类对象
			//创建外部类对象
			OutClasscy oc = new OutClasscy();
			
			//内部类中再访问成员方法还要创建对象
			InnerClass inner =oc.new InnerClass();
			//InnerClass inner = new InnerClass();
			//没有任何类型 OutClasscy 的外层实例可访问。必须用类型 OutClasscy 的外层实例（例如，x.new A()，其中 x 是 OutClasscy 的实例）来限定分配。
			inner.m4();
			
		}

}

