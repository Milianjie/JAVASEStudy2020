
/*
 *   关于静态内部类
 *       1.静态内部类可以等同看作静态变量
 *       
 *       内部类重要作用：可以访问外部类中的私有数据
 *       
 *       2.静态内部类可以直接访问外部类私有的静态数据，无法访问非静态数据
 */
package u静态内部类;

public class OutClassjt {
	
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
		static class InnerClass{
			
			//定义静态方法
			public static void m3(){
				
				System.out.println(s1);
				m1();
				//System.out.println(s2);
				//m2();
			}
			
			
			//成员方法
			public void m4(){
				System.out.println(s1);
				m1();
			}
		
	}
		public static void main(String[] args){
			
			//调用静态方法m3，直接类名.
			OutClassjt.InnerClass.m3();
			
			//调用成员方法m4,创建对象
			InnerClass inner = new OutClassjt.InnerClass();
		    inner.m4();
			
		}

}

