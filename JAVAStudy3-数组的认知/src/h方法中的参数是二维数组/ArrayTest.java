package h�����еĲ����Ƕ�ά����;
/**
 * 
 * 				��̬��ʼ����ά����ͷ��������еĶ�ά����
 * 
 * @author ���ٽ�
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//��̬��ʼ����ά����
		int[][] a1 = new int[3][4];//����һ���������еĶ�ά���顣����һά���飬ÿ��һά�����ĸ�Ԫ��
		
		//������ά����
		for (int i = 0; i < a1.length; i++) {
			int[] js = a1[i];
			for (int j = 0; j < js.length; j++) {
				System.out.print(js[j]+" ");
			}
			System.out.println();
		}
		System.out.println("===================>");
		
		//��̬��ʼ����ά����
		int[][] a2 = {
				{1,2,3,4,5},
				{100,200,300},
				{99,88,77},
				{369,258}
		};
		printArray(a2);
		//����printArray({{1,2,3,4,5},{100,200,300},{99,88,77},{369,258}});
		//����������
		System.out.println("===================>");
		printArray(new int[][]{{1,2,3,4,5},{100,200,300},{99,88,77},{369,258}});
	}
	
	public static void printArray(int[][] array) {
		
		//������ά����
				for (int i = 0; i < array.length; i++) {
					int[] js = array[i];
					for (int j = 0; j < js.length; j++) {
						System.out.print(js[j]+" ");
					}
					System.out.println();
				}
				
		
	}

}
