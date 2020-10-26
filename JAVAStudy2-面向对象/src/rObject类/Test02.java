/*
 *   关于Object中的equals方法
 *   
 *     equals方法:
 *     
 *         public boolean equals(Object obj) {
        return (this == obj);
    }
    o1.equals(o2):o1是this，o2是obj
    == 两边如果是引用类型，比较的是内存地址，相同是true，反之是false
    Object中的equals方法比较的是两个引用的内存地址
    
    java语言中equals方法设计的目的：判断两个的对象是否一样	

 */
package rObject类;

public class Test02 {
	
	public static void main(String[] args){
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		//o1.equals()就是说当前对象地址是o1，就是说this==o1
		//o1.equals(o2)，此时obj==o2
		System.out.println(o1.equals(o2));//false
		System.out.println(o1==o2);
		
		Star s1 = new Star(250,"黄晓明");
		Star s2 = new Star(250,"黄晓明");
		System.out.println(s1.equals(s2));//false
		System.out.println(s1==s2);
	}

}

class  Star{
	
	//身份证号码
	int id;
	//姓名
	String name;
	
	Star(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//Object中的equals方法比较的是内存地址
	//在显示业务逻辑中应比较内容
	//所以Object中的equals方法也要重写
	//根据需求规定重写
	//此处需求规定：如果身份证号一致，且名字一致，则代表同一个人
	//s1.equals(s2)
	//s1相当于是this，s2相当于obj，而obj是Object类型的，Object中
	//没有id属性，所以obj.id访问不了，所以要将obj强制转换为Star类型的引用
	 public boolean equals(Object obj){
		 
		 if (this==obj){
			 
			return true;
			 
		           }
		 if(obj instanceof Star){//是多态就可以强制类型转换
		 
			 Star s = (Star)obj;
		
			 if(this.id==s.id && s.name.equals(name)){
			 //因为s.name.equals()调用的是String类中重写的equals方法,什么类型的引用.方法，调用的就是那个类中的方法
			 //可以联系到父类型的引用指向子类型的对象，多态
				 return true;
		       }
		   }
		 return false;
	 }
}
