/*
 *   编写接口的实现类
 *   
 *   该类的编写完全的面向接口去实现的
 */
package q接口的作用;

public class CustomerServiceImp implements CustomerService {
	
	//对接口中的抽象方法进行实现
	public void logout(){
		System.out.println("成功退出系统");
	}

}
