
/*
 *   this���ڳ�Ա������
 */
package gthis�ؼ���;

public class ThisTest02 {
	
	public static void main(String[] args){
		
		//��������
		Employ w = new Employ("Smith",15545);
		w.work();
		
		//��������
				Employ w1= new Employ("Bob",15845);
				w1.work();
				w.m1();
	}

}

class Employ{
	
	//Ա������
	String name;
	//���
	int num;
	
	Employ(){}
	
	Employ(String _name,int _num){
		name=_name;
		_num=num;
	}
	
	//�ṩһ����Ա�����ķ���
	public void work(){
		//�����name�ǳ�Ա�������������á�����.��
		//���������name=this.name,thisʡ����
		/*
		 * ����this���ڳ�Ա�����У�˭(w or w1)ȥ�������������this�ʹ���˭
		 * thisָ�ľ��ǵ�ǰ����
		 */
		System.out.println(name+"�ڹ���");
	}
	//��Ա����1
	public void m1(){
		this.m2();//this.=w.
		m2();//����������Ч��һ�£����ڳ�Ա������this.��ʡ��
	}
	//��Ա����2
	public void m2(){
		System.out.println("����");
	}
}
