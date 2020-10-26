package h单例模式初步;

public class Customer {
	
	//静态变量
		private static Customer s = new Customer();//类加载时只执行一次
		
		private Customer(){
			
		}
		
		//对外提供一个公开的获取Customer类型对象的方法
		public static Customer getCustomer(){
			return s;
		}

}
