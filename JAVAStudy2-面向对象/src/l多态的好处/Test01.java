/*
  *   ��̬�ĺô���
 *        1.ʹ�ö�̬����ʹ���������֮�����϶Ƚ���
 *        2.��Ŀ����չ������ǿ
 */
package l��̬�ĺô�;

public class Test01 {
	
	public static void main(String[] args){
		
		//��������
		Person milen = new Person();
		
		//��������
		Dog d = new Dog();
		Cat c = new Cat();

		
		//ι
		milen.feed(d);//��ʱ����Animal a = d;
		milen.feed(c);//��ʱ����Animal a = c;
		
		d.name();//�����е�name����
		milen.test(d);//�����еľ�̬����
		
		//�����ڷ��������о�̬������������д����Ϊ��̬�ĺô���Ŀ�������ʹ�ö�̬���˼䲻��������ľ�̬��������д��Ҳû������
	}

}
