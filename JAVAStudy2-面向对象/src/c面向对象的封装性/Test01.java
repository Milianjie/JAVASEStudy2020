
/*
 *    面向对象的封装性
 */
package c面向对象的封装性;

public class Test01 {
	//程序的入口
	public static void main(String[] args){
		
		//创建Customer类型的对象
		Customer iage =new Customer();
		/*
		//读取(get)
		System.out.println(iage.age);
		
		//赋值(set)
		 iage.age=-15;//因为age没有限制，导致外部程序可以随意访问，age不安全
		 			  //不合法数据
		//读取
	    System.out.println(iage.age);
	    */
		//赋值
		iage.setAge(-566565);
		
		//读取
		System.out.println(iage.getAge());
			
	}

}
