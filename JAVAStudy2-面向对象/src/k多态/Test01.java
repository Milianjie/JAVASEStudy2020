/*
 *     ����java�����е�����ת�ͺ�����ת��
 *        1.����ת��(upcasting):��--->��
 *        2.����ת��(downcasting):��--->��
 *        
 *        ע�⣺����������ת�ͻ�������ת�ͣ�������֮�����Ҫ�м̳й�ϵ��
 */

package k��̬;

public class Test01 {
	
	public static void main(String[] args){
		
		//����ת���ֳƣ��Զ�����ת��
		//�����͵�����ָ�������͵Ķ���
		//����������׶Σ�����׶� �� ���н׶�
		//����������׶�ֻ֪��a1��һ��Animal����
		//�������е�ʱ����е�ʵ�ʶ�����Cat���͵�
		Animal a1 = new Cat();
		
		//�����ڱ���׶�a1������������Animal����
		//���Գ����ڱ���׶�a1���ð󶨵���Animal���е�eat���� (��̬��)
		//���ǳ��������н׶ζ��еĶ���ʵ������Cat���ͣ���Cat�Ѿ���д��eat����
		//�������������ʱ����󶨵ķ�����Cat���е�eat���� (��̬��)
		a1.eat();//è����!
		
		//����ת�ͣ�ǿ������ת��
		Animal a2 = new Cat();
		
		//Ҫִ��Cat�������еĳ�Ա����move����ô����
		//ֻ��ǿ������ת�������ǿ������ת����
		Cat c1= (Cat)a2;
		c1.move();//è��è��!
		
		//�ж����³���������ʲô����
		Animal a3 =new Dog();//����ת��
		
		//ǿ������ת��
		//Cat c2 = (Cat)a3;//����java.lang.ClassException
		
		//����ǿ������ ת����ʱ������Ǵ��ڷ��յ�
		//Ϊ�˱���ClassException�ķ�����java������ instanceof
		/*
		 * �÷��� 
		 * 1.instanceof���������������boolean����
		 * 2.(���� instanceof ����) -->true/false
		 * 
		 * ���磺(a instanceof Cat) ��������true����ʾ a����ָ����е�java������Cat���͵�
		 */
		Animal a4 = new Dog();

		//��������ת�͵�ʱ��Ҫ��instanceof������жϣ�����ClassException
		if (a4 instanceof Cat){
			Cat c2 = (Cat)a4;
		}else {
			System.out.println(a4 instanceof Cat);
		}
		
	}
	

}
