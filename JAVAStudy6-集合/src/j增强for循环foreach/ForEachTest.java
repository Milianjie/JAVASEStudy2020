package j��ǿforѭ��foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * JDK5֮��������ԣ���ǿforѭ����foreach��
 * 		�﷨��ʽ��
 * 				for(������ ������ : �������/���϶���){
 * 						System.out.orintln(������)
 * 				}
 * 		ȱ�㣺��ѭ��û���±꣬����Ҫ�õ��±��ѭ���в�������
 */

public class ForEachTest {
	
	public static void main(String[] args) {
		
		int[] array = {10,101,45,56,87,7};
		
		//��ͨ��������
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.println(j);
		}
		System.out.println("===========================");
		
		//��ǿѭ����������
		for (int i : array) {//i�������������ȡ����Ԫ��
			System.out.println("��ǿfor��"+i);
		}
		System.out.println("===========================");
		
		//��������
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("def");
		list.add("��ԲԲ");
		list.add("��ʩ");
		list.add("������");
		
		//��������������
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
		System.out.println("===========================");
		//��ǿforѭ����������
		for (String string : list) {
			System.out.println("��ǿfor��"+string);
		}
	}

}
