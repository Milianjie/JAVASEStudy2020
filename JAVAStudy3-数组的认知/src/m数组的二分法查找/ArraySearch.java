package m����Ķ��ַ�����;

import java.util.Scanner;

/*
 * 		����Ԫ�صĲ��ң�
 * 				���ַ�ʽ��
 * 				1��һ��һ�������ң�ֱ���ҵ�Ϊֹ
 * 				2�����ַ�����(�㷨)��Ч�ʸ�
 */
public class ArraySearch {
	
	public static void main(String[] args) {
		
		//��һ�ַ�ʽʵ������
		int[] arr = {12,88,99,66};
		
		/*
		//�ҳ�������Ԫ��ֵΪ99���±꣬�ҵ������±꣬û�з���404
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 29) {
				System.out.println("Ԫ��ֵΪ99���±��ǣ�"+i);
				return;//�ҵ��˸�Ԫ�أ�ִ�е���ͽ���������main����������Ĵ��벻��ִ��
			}
		}
		System.out.println("404 ! ! !\n99��Ԫ�ز�����");//��ִ�е��˴�˵��û���ҵ���ӦԪ��
		*/
		
		//������Ĳ��Ҵ���Ž�һ�������н��з�װ������
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int index = arraySearch(arr,a);
		/*
		if (index != 404) {
			System.out.println("Ҫ���ҵ�Ԫ���±��ǣ�"+index);
		}else {
			System.out.println("404 ! ! !\n�����ҵ�Ԫ�ز�����");
		}*/
		//�������if else����������Ŀ���������
		System.out.println(index == 404?"404 ! ! !\\n�����ҵ�Ԫ�ز�����":"Ҫ���ҵ�Ԫ���±��ǣ�"+index);
		
	}
/**
 * �������м���ĳ��Ԫ�ص��±�
 * @param arr  ������������
 * @param i    ��������Ԫ��
 * @return		���ڵ���0��Ԫ�ر�ʾԪ�ص��±꣬404��ʾԪ�ز�����
 */
	public static int arraySearch(int[] arr, int i) {
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] == i) {
				return j;
			}
			
		}
		return 404;
	}

}
