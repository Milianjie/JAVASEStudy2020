/*
 *  static���εı����о�̬����
 *         �������ࣺ
 *             1.�ֲ�����
 *             2.��Ա����(ʵ���������Ǿ�̬����)
 *             3.��̬����(�洢�ڷ�����)
 *             
 *         ʲôʱ����������ɾ�̬������
 *             �������������еĶ����У����Ҵ����Ե�ֵ������ͬ�ģ�
 *             ������������ɾ�̬����
 *             
 *          ��Ա����������java�����ʱ���ʼ��
 *          ��̬������������ؽ׶θ�ֵ������ֻ��ֵһ��
 *         
 */

package h��static�ؼ���;

public class StaticTest04 {
	
	public static void main(String[] args){
		
		Animal a1 = new Animal("�ϻ�",15656);
		Animal a2 = new Animal("Tiger",156155);
		
		System.out.println(a1.name+"��������"+a1.age);
		System.out.println(a2.name+"��������"+a2.age);
		
		//��η��ʾ�̬?(����.)
		System.out.println(Animal.type);
		
		//Ҳ������  ����.
		System.out.println(a1.type);
		
		Animal a3;
		a3=null;
		System.out.println(a3.type);
		//��̬�����ײ���ʵ�ʱ��һ��ʹ�õ�  ����. �ķ�ʽ���Ͷ����޹أ������ֿ�ָ���쳣
	}

}

//������ʵ�еġ�½��������
class Animal{
	
	//Filed
	//��Ա����(һ������һ��)
	//��Ա�����ڴ�������ʱ��ʼ�������Ҵ洢�ڶ��е�ÿһ��������
	String name;
	int age;
	
	//��̬���������洢�ڷ�������
	//���е�java��������һ��
	//���Ծ�̬�������༶��ģ�ʹ��"����."��ʽ����
	static String type="½��";
	Animal(){}
	
	Animal(String name,int age){
		this.name=name;
		this.age=age;
	}
}