package e对象变成垃圾例子;

public class User {
	

	//属性  实例变量  非静态变量 成员变量
	//Feild
	String name;
	int age;
	
	//构造方法 Constructor(以下构造方法构成了方法重载)
	public User(){//构造方法没有返回值
		/*
		 * 此处构造方法没有参数，但此处有隐形语句
		 * name=null;
		 * age=0;   即在构造方法被调用时系统默认赋值
		 */
	}
	     User(String _name){//public可以省略
	    	 name=_name;//默认赋值age=0;
	    	             //加_name是为了区分成员变量与局部变量
	    	            //在调用构造方法时让人更容易看懂将值赋给成员变量
	     }
	     
	     User(int _age){
	    	 age=_age;//默认赋值name=null;
	     }
	     
	     User(int _age,String _name){
	    	 age=_age;
	    	 name=_name;
	     }


}
