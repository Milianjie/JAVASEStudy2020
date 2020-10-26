/*
 *   深入final
 *   
 *   final修饰的引用类型，该引用不可在重新指向其他的java对象
 *  
 */
package nfinal关键字;

public class Test02 {
	
	public static void main(String[] args){
		
		final Customer c = new Customer("lilei",545);
		
		//c是final的无法重新赋给其新的地址
		//Customer c = new Customer("韩梅梅",45);此处错误
		
		//但是此地址的对象的值是可变的
		c.name="DK";
		c.age=557454787;
		//System.out.println(c);
	}

}

class Customer{
	
	String name;
	double age;
	
	public Customer(String name,double age){
		
		this.name=name;
		this.age=age;
	}
}