package hLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * ������ŵ㣺���������ϵ�Ԫ���ڴ洢�ռ��ϵĲ�������������ɾԪ�ص�ʱ�򲻻��д�����Ԫ��λ�ƣ���������ɾЧ�ʽϸ�
 * 			�ڿ��������������ɾԪ�ؽ϶��ҵ�񣬽���ʹ��LInkedList����
 * �����ȱ�㣺����ͨ����ѧ���ʽ���㱻����Ԫ�ص��ڴ��ַ��ÿһ�β��Ҷ��Ǵ�ͷ�ڵ㿪ʼ������ֱ���ҵ�Ϊֹ
 * 			����LinkedList���ϵļ���Ч�ʵ�
 * 
 * 		�����ҵ�����Ƶ������ɾ���٣�����ArrayList�������õ�����
 */

public class LinkedListTest01 {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList����������Node���͵����ԣ�first��last��
		 * ���������ԣ��ڴ���LinkedList���϶�����û�����Ԫ�أ���new�ڵ����ʱָ�����null
		 * һ������LinkedList�������Ԫ��ʱ��add�����ڲ���linkLast���������Ὣ����ӵĽڵ��ڴ��ַ����last����Ϊ�½ڵ�����ĿǰΪֹ��ĩ�ڵ�
		 * ���˵�ڴ����ڵ�ʱ���򼯺����Ԫ�أ�last==null��˵����ʱҪ�����Ľڵ�����������ϵĵ�һ���ڵ㣬Ҳ�����һ���ڵ㣨��֮���ڴ�����
		 * �½ڵ���ڴ��ַ���ø���first����
		 * 
		 * ˫������Ľڵ�Node�������������ԣ�pre��last�Լ��洢������
		 * �����������ڴ�������ʱ��ķֱ�����һ���ڵ���ڴ��ַ����һ���ڵ���ڴ��ַ
		 * 
		 * ֻ���һ��Ԫ�غ�first��lastָ��Ķ���new���ĵ�һ���ڵ������ڴ��ַ
		 * ���ýڵ�����pre��last������null
		 * �ɴ˿�֪LinkedList�е�first������Զ�������еĵ�һ���ڵ㣨�ڴ��ַ����last������Զ��ĩβ�ڵ㣨�ڴ��ַ��
		 * ���Բ鿴LinkedList�е�add�������
		 */
		LinkedList l1 = new LinkedList();
		
		l1.add("a");
		
		//����ý�һ�����̰߳�ȫ��ArrayList���ϱ���̰߳�ȫ�أ�
		List list = new ArrayList();//���̰߳�ȫ����
		
		//����̰߳�ȫ
		Collections.synchronizedList(list);
		
		//list���ϴ�ʱ�����̰߳�ȫ����
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		
	}

}
