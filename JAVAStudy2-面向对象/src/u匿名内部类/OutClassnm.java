/*
 *    指的是该内部类没有名字
 */
package u匿名内部类;

public class OutClassnm {
	
	//静态方法
	public static void m1(CustomerService cs){
		cs.logout();
	}
	
	//入口
	public static void main(String[] args){
		
		//调用m1方法
		//接口没法创建对象
		//所以不能m1(new CustomerService());
		//写一个接口的实现类可new一个实现类的对象
		//m1(new CusyomerServiceImp());系统已安全退出！
		
		
		//不创建实现类，直接在参数列表写一个匿名内部类
		m1( new CustomerService(){
			//重写logout方法
			public void logout(){
				System.out.println("系统已安全退出！");
			}
		});
		//匿名内部类优点：少定义一个类
		//缺点：不能重复利用
	}

}

interface CustomerService{
	
	//退出系统
    public abstract void logout();
    
}

//创建接口的实现类
/*class CusyomerServiceImp implements CustomerService{
	
	//重写logout方法
	public void logout(){
		System.out.println("系统已安全退出！");
	}
}*/

