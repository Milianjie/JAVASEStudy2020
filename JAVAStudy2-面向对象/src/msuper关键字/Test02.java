package msuper�ؼ���;

public class Test02 {
	
	public static void main(String[] args){
		
	DebitAccount02 ba = new DebitAccount02();//�˾�������Ϊ��
	                                         // Account���޲������췽��ִ��
	DebitAccount02 a1 = new DebitAccount02("452428197525460256",54987564345.00,468946548752.00);
	
	Account02 ac= new Account02();
	
	System.out.println(ac.getActno());
	System.out.println(ac.getBalance());
	
	System.out.println(a1.getActno());
	System.out.println(a1.getBalance());
	
	}
}
