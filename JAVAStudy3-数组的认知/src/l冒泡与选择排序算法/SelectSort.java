package lð����ѡ�������㷨;

import java.awt.print.Printable;

/**
 * 			ѡ������
 * 					ÿһ��ѭ���Ӳ�����ѱȽϵ��������ҵ���Сֵ���������Сֵ����Ѳ���Ƚϵ����ݵĵ�һ�����ݽ���λ��
 * 			ѡ�������ÿһ�ν��������ð��������˵�����������!
 * 
 * 				����ԭʼ�������ݣ�{3,2,7,6,9,1}
 * 					����Ƚϵ����� 3,2,7,6,9,1
 * 				��һ��ѭ����1,2,7,6,9,3 ---->����λ��  5
 * 
 * 					����Ƚ����� 2,7,6,9,3
 * 				�ڶ���ѭ����2,7,6,9,3 ---->����λ��   1
 * 
 * 					����Ƚ�����7,6,9,3
 * 				������ѭ����3,6,9,7 ---->����λ��   5
 * 		
 * 					����Ƚ����� 6,9,7
 * 				���Ĵ�ѭ����6,9,7 ---->������λ��   3
 * 
 * 					����Ƚ����� 9,7
 * 				�����ѭ����7,9 ---->����λ��   5
 * 			ע�⣺��������ѭ�����!!!
 * 				  �������ҳ���Сֵ������ߵ�Ԫ�ؽ���λ�ã�����Ƚϵ���������СԪ��ֵ����������һ��λ�ã�����ѭ����
 * 			����Ҫ���������Сֵ���±�,Ȼ����һ��ѭ��������������߽���λ��
 * 					
 * @author ���ٽ�
 *
 */

public class SelectSort {
	
	public static void main(String[] args) {
		
		int[] array = {3,2,7,6,9,1};
		
		
		/*
		for (int i = 0; i < array.length-1; i++) {
			int mIdex =i;
			int temp = 0;
			for (int j = i; j < array.length-2; j++) {
				if (array[mIdex] > array[j+1]) {
					mIdex = j+1;	
					//System.out.println("j+1 "+ mIdex);
				}else {
					mIdex = mIdex;
					//System.out.println("j "+mIdex);
				}
				System.out.println(mIdex);
			}
			System.out.println(mIdex);
			System.out.println("=====================");
			temp = array[i];
			array[i] = array[mIdex];
			array[mIdex] = array[i];
		}*/
		
		//ѡ������
		//6������ѭ��5��--���ѭ��5��
		for (int i = 0; i < array.length-1; i++) {
			//i��ֵ��0 1 2 3 4
			//i��ֵ�����ǲ���Ƚϵ�������ݵ�������Ǹ�Ԫ�ص��±�
			//System.out.println(i);
			//iҲ�ǲ���Ƚϵ����ݵ���ʼ�±�
			//�������i�±��λ�õ�Ԫ����С
			int min = i;
				for (int j = i+1; j < array.length; j++) {
					if (array[min] >array[j]) {//�жϼ������Сֵ���ұߵıȽ�
						min = j;//����С��Ԫ���±긳��min�����߲����κ��޸ģ�Ȼ��j++,��СԪ��������һ���ұ�Ԫ�رȽ�
					}
				}
			
				
				//��i��min��ͬʱ����ʾ�����ǶԵģ������κ�λ�ý���
				//i��min����ʱ�������Ǵ�ģ��ֱ������С��ֵ
				//������Ҫ���������С��Ԫ��������ߵ�Ԫ����λ�ý���
				if (min!=i) {
					//�и�С��Ԫ��
					//array[min]��С��Ԫ��
					//array[i] ��ǰ���Ԫ��
					int temp;
					temp = array[min];
					array[min] = array[i];
					array[i] = temp;
				}
				
				
		}
		

		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.print(j+" ");
		}
		
	}
}
