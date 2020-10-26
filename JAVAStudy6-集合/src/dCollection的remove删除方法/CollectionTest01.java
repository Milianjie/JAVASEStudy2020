package dCollection��removeɾ������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 	����Ԫ�ص�ɾ��remove��Collection�ӿ����и����϶����remove��������������Iterator����Ҳ��һ��remove����������������
 * 
 * 		�ص�1��ֻҪ���ϵ����ݽṹ�����ı䣬�������������»�ȡ�����Ͻṹ�����仯��������δ���»�ȡ��
 * 			     ������next()�������ᱨ�쳣ConcurrentModificationException
 * 
 * 		�ص�2���ڵ���ѭ���в���ʹ�ü��϶����remove����ɾ��Ԫ�أ�������ʹ��Iterator��removeɾ��
 * 			     ԭ���ǵ������ڱ����϶�����iterator������ȡʱ���Ὣ��ǰ���ϵĽṹ��¼��������ѭ��
 * 			     ��ÿһ�ε���ʱ���ü�¼�뵱ǰ������ƥ�䣬ƥ���Ͼ͵�������Ȼ�ͱ��쳣�����������е�
 * 			   remove�����ǽ���¼�͵�ǰ�����е�Ԫ�ض�ɾ���ˣ����Ե���������ִ�У�Ҳ�൱���������Զ����µ����� 	
 */

public class CollectionTest01 {
	
	public static void main(String[] args) {
		
		//�������϶���
		Collection c = new ArrayList();
		
		//δ�򼯺����Ԫ��ʱ��ȡ��������ʲô���⣿
		//��ʱ��ȡ����ָ�򼯺�û��Ԫ�صĵ��������ô˵���������������û��Ԫ�ص�����
		//���ԣ�ֻҪ���ϵ����ݽṹ�����ı䣬�������������»�ȡ
		//�����Ͻṹ�����仯��������δ���»�ȡ��������next()�������ᱨ�쳣ConcurrentModificationException
		//����ʹ��forѭ������Ҫ��������ʱ����ѭ������ʼ��λ�û�ȡ�����������·���forѭ��
		//Iterator it = c.iterator();
		
		//���Ԫ��
		c.add(10);
		c.add(20);
		c.add(60);
		c.add(90);
		
		//forѭ����������
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			
			Object object =  iterator.next();
			
			//�ڵ���ѭ����ɾ��Ԫ��
			//��ʹ�õ��Ǽ��϶����remove����Ԫ��ɾ����ɾ���󼯺ϵĽṹ�ͷ����˱仯
			//Ȼ����ѭ�������е�������û�����»�ȡ�ģ��ͻ�����쳣ConcurrentModificationException
			//c.remove(20);
			
			//Ϊ������������������������е�remove���������ó�
			iterator.remove();//ɾ����һ���ǵ�����ָ��ĵ�ǰԪ��
			System.out.println(object);
		}
		System.out.println("���ϳ��ȣ�"+c.size());//0
		System.out.println("==========================");
		
		//��ȡ������
		Iterator it = c.iterator();
		//whileѭ����������
		while (it.hasNext()) {
			//��д����ʱ��next()�ķ���ֵ���ͱ�����Object����
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
