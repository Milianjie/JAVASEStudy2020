package kArrays������;

import java.util.Arrays;

/**
 * 				�����г������㷨�У�
 * 						�����㷨��ð�������㷨��ѡ�������㷨
 * 						�����㷨�����ַ�����
 * 				��Java�У���Щ�㷨�Ѿ���װ���ˣ���Ҫ����ֱ�ӵ�������
 * 				Java���ṩ��һ������Ĺ����ࣺjava.util.Arrays
 * 				Arrays��һ�������࣬����������ķ���������sort()���������������򡣹������ж��Ǿ�̬��������������á�
 * 
 * 
 * @author ���ٽ�
 *
 */

public class ArraysTest {
	
	public static void main(String[] args) {
		
		int[] array = {12,6,8,45,66,88,1,3,9,55};
		
		Arrays.sort(array);
		
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.print(j+" ");
		}
		
	}
	

}
