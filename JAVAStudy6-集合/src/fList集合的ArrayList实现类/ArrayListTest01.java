package fList���ϵ�ArrayListʵ����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ArrayList���ϣ�
 * 		1��Ĭ�ϴ����ļ��ϳ�ʼ��������10���ײ����ȴ���һ������Ϊ0�����飬����ӵ�һ��Ԫ��ʱ�ڳ�ʼ������Ϊ0
 * 		2�����ϵײ���һ��Object[]����
 * 		3�����췽���������޲εĸ��вεģ�
 * 			new ArrayList();
 * 			new ArrayList(20); --ָ����������
 * 		4��������ŵ㣺
 * 			������Ч�ʸ�--ԭ���������е�ÿ��Ԫ��ռ�ÿռ��С��ͬ���ڴ��ַ������֪����Ԫ���ڴ��ַ����֪���±�
 * 						  ͨ����ѧ���ʽ�����Ԫ�ص��ڴ��ַ�����Լ���Ч�ʸ�
 * 		5������ȱ�㣺
 * 			�����ɾԪ��Ч�ʱȽϵͣ�����������ĩβ���Ԫ��Ч�ʲ���Ӱ��
 * 			�����޷��洢����������--��Ϊ���к����ҵ�һ�������Ҿ޴���ڴ�ռ�
 * 		6��ArrayList���ڵײ�������ṹ�����ϵ���ȱ����Ǹü��ϵ���ȱ��
 * 		     ����Ϊjava���������м�������Ƶ������ɾ���٣����Ҷ�����ĩβ���Ԫ�أ�����ArrayList���õ����ļ���
 */

public class ArrayListTest01 {
	
	public static void main(String[] args) {
		
		//�޲������췽���������϶��󣬼�������Ĭ��10
		ArrayList l1 = new ArrayList();
		
		//ָ����������Ϊ20�ļ���
		//�ײ����鳤��20
		List l2 = new ArrayList(20);
		
		//size����ֻ�Ƿ��ؼ��ϵ�ǰ��Ԫ�ظ����������ܷ��ؼ��ϵ�����
		System.out.println(l1.size());//0		
		
		//���Ԫ��
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		//����������������Ԫ�أ���������ԭ�������Ķ��ٱ��أ�
		//����Դ���룬����
		l1.add(11);
		/*
		private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
		 */
		//��֪��������ԭ������1.5���������漰��������λ����Binary
		
		
	}

}
