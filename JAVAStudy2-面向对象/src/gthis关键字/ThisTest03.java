/*
 *    this可以用来提供局部变量和成员变量
 */
package gthis关键字;

public class ThisTest03 {
	
	public static void main(String[] args){
		
		Manager u1 = new Manager();//调用无参数的构造方法，系统默认赋值name=null
		u1.setManager("钟荣杰");//但此处又调用了赋值方法name="钟荣杰"
		System.out.println(u1.getManager());
		
		Manager u2 = new Manager("这句话啊睡觉啊上课卡是假的加大数据");
		System.out.println(u2.getManager());
		
		
	}

}
class Manager{
	
	//Field
	private String name;
	
	//constructor
	Manager(){}
	
	Manager(String name){//此构造方法也是一个赋值语句，与下面的一样
		this.name=name;//所以调用构造方法，再调用getManager方法
	}
	
	//Method
	public void setManager(String name){
		this.name=name;//加个this.就知道前面的name是成员变量了
	}
	public String getManager(){
		return name;//此处的this.可以省略
	}
}