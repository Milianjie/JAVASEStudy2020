package b����Cellection�ӿ��г��õķ���;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * ���ڼ����еĵ���/����ר�⣬�ǳ���Ҫ
 */

public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//ע�⣺���µı�����ʽ/������ʽ������Collection����ͨ�õ�һ�ַ�ʽ
		//��Map�������ǲ���ʹ�õģ�ֻ����Collection�Լ������ʵ������ʹ��
		
		//�������϶���
		Collection c = new ArrayList();//������ظ���
		
		//���Ԫ��
		c.add("Milen");
		c.add(100);
		c.add(new Object());
		c.add(true);
		
		//����/��������
		
		//��һ��������iterator������ȡĳ�����϶���ĵ�����Iterator����
		Iterator it = c.iterator();
		
		//�ڶ�����ͨ�������ȡ�ĵ�����������Iterator�еķ�������/��������
		/*
		 * boolean hasNext() --�������Ԫ�ؿ��Ե������򷵻� true�� 
 		   E next() --���ص�������һ��Ԫ�ء� 
 		   void remove() --�ӵ�����ָ��� collection ���Ƴ����������ص����һ��Ԫ�أ���ѡ��������
		 */
		while (it.hasNext()) {
			//�����㵱�����ȥ����˵�����ͣ�ȡ����ͳһ����Object��
			//��Ϊ���ȥ�������ͺܶ��֣�ͳһ�����Ǹ�����ȡ��������next()�������ص���Object����
			//����������õĻ��Ǹ����������е�toString������û����д�Ļ��ͻ����һ�������ַ
			Object o =  it.next();//c������������ظ���
			System.out.println(o);
		}
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		//�ײ㴴��һ��Collection�����򲻿��ظ��ļ��Ͻ��е���
		Collection c2 = new HashSet();
		
		//���Ԫ��
		c2.add(200);
		c2.add(500);
		c2.add(100);
		c2.add(300);
		c2.add(100);
		c2.add(400);
		c2.add(300);
		
		//����c2
		for (Iterator iterator = c2.iterator(); iterator.hasNext();) {
			//���ȥ��ʲô���ͣ�ȡ��������ʲô����
			Object object = iterator.next();
			if (object instanceof Integer) {
				System.out.println("Integer����");
			}
			//ֻ�����������ʱ��ת���ַ������
			System.out.println(object);
		}
		
	}

}
