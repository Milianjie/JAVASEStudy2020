package nfinal�ؼ���;

public class Test01 {

}
/*
 * final���ε����޷������̳�
 * 
 * final class A{}

   class B extends A{}//�ᱨ��
*/

//final���εķ����޷�������
/*
class A{
	public final void m1(){
		
	}
}
class B extends A(){
	
   public void m1(){//Multiple markers at this line
		            //- Cannot override the final method from A
		
		 
	}
}
*/

//final���εľֲ�������һ������ֵ�������ٸı�
/*
class A{
	public void m1(){
		//����
		final int i;
		
		//��һ�θ�ֵ
		i =1;
		
		//�������¸�ֵ
		i=2;//The final local variable i may already have been assigned
		
	}
}
*/

//final���εĳ�Ա��������"��ʾ��"��ʼ��
/*
class A{
	
	//final���εĳ�Ա���������ֶ��ĳ�ʼ��
	//final int k;//The blank final field k may not have been initialized
	final int i=100;
	
	//��Ա
	final int k;
	
	//Constructor
	A(){
		k=200;//Ҳ����˵final���εĳ�Ա���������ڵ��ù��췽��֮ǰ����ֵ
	}
}
*/

//final���εĳ�Ա����һ���static����
class MyMath{
	
	//��ʱ�������ı���Ϊ ���� 
	//java�淶��Ҫ�����еĳ���"��д"
	//������ֵ�����ٸı����
	public static final double PI=3.14;
}