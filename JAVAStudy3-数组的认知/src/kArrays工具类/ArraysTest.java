package kArrays工具类;

import java.util.Arrays;

/**
 * 				数组中常见的算法有：
 * 						排序算法：冒泡排序算法、选择排序算法
 * 						查找算法：二分法查找
 * 				在Java中，这些算法已经封装好了，想要排序直接调方法。
 * 				Java中提供了一个数组的工具类：java.util.Arrays
 * 				Arrays是一个工具类，里面包含许多的方法，例如sort()方法可以用于排序。工具类中都是静态方法，类名点调用。
 * 
 * 
 * @author 钟荣杰
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
