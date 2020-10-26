package f二维数组的理解;

/**
 * 			关于Java中的二维数组：
 * 				1、二维数组其实就是一个特殊的一维数组，其特殊在这个一维数组中的每个数组元素都是个一维数组
 * 				2、依次类推，三维数组是一个特殊的二维数组
 * 				   Java开发中最多使用一维数组，二维数组极少，三维数组几乎不用
 * 				3、二维数组的静态初始化
 * 					int[][] array = {{100,200},{1,2,3,4},{56,57,58,99},{45,23,56,99,88}};
 * 
 * @author 钟荣杰
 *
 */
public class ArrayTest {
	
	public static void main(String[] args) {
		
		//一维数组
		int[] a1 = {100,200,300};
		
		//二维数组
		int[][] a2 = {
				{100,200,300},
				{45,26},
				{1,2,3,4,5},
				{95,96,98,99}	
		};
		
		//二维数组的长度
		System.out.println("二维数组a2的长度为 "+a2.length);
		//二维数组中元素的长度
		System.out.println("二维数组a2中元素a2[0]的长度为 "+a2[0].length);
		System.out.println("二维数组a2中元素a2[1]的长度为 "+a2[1].length);
		System.out.println("二维数组a2中元素a2[2]的长度为 "+a2[2].length);
		System.out.println("二维数组a2中元素a2[3]的长度为 "+a2[3].length);
	}

}
