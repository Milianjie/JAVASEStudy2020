package nHashMap��Hashtable����;

import java.util.Hashtable;
import java.util.Map;

/*
 * ������:
 * 			HashMap�����е�key��value���ֿ���Ϊnull����key����ֻ����һ��null��map.get(null);��������keyΪnull��valueֵ
 * 			Hashtable�е�key��value������Ϊnull�����̰߳�ȫ��
 * 		
 * 			Hashtable�ײ�Ҳ�ǹ�ϣ��ṹ���������ʼ��������11������������HashMapһ������0.75
 * 
 * 			key����hashCode�����ó���ϣֵhash������ϣ�㷨�ó���ֵ��Ϊ�����±꣬���£�
 * 			int index = (hash & 0x7FFFFFFF) % tab.length;
 * 
 * ��Hashtable���ü��ϵ�������ԭ������2�ټ�1
 */

public class HashtableTest01 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "bzxbcn");
		
	}

	

}
