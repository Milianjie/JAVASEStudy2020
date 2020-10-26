package m数组的二分法查找;

import java.util.Scanner;

/*
 * 		数组元素的查找：
 * 				两种方式：
 * 				1、一个一个挨着找，直到找到为止
 * 				2、二分法查找(算法)，效率高
 */
public class ArraySearch {
	
	public static void main(String[] args) {
		
		//第一种方式实例查找
		int[] arr = {12,88,99,66};
		
		/*
		//找出数组中元素值为99的下标，找到返回下标，没有返回404
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 29) {
				System.out.println("元素值为99的下标是："+i);
				return;//找到了该元素，执行到这就结束了整个main方法，下面的代码不再执行
			}
		}
		System.out.println("404 ! ! !\n99的元素不存在");//能执行到此处说明没有找到对应元素
		*/
		
		//将上面的查找代码放进一个方法中进行封装，如下
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int index = arraySearch(arr,a);
		/*
		if (index != 404) {
			System.out.println("要查找的元素下标是："+index);
		}else {
			System.out.println("404 ! ! !\n您查找的元素不存在");
		}*/
		//上面这段if else语句可以用三目运算符化简
		System.out.println(index == 404?"404 ! ! !\\n您查找的元素不存在":"要查找的元素下标是："+index);
		
	}
/**
 * 从数组中检索某个元素的下标
 * @param arr  被检索的数组
 * @param i    被检索的元素
 * @return		大于等于0的元素表示元素的下标，404表示元素不存在
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
