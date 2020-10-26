package g二维数组的读和改;

/**
 * 			二维数组的读和改			
 * 
 * @author 钟荣杰
 *
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		int[][] a1 = {
				{1,2,3,4,5},
				{100,200,300},
				{88,99,77,65}
		};
		
		//取出二维数组a1的第一个元素
		System.out.println(a1[0]);//[I@ee7d9f1  -->说明二维数组中每个元素存的是一维数组的内存地址,如下：
		int[] a2 =a1[0];
		int value = a2[0];// --->所以value = a1[0][0]
		
		//取出具体的元素值
		System.out.println(a1[0][0]);//1  -->说明第一个0代表该a1数组0下标元素，第二个0代表第一个元素(第一个一维数组)的0下标元素
		System.out.println("取出第三个一维数组的第二个元素："+a1[2][1]);
		
		//遍历整个二维数组
		for (int i = 0; i < a1.length; i++) {
			int[] 一维数组 = a1[i];
			for (int j = 0; j < a1[i].length; j++) {
				int is = a1[i][j];
				System.out.println("二维数组a1的a["+i+"]["+j+"]= "+is);
			}
			System.out.println("===============================>");
			
		}
		
		//改
		a1[1][0] = 122;//注意别越界
	}

}
