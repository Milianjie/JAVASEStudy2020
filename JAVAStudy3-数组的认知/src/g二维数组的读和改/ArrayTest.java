package g��ά����Ķ��͸�;

/**
 * 			��ά����Ķ��͸�			
 * 
 * @author ���ٽ�
 *
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[][] a1 = {
				{1,2,3,4,5},
				{100,200,300},
				{88,99,77,65}
		};
		
		//ȡ����ά����a1�ĵ�һ��Ԫ��
		System.out.println(a1[0]);//[I@ee7d9f1  -->˵����ά������ÿ��Ԫ�ش����һά������ڴ��ַ,���£�
		int[] a2 =a1[0];
		int value = a2[0];// --->����value = a1[0][0]
		
		//ȡ�������Ԫ��ֵ
		System.out.println(a1[0][0]);//1  -->˵����һ��0�����a1����0�±�Ԫ�أ��ڶ���0�����һ��Ԫ��(��һ��һά����)��0�±�Ԫ��
		System.out.println("ȡ��������һά����ĵڶ���Ԫ�أ�"+a1[2][1]);
		
		//����������ά����
		for (int i = 0; i < a1.length; i++) {
			int[] һά���� = a1[i];
			for (int j = 0; j < a1[i].length; j++) {
				int is = a1[i][j];
				System.out.println("��ά����a1��a["+i+"]["+j+"]= "+is);
			}
			System.out.println("===============================>");
			
		}
		
		//��
		a1[1][0] = 122;//ע���Խ��
	}

}
