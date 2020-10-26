/*
 *   账户类
 *        也称
 *        父类、超类、基类、SuperClass类
 */
package i类的继承;

public class Account00 {
	
	//账户
	private String actno;
	
	//余额
	double balance;
	
	//Constructor
	Account00(){}
	
	Account00(String actno,double balance){
		
		this.actno=actno;
		this.balance=balance;
	}
	
	//setter and getter
	public void set(String actno){
		
		this.actno=actno;
	}
    public String get(){
		
		return actno;
	}

}
