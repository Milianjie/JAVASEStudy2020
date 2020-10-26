package h方法中的参数是二维数组;
/**
 * 
 * 				动态初始化二维数组和方法参数中的二维数组
 * 
 * @author 钟荣杰
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//动态初始化二维数组
		int[][] a1 = new int[3][4];//创建一个三行四列的二维数组。三个一维数组，每个一维数组四个元素
		
		//遍历二维数组
		for (int i = 0; i < a1.length; i++) {
			int[] js = a1[i];
			for (int j = 0; j < js.length; j++) {
				System.out.print(js[j]+" ");
			}
			System.out.println();
		}
		System.out.println("===================>");
		
		//静态初始化二维数组
		int[][] a2 = {
				{1,2,3,4,5},
				{100,200,300},
				{99,88,77},
				{369,258}
		};
		printArray(a2);
		//不能printArray({{1,2,3,4,5},{100,200,300},{99,88,77},{369,258}});
		//但可以这样
		System.out.println("===================>");
		printArray(new int[][]{{1,2,3,4,5},{100,200,300},{99,88,77},{369,258}});
	}
	
	public static void printArray(int[][] array) {
		
		//遍历二维数组
				for (int i = 0; i < array.length; i++) {
					int[] js = array[i];
					for (int j = 0; j < js.length; j++) {
						System.out.print(js[j]+" ");
					}
					System.out.println();
				}
				
		
	}

}
