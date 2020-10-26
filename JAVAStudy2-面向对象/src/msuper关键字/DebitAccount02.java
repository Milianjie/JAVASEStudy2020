/*
 *    super关键字用在构造方法中：
 *         语法： super(实参);
 *         
 *       作用：通过子类的构造方法去调用父类的构造方法
 *       语法规则：一个构造方法第一行如果没有显示this(...); 也没有显示super(...);
 *                系统会默认调用super(...);
 *       注意：super(...);的调用只能放在第一行。因此其不能和this(...);共存
 *       
 *       super(...);虽然调用了父类中的构造方法，但并不会创建父类对象
 *       
 *       在java语言中，只要是创建java对象，那么Object中的无参数构造方法一定会执行
 *       
 *       单例模式的缺点：因为其要构造方法私有化，其子类无法创建对象
 *                      所以单例模式的类型无法被继承
 */
package msuper关键字;

public class DebitAccount02 extends Account02{
	
	//Filed
	//自有的独特属性
	private double debit;
	
	//Constructor
	public DebitAccount02(){
		//此处隐藏语句：super(); 括号中无参数即调用父类中的无参数构造方法
		System.out.println("子类DebiAccount02的无参数构造方法执行");
	}
	
	//当属性都私有化时,无法直接访问执行，可以用super(...);
	public DebitAccount02(String actno,double balance,double debit){
		//通过子类的构造方法去调用父类的构造方法，作用是：给当前子类对象中的父类型特征赋值
		super(actno,balance);//其他类的私有化属性不能用this.赋值
		this.debit=debit;
	}
	
	//setter and getter
	public void setDebit(double debit){
		this.debit=debit;
	}
	public double getDebit(){
		return debit;
	}

}
