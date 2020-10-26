package eList�ӿ����еķ���;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List�����ص㣺������ظ���Ԫ�����±�
 * 			�������Ԫ�ص�˳����ȡ��������˳����һ���ģ����±꣬��0��ʼ��1����
 * 			���ظ��������е�Ԫ�ؿ��ظ����
 * 
 * 		List��Collection�ӿڵ��ӽӿڣ��������еķ�������δѧ�����ͣ����з����е�E����Object����
 * 			void add(int index, E element) -- ���б��ָ��λ�ò���ָ��Ԫ�أ���ѡ�����������滻��
 *  		E get(int index)--�����б���ָ��λ�õ�Ԫ�ء�  
 *  		int indexOf(Object o) -- ���ش��б��е�һ�γ��ֵ�ָ��Ԫ�ص�������������б�������Ԫ�أ��򷵻� -1��
 *        	int lastIndexOf(Object o) --���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1��  
 *          E remove(int index) --�Ƴ��б���ָ��λ�õ�Ԫ�أ���ѡ�������� 
 *          E set(int index, E element) --��ָ��Ԫ���滻�б���ָ��λ�õ�Ԫ�أ���ѡ��������
 *          
 *           �����Ӣ�ﵥ�ʣ�
 *           ����add��save��new
 *           ɾ��delete��drop��remove
 *           �ģ�update��set��modify
 *           �飺find��select��get��query
 * 
 */

public class ListTest01 {
	
	public static void main(String[] args) {
		
		//��������
		//Ҫ��ʹ��List�ӿڵ����з������ö����List���͵ļ���
		List list = new ArrayList();
		
		//���Ԫ��
		list.add("�����");
		list.add("���ʶ�");
		list.add("������");
		list.add("������");
		list.add("�ռ����");
		list.add("���ʶ�");
		/*
		 * ��ĳ���±����Ԫ�أ��õıȽ��٣���Ϊ�ײ������飬Ч�ʵ�
		 */
		list.add(2,"��ϧ��");
		
		//��������
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("����֮��=============================");
		
		/*
		 * ���ؼ���ָ��λ��Ԫ��
		 */
		Object o1 = list.get(0);
		System.out.println(o1);//�����
		System.out.println("List���б���===================================");
		
		//��Ϊ���±꣬����List�����ܸ�����һ���ķ�ʽ������Set��Map��û�����ַ�ʽ������
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================================");

		/*
		 * ����ָ��Ԫ�ص�һ�γ��ֵ�λ�õ��±�/��������������Ԫ�ط���-1
		 */
		int index1 = list.indexOf("���ʶ�");
		System.out.println("\"���ʶ�\"�ڼ������״γ���λ���±�: "+index1);
		int index2 = list.indexOf("����");
		System.out.println("\"����\"�ڼ������״γ���λ���±�: "+index2);
		System.out.println("===================================");
		
		/*
		 * ���ش��б��������ֵ�ָ��Ԫ�ص�����������б�������Ԫ�أ��򷵻� -1
		 */
		int index3 = list.lastIndexOf("���ʶ�");
		System.out.println("\"���ʶ�\"�ڼ��������һ�γ���λ���±�: "+index3);
		int index4 = list.lastIndexOf("����");
		System.out.println("\"����\"�ڼ��������һ�γ���λ���±�: "+index4);
		System.out.println("===================================");
		
		/*
		 * ɾ��������ָ���±��Ԫ��
		 */
		list.remove(5);//���±�Ϊ5��Ԫ��ɾ��---"�ռ����"
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("===================================");
		
		/*
		 * ���±꽫�����е�ָ��Ԫ��������Ԫ���滻
		 */
		list.set(5, "ŷ��С��");//�滻�±�Ϊ���Ԫ��
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("===================================");

	}
	
}
