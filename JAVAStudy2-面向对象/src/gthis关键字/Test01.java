/*
 *   this�������ھ�̬������
 *         1.��̬������ִ�и�������Ҫjava����Ĵ��ڡ�ֱ��ʹ��  ����. �ķ�ʽ
 *         ��this������ǵ�ǰ�������Ծ�̬�����и���û��this
 *         2.
 */
package gthis�ؼ���;

public class Test01 {
			
	//�磺
	String skr;
	
	//���
	public static void main(String[] args){
		
		//����name(��Ա����)��  ����.  
		//���ʾ�̬������  ����.  
		Person.m1();//m1��һ����̬����

		//skr��һ����Ա������ֻ����  ����.  ȥ����
		//�ھ�̬�����в���System.out.println(skr);
		//��Ӧ��
		Test01 a = new Test01();
		
		System.out.println(a.skr);//null
		
	}

}
class Person{
	
	//Field
	String name;
	
	Person(){}
	
	Person(String name){
		this.name=name;
	}
	
	
	//��̬����
	public static void m1(){
		//System.out.println(name);Error:���ܶԷǾ�̬�ֶ� name ���о�̬����
		
		//Ҫ�����name��
		Person n=new Person("�Ƽ���������");
		System.out.println(n.name);
	}
}