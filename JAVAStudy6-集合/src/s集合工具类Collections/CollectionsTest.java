package s���Ϲ�����Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 	java.util.Collections���Ϲ�����
 */

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		//����ArrayList���ϡ��̲߳���ȫ
		List<String> list = new ArrayList<String>();
		
		//�ù�����ʹ���̰߳�ȫ
		Collections.synchronizedList(list);
		
		list.add("c");
		list.add("h");
		list.add("d");
		list.add("m");
		list.add("a");
		list.add("s");
		
		//ʹ�ù�����Collections��List���Ͻ�������ǰ���Ǽ�����Ԫ�ص���ʵ����Comparable�ӿ��Լ��ýӿڵķ���
//		Collections.sort(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
		System.out.println("============================");
		
		Collections.sort(list, new Comparator<String>() {//��Ϊ�ַ���֮��ıȽϹ���ֻ��һ�֣�String��ֻ��ʵ��Comparable�ӿ�,����ֻ��ʾ��
			@Override									//�ü��Ϲ������������������ַ�����ʵ����Comparable�ӿں�ʵ����Comparator�ӿ�
			public int compare(String o1, String o2) {
				// TODO �Զ����ɵķ������
				return o1.compareTo(o2);
			}
		});
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("============================");
		//����Set�����޷�ֱ���ù�����Ըü��Ͻ���������Ҫ��Set����ת��List���ϲ��ܶ����������
		Set<String> set = new HashSet<>();
		
		set.add("c");
		set.add("f");
		set.add("a");
		set.add("d");
		set.add("b");
		//���벻ͨ��
		//Collections.sort(set);//���� Collections �еķ��� sort��List<T>�����ڲ�����Set<String>��������
		
		//��set����ת����List���ϣ�ͨ������һ���µ�List���ϣ��ڹ��췽���н�Set������Ϊ��������ȥ
		ArrayList<String> list2 = new ArrayList<>(set);
		//Ȼ���ٽ�������
		Collections.sort(list2);
		
		for (String string : list2) {
			System.out.println(string);
		}
		
	}

}
