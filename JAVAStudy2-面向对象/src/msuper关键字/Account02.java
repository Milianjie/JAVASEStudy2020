//���ࣺ�˻�
package msuper�ؼ���;

public class Account02 {
	
	//Filed
	private String actno;
	private double balance;
	
	//Constructor,�����Ǵ�������
	public Account02(){
		System.out.println("����Account���޲������췽��ִ��");
	}
	
	public Account02(String actno,double balance){
		
		this.actno=actno;
		this.balance=balance;
		
	}

	
	//setter��getter�����������¸�������ֵ
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
