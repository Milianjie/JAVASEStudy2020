/*
 *   �˻���
 *        Ҳ��
 *        ���ࡢ���ࡢ���ࡢSuperClass��
 */
package i��ļ̳�;

public class Account00 {
	
	//�˻�
	private String actno;
	
	//���
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
