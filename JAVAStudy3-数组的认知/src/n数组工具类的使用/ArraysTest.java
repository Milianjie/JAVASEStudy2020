package n���鹤�����ʹ��;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 		SUN��˾д����һ������Ĺ����ࣺjava.util.Arrays
 * 		����������ֱ�ӵ���������������������ҵ�����
 */

public class ArraysTest {
	
	public static void main(String[] args) {
		
		//������������Щ����������API�����ĵ��￴
		int[] arr = {12,56,3,88,99,4,6,15,6,100,66,48};
		
		//�������򷽷�
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j);
			System.out.println();
		}
		
		//���ö��ֲ��ҷ���
				int key = new Scanner(System.in).nextInt();
				int index = Arrays.binarySearch(arr,key);
				System.out.println(index == -13?"Ԫ�ز�����":key+"���±�Ϊ��"+index);
		
	}

}
