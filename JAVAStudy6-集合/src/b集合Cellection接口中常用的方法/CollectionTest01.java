package b����Cellection�ӿ��г��õķ���;

import java.util.ArrayList;
import java.util.Collection;

/*
 * ����java.util.Collection�ӿ��еĳ��÷���
 * 		1��Collection���ܴ��ʲôԪ�أ�
 * 			û��ʹ�÷���֮ǰ��Collection�п��Դ洢Object������������
 * 			ʹ�÷���֮��Collectionֻ�ܴ洢ĳ�������������
 * 			���Ϻ���ѧϰ�����﷨��Ŀǰ����Ҫ�ܣ�Collection�洢�κ�����
 * 			ֻҪ��Object�������;Ϳɡ�(�����в���ֱ�Ӵ洢�����������ͺ�java����
 * 			ֻ�ܴ洢java������ڴ��ַ)
 * 		2��Collection�еĳ��÷���
 * 			��1��boolean add(Object e)  --�򼯺������Ԫ��
 * 			��2��int size()  --���ش� collection �е�Ԫ������
 * 			��3��void clear() --�Ƴ��� collection �е�����Ԫ�أ���ѡ��������
 * 			��4��boolean contains(Object o)  --����� collection ����ָ����Ԫ��o���򷵻� true�����߷���false��
 * 			��5��boolean remove(Object o) --�Ӵ� collection ���Ƴ�ָ��Ԫ�صĵ���ʵ����������ڵĻ�����ѡ��������
 * 			��5��boolean isEmpty()  --�жϼ����Ƿ�Ϊ�գ� ����� collection ������Ԫ�أ��򷵻� true��
 * 			��6��Object[] toArray() --���ø÷���������ת��������
 */

public class CollectionTest01 {
	
	public static void main(String[] args) {
		
		//�������϶���
		//Collection c = new Collection();--�ӿ��ǳ���ģ�����ʵ��������
		
		//��̬
		Collection c = new ArrayList();
		
		//����Collection�еĳ��÷���
		/*
		 * �򼯺������Ԫ��
		 */
		c.add(1000);//�Զ�װ�䣬�ײ��װ��Integer��1000ת������Integer����
		c.add(3.14);//Double��װ���Զ�װ��(JDK5������)
		c.add(true);//�Զ�װ��
		c.add(new Object());
		
		/*
		 * ��ȡ������Ԫ�صĸ���
		 */
		System.out.println("����c��Ԫ�صĸ���Ϊ��"+c.size());//4
		
		/*
		 * ��ռ����е�Ԫ��
		 */
		c.clear();
		System.out.println("����c��Ԫ�صĸ���Ϊ��"+c.size());//0
		
		//�����Ԫ��
		c.add("hello");//���ַ���������ڴ��ַ���뼯��
		c.add("�й���");
		c.add("ľ��");
		c.add("С��");
		
		/*
		 * �жϼ������Ƿ����ĳ��ָ��Ԫ�أ���"ľ��"
		 */
		boolean b1 = c.contains("ľ��");//true
		System.out.println(b1);
		boolean b2 = c.contains("С��");//false
		System.out.println(b2);
		
		System.out.println("����c��Ԫ�صĸ���Ϊ��"+c.size());//4
		
		/*
		 * ɾ��ĳ��ָ��Ԫ�أ�������ڵĻ�
		 */
		c.remove("hello");
		System.out.println("����c��Ԫ�صĸ���Ϊ��"+c.size());//3
		
		/*
		 * ��Ƽ����Ƿ����Ԫ�أ��񣬷���true
		 */
		System.out.println(c.isEmpty());//false
		c.clear();
		System.out.println(c.isEmpty());//true
		
		//�����Ԫ��
				c.add("hello");//���ַ���������ڴ��ַ���뼯��
				c.add("�й���");
				c.add("ľ��");
				c.add("С��");
				
		/*
		 * ������ת����Object����
		 */
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			Object object = o[i];
			System.out.println(object);//����ʱ������Object��������ڴ��ַ��Object����toString
									//����ʱ���õ���Ȼ��Object��������д��toString����
		}
	}

}
