/*
 *    关于局部内部类：
 *        1.局部内部类相当于方法中的局部变量
 *          (所以说想要在方法中访问局部内部类中的成员方法只能在该方法中创建对象，因为出了括号就不认识了)
 *          
 *        2.局部内部类中不能有静态声明
 *        
 *        3.局部内部类要访问该方法的局部变量必须是最终型变量(变量类型前加final)
 *          方法中程序的执行是自上而下，当我们在内部类外访问m1方法时，访问之前i再被赋值就无法输出遵从自上而下的i值
 *          避免该内部类之下局部变量再赋值
 *         
 *        4.先在成员方法中创建其内部类的对象，调用内部类的成员方法，然后在外部类创建对象调用其成员方法，逐层逐级调用
 */
package u局部内部类;

public class OutClassjb {
	
	public void m1(){
		
		//局部变量
		final int i = 10;
		
		//因为是局部的只能在该方法用
		//所以此处不能加访问控制权限修饰符
		class InnerClass{
			
			public void m2(){
			System.out.println(i);
		    }
			
		}
		//i=100;  若不声明为最终变量，i会改变
		//在该方法中创建对象
		InnerClass inner = new InnerClass();
		inner.m2();
	}
	
	//入口
	public static void main(String[] args){
		
		OutClassjb O = new OutClassjb();
		O.m1();
	}

}
