package cColection��contains����;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection�����е�contains��������
 */

public class CollectionTest {
	
	public static void main(String[] args) {
		
		//�������϶���
		Collection collection  = new ArrayList();
		
		//���Ԫ��
		String string1 = new String("abc");
		String string2 = new String("def");
		collection.add(string1);
		collection.add(string2);
		
		//�½�һ��String����
		String x= new String("abc");
		
		//������Ԫ�صĸ���
		System.out.println("������Ԫ�ظ�����"+collection.size());
		
		//��collection���Ƿ����x�����Ƿ񶨵ģ���Ϊ�����д洢�����ڴ��ַx!=String1
		//��������һ���ü��϶��������洢����ģ�ȡ�������Ǿ������������֣�����
		//���ж�ĳԪ���Ƿ��ڼ����е�contains�����϶����ܵ����Ƚϵ�ַ�����ñ�����
		//����contains�����ײ�һ����������д���equals����
		
		//��contains�ж�x�Ƿ���collection��
		System.out.println(collection.contains(x));//true

		
	}

}
