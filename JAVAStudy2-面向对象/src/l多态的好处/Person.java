/*
 *     ģ������
 */
package l��̬�ĺô�;

public class Person {
	
	/*
    //ι��
	public void feed(Dog d){
		d.eat();
	}
	
	//��Ϊ�û���ҵ��ı����������Ҫ����
	public void feed(Cat c){
		c.eat();
	}
	//���ϴ���ó���person���͵���չ����̫��
	 * 
	 */
	//������Ҫ��������̣�Ҫ�������̣����������
	public void feed(Animal a){//Ҳ��˵ֻҪ�Ǽ̳���Animal��Ķ��������⴫��Animal a���൱�ڰ���
		a.eat();               //�����Dog d ��Cat c���ж�������Ͱ���
	}                          //���Ե��÷����еĲ���д�����͵����ã���д�����͵�����a
	
	public void test(Animal b){
		b.name();               
	}   
}
