/*
 *   1.super�����������ͣ�super�д洢�Ĳ����ڴ��ַ��superָ��Ĳ��Ǹ������
 *   2.super������ǵ�ǰ�������ĸ���������
 *   
 *   3.ʲôʱ��ʹ��super
 *         ����͸����ж���ĳ�����ݣ��綼��name�������
 *         ���Ҫ�������з��ʸ����е�name���ԣ���Ҫʹ��  super.
 *         
 *   4.super��������ʲô�ط�
 *         һ��super�������ڳ�Ա�����У��������ھ�̬������
 *         ����super�������ڹ��췽����
 */
//����
package msuper�ؼ���;

public class Manager extends Employ {
	
	String name="һ��Ǯ�ĸ�";
	
	//��Ա���������ཫ����ķ�����д��
	public void work(){
		System.out.println("�����ڹ���");
	}
	
	//��Ա����
	public void m1(){
		
		work();//����this.work();//���Ϊ"�����ڹ���"
		super.work();//���Ϊ"Ա���ڹ���"
		
		System.out.println(name);//����ͷ
		System.out.println(this.name);//����ͷ
		System.out.println(super.name);//һ��Ǯ�ĸ� 
	}
	/*
	 //super��this��ͬ�����������ھ�̬��������
	public static void m2(){
		System.out.println(super.name);
	}
	*/

}
