/*
 *   对象没有更多的引用指向，则变成垃圾
 */
package e对象变成垃圾例子;

public class Test01 {
	 
	  public static void main(String[] args){
		  
		  //u1是引用，保存内存地址指向堆中的对象
		  User u1=new User();
		  
		  u1=null;//将null赋值给u1，程序执行到此处时u1不在指向堆中的对象
		          //对象就成了垃圾
		  
		/*此时用一个空的引用u1去访问成员变量，会出现的情况
		 * System.out.println(u1.name);//java.lang.NullPointerException(空指针异常)
		 */
		  
		  Star s=new Star();
		 // s = null;
		  s.sing();
	  }

}
class  Star{//定义一个类不需要括号，无参量
	
	public void sing(){//定义一个成员方法
		
		System.out.println("sing a song");
	}
	
}