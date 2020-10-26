package n数组工具类的使用;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 		SUN公司写好了一个数组的工具类：java.util.Arrays
 * 		开发中我们直接调用它来解决数组的排序查找等问题
 */

public class ArraysTest {
	
	public static void main(String[] args) {
		
		//工具类中有哪些方法可以在API帮助文档里看
		int[] arr = {12,56,3,88,99,4,6,15,6,100,66,48};
		
		//调用排序方法
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j);
			System.out.println();
		}
		
		//调用二分查找方法
				int key = new Scanner(System.in).nextInt();
				int index = Arrays.binarySearch(arr,key);
				System.out.println(index == -13?"元素不存在":key+"的下标为："+index);
		
	}

}
