package kMap�ӿڳ��÷���;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * ����Map������Ҫ����������
 */

public class MapTest02 {
	
	public static void main(String[] args) {
		
		//����Map���϶���
		Map<Integer, String> map1 = new HashMap<>();
		
		//��������Ӽ�ֵ��
		map1.put(1, "����");
		map1.put(2, "������");
		map1.put(3, "�ӳ���");
		map1.put(4, "�����");
		map1.put(5, "������");
		
		//�Ȼ�ȡMap���������е�key
		Set<Integer> set = map1.keySet();
		
		/*
		 * ��һ�ַ�ʽ����
		 */
		//ͨ��for����for/eachѭ�������洢����key��Set���ϣ�����get������ȡÿ��key��Ӧ��value
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println(integer+" = "+map1.get(integer));
		}
		System.out.println("========================================");
		for (Integer integer : set) {
			System.out.println(integer+" = "+map1.get(integer));
		}
		
		System.out.println("========================================");
		/*
		 * �ڶ��ַ�ʽ������Set<Map.Entry<K,V>> entrySet()
		 * ��ΪMap�ӿ�������ʵ���࣬��Map�ӿ��еľ�̬�ڲ���Map.Entry������˵��̬�ڲ��ӿڣ���Map�ӿ�
		 * ��HashMap����HasTable��ʵ��ʱMap.Entry�ӿ�Ҳ�ᱻʵ������ڲ���ʵ�֣������������HashMap���ϣ��鿴
		 * ��Դ�뷢�֣�Map.Entry�ӿڱ�HashMap�еľ�̬�ڲ���HashMap.Nodeʵ���ˣ�Node���е�������key��value�����������������ϸ�������
		 * ����ͨ��Set<Map.Entry<K,V>> entrySet()������map����ת����Set���Ϻ�Set�����еĶ���������Node�����
		 * ����˵����ķ������ǽ��洢��ֵ�Ե��ڲ������Ž���Set�����У�Ҳ���˵��HashMap�����е�key��value�����ڲ������
		 * �洢�ģ����Կ�һ����һ�������֪ʶ
		 */
		Set<Map.Entry<Integer, String >> set2 = map1.entrySet();
		//����set2���ϣ�ÿһ��ȡ��һ��Node
		for (Iterator<Map.Entry<Integer, String >> iterator = set2.iterator(); iterator.hasNext();) {
			Map.Entry<Integer, String> node = iterator.next();
			//Node��key��value�������Դ洢Map����ת�������ļ���ֵ����������
			Integer i = node.getKey();
			String s = node.getValue();
			System.out.println(i+" = "+s);
		}
		System.out.println("========================================");
		for (Map.Entry<Integer, String> node : set2) {
			System.out.println(node.getKey()+"="+node.getValue());
		}
	}

}
