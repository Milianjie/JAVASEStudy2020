/*
 *   ����final
 *   
 *   final���ε��������ͣ������ò���������ָ��������java����
 *  
 */
package nfinal�ؼ���;

public class Test02 {
	
	public static void main(String[] args){
		
		final Customer c = new Customer("lilei",545);
		
		//c��final���޷����¸������µĵ�ַ
		//Customer c = new Customer("��÷÷",45);�˴�����
		
		//���Ǵ˵�ַ�Ķ����ֵ�ǿɱ��
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