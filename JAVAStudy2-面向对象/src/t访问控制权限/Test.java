/*
 *   关于访问控制权限修饰符：修饰类，修饰方法，修饰变量
 *   
 *        private：  只能在本类中访问
 *        
 *        缺省时：    本类、同一个包下可访问；不同包、子类不能访问，导入了包也不能访问
 *        
 *        protected：  本类,同一个包,同一个包和不同包下的子类可访问；不同包不能访问，导入了包也不能访问
 *        
 *        public：  任何地方都能访问
 *        
 *        
 */
package t访问控制权限;



class User1{//类只能用public或缺省修饰
	
	//protected修饰
	protected String name;
	
	//缺省修饰
	int age;
	
}



 public class Test {
	
	public static void main(String[] args){
		
		User1 u1  = new User1();
		System.out.println(u1.name);//null
		System.out.println(u1.age);//0
		
		}
}
//小错误：无法启动该选项，并且没有最近的启动
//运行-->运行配置-->java运行程序-->test-->运行（运行配置框的右下角）
