package q�ӿڵ�����;

public class Test02 {
	
	public static void main(String[] args){
		
		//��������
		Engine02 e1 = new YAMAHA02();//��̬
		
		//��������
		Car c = new Car(e1);
		
		//��������
		c.TestEngine();
		
		//��HONGDA
		Engine02 e2 = new HONGDA02();
		c.e = e2;//c.e�൱����ǰ��c.name="XXX",��Ϊe�Ǹ����͵ģ���ֱ�Ӹ�������ֵ�������ٴ�������
		c.TestEngine();
		
	}

}
