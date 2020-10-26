package kMap�ӿڳ��÷���;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * java.util.Map�ӿ��г��õķ�����
 * 		1��Map��Collectionû�м̳й�ϵ
 * 		2��Map������key��value����ֵ�ԣ��ķ�ʽ�洢����
 * 			key��value����������������
 * 			key��value���Ǵ洢������ڴ��ַ
 * 			key�������ĵ�λ��value��key�ĸ���Ʒ
 * 		3��Map�ӿ��г��õķ���
 * 			V put(K key, V value) --��Map��������Ӽ�ֵ�ԡ���ָ����ֵ���ӳ���е�ָ������������ѡ�������� 
 * 			void clear() --���Map���ϡ� �Ӵ�ӳ�����Ƴ�����ӳ���ϵ����ѡ��������
 * 			boolean containsKey(Object key) --�ж�Map���Ƿ����ĳ��key�� �����ӳ�����ָ������ӳ���ϵ���򷵻� true��  
 * 			boolean containsValue(Object value) --�ж�Map���Ƿ����ĳ��value�� �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
 * 			boolean isEmpty() --�ж�Map����Ԫ�ظ����Ƿ�Ϊ�ա������ӳ��δ������-ֵӳ���ϵ���򷵻� true��
 * 			V get(Object key) --��ȡMap���������е�key�����е�key��һ��Set���ϣ� ����ָ������ӳ���ֵ�������ӳ�䲻�����ü���ӳ���ϵ���򷵻� null��
 * 			V remove(Object key) --ͨ��keyɾ����key�ļ�ֵ�ԡ��������һ������ӳ���ϵ������Ӵ�ӳ�����Ƴ�����ѡ��������
 * 			int size() --��ȡMap�����м�ֵ�Եĸ��������ش�ӳ���еļ�-ֵӳ���ϵ����  
 * 			Collection<V> values() --��ȡMap���������е�value������һ��Collection�� ���ش�ӳ���а�����ֵ�� Collection ��ͼ��
 * 
 * 			Set<Map.Entry<K,V>> entrySet() --��Map����ת����Set���ϡ����ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ��
 * 				����һ��Map�������£�
 * 			map1���ϵĶ���
 * 				key			value
 * ------------------------------------------
 * 				1			zhangsan
 * 				2			lisi
 * 				3			wangwu
 * 				4			zhouliu
 * 			����entrySet������Set set = map1.entrySet();
 *     		set���ϵĶ���Ϊ��
 *     			1=zhangshan
 *     			2=lisi
 *     			3=wangwu
 *     			4=zhouliu
 *     ��ע�⡿Map���Ͼ���entrySet����ת����Set���Ϻ�Set�����е�Ԫ��������Map.Entry���
 *     		��Ϊ��Map.Entry����Map�ӿ��еľ�̬�ڲ��ࣨ�ڲ��ӿڣ������������ڲ�����Ȼ��class Entry{}
 *     		����ģ������������Ҫ���ⲿ��ǰ׺����ʾ����һ����̬�ڲ��࣬��Ϊ��<>��������Ҳ֧�ַ���
 */

public class MapTest01 {
	
	public static void main(String[] args) {
		
		//����Map���϶���
		Map<Integer, String> map1 = new HashMap<>();
		
		//��������Ӽ�ֵ��
		map1.put(1, "����");
		map1.put(2, "������");
		map1.put(3, "�ӳ���");
		map1.put(4, "�����");
		map1.put(5, "������");
		
		//��ȡ���ϼ�ֵ�Եĸ���
		System.out.println(map1.size());//5
		
		//�жϼ����Ƿ����ĳ��key
		//contains�����ײ����ǵ�����д��equals�����������Զ������һ��Ҫ��дequals
		System.out.println(map1.containsKey(3));//true
		
		//�жϼ����Ƿ����ĳ��value
		System.out.println(map1.containsValue("������"));
		
		//��ȡ�����е�����key�����ص���һ��Set����
		Set<Integer> key = map1.keySet();
		for (Integer integer : key) {
			System.out.println(integer);
		}
		
		//��ȡ���������е�value�����ص���һ��Collection
		Collection<String> value = map1.values();
		for (String string : value) {
			System.out.println(string);
		}
		
		//ͨ��keyɾ��ĳ��key-value
		map1.remove(4);
		System.out.println(map1.size());
		
		//�жϼ����Ƿ�Ϊ��
		System.out.println(map1.isEmpty());
		
		//���Map����
		map1.clear();
		System.out.println(map1.size());
	}

}
