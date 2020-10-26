
//定义一个顾客类型
/*
 *    面向对象的封装性指的是：
 *    1.属性私有化
 *    2.对外提供公开的setter和getter
 *    
 *    set和get方法的方法名应遵循规范：get加属性且第二个及以后单词首字母大写
 */
package c面向对象的封装性;

public class Customer {
	
	    //属性
	//成员变量  实例变量  非静态变量
	    private int age;//private修饰的数据只能在本类中访问,所以在定义的引用类中
	     //提供或者说定义几个公开的方法，这里定义两个方法去让外部其他程序访问
	    
	    //定义两个公开的方法
	    //set
	    public void setAge(int a){//没有static，该方法是成员方法、实例方法、非静态方法
	    	if(a<=0||a>110){//必须使用“引用.”的方式访问
	    		System.out.println("鸡你太美年龄太大");
	    		return;//加return就是为了停止下面语句的执行
	    	}
	    	age=a;
	    	
	    }
	    
	    public int getAge(){//有返回值没参数
	    	return age;
	    }

}
