//父类：账户
package msuper关键字;

public class Account02 {
	
	//Filed
	private String actno;
	private double balance;
	
	//Constructor,作用是创建对象
	public Account02(){
		System.out.println("父类Account的无参数构造方法执行");
	}
	
	public Account02(String actno,double balance){
		
		this.actno=actno;
		this.balance=balance;
		
	}

	
	//setter和getter，作用是重新给变量赋值
	public String getActno() {
		return actno;
	}

	public void setActno(String actno) {
		this.actno = actno;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
