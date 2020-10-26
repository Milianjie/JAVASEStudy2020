/*
 *    关于Object类中的toString方法：
 *        SUN在Object类中设计toString方法的目的：返回java对象的字符串表示形式
 *        
 *        在现实的开发过程中，Object中的toString方法已经不够用了
 *        因为Object的toString方法实现的结果不满意
 *        
 *        Object中的toString方法就是要重写的
 *        SUN是这样实现toString方法的：
 *        
 *        public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        Object中toString方法返回：包名.类名@java对象的内存地址经过哈希算法得出的int类型值
                                                            再转化成十六进制，这个输出结果可以等同看作Java对象
                                                            在堆中的内存地址 
 */
package rObject类;

public class Test01 {
	
	public static void main(String[] args){
		
		//创建一个Object类型的对象
		Object o1 = new Object();
		
		//调用toString方法
		String ostr = o1.toString();
		System.out.println(ostr);//java.lang.Object@4bc0bec5
		
		//创建Person类型对象
		Person p1 = new Person("王德法",56);
		
		//调用toString方法
		String pstr = p1.toString();
		System.out.println(pstr);//十八Object类.Person@77984161
		
		Person p2 = new Person("巩俐",46);
		
		//print方法后面中如果是一个引用类型，会默认调用引用类型的tostring方法，就是说内存地址就是toString方法
		System.out.println(p2);//Person[name=巩俐，age=46]
		System.out.println(p2.toString());//Person[name=巩俐，age=46]
	}

}
class Person{
	
	String name;
	int age;
	
	Person(String name,int age){
		
		this.name = name;
		this.age = age;
	}
	//重写toString方法
	//根据项目的需求而定
	//此时规定，显示格式：Person[name=王德法，age=56]
	public String toString(){
		return "Person[name="+name+"，age="+this.age+"]";//成员方法，所有this.可省
	}
}