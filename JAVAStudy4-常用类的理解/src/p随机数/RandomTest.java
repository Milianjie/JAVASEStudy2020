package p�����;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		//�������������
		Random random = new Random();
		
		//�������һ��intȡֵ��Χ�ڵ������
		System.out.println(random.nextInt());
		
		//�������һ��boolean��Χ�ڵ�������
		System.out.println(random.nextBoolean());
		
		//����[0~100]������������ܲ���101
		//nextInt(101)����Ϊ����һ��int���͵�������101����ʾֻ��ȡ��101
		System.out.println(random.nextInt(101));
		
		
		//������������������������У�Ҫ�������������ظ�
		/*
		 * ����1
		 * �÷�����������һ�������������0��������ֵ���ܷŽ������У�
		 * Ȼ�����ø�ֵ����Լ��±������Ԫ�رȽϣ����������Ƿ����������Ԫ�ض����-1��������������ѭ��
		 */
		int[] arr = new int[5];
		//ʹ�����е�ֵ����0
		for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			int number = random.nextInt(5); 
			System.out.println("���ɵ��������"+number);
				arr[i] = number;
				for (int j = 0; j < arr.length; j++) {
					if (i==j) {
						continue;
					}
					if (arr[j]==number) {
						i--;
						break;
					};
					
				}
				
			}
		//��������
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j+" ");
		}
		System.out.println();
		
		/*
		 *  ����2
		 *  ���ڸ÷��������ж�������Ƿ��������У����ʱ���ٰ�����������
		 *  ������ѳ�ʼ�������е�����0ֵ���ɲ���[0-4]��Χ�ڣ�������ǰ�ĸ�Ԫ�ض�����ֵ�����һ������Ԫ��Ϊ0
		 *  �����ֻ������0�����������һ����Ϊ0�������жϵ���ѭ��
		 */
		int[] arr1 = new int[5];
		//ʹ�����е�ֵ����0
		for (int i = 0; i < arr1.length; i++) {
				arr1[i] = -1;	
		}
		
		int index = 0;
		while (index<arr1.length) {
			
			int num = random.nextInt(5);
			
			if (!contains(arr1,num)) {
				
				arr1[index++] = num;
				
			}
			
		}//��дһ������ֵΪboolean�����ж��������Ƿ����num�ķ���
		//��������
		for (int i = 0; i < arr1.length; i++) {
			int j = arr1[i];
			System.out.print(j+" ");
		}
			
	}
	public static boolean contains(int[] arr,int key) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				//����������ʾ����
				return true;
			}
			
		}
		//�����ʾ������
		return false;
	}
	
}
