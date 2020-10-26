package m数组的二分法查找;

import java.util.Scanner;

/*
 * 			二分法查找：
 * 					1、二分法查找建立在排序的数组之上
 * 					2、二分法的查找要高于一个一个挨着的查找
 * 					3、二分法查找原理：
 * 						10(下标0) 20 33 44 55 66 88 99 100(下标9)
 * 					要求：找出100的下标
 * 				第一次查找，中间元素的下标是(0+9)/2-->4 arr[4]这个元素就是此次的中间元素
 * 				arr[4]=55,55<100,说明被查找的元素在55的右边，那么开始下标变为 4+1，结束下标不变，
 * 				
 * 				第二次查找，中间元素下标为(5+9)/2 -->7  arr[7] = 88,
 * 				arr[7] = 88,88<100,被查找元素在88右边，开始下标：7+1，结束下标：不变 --若是在右边则是开始下标不变，结束下标7-1
 * 
 * 				第三次查找，中间元素下标为(8+9)/2 -->8,arr[8] =99<100,
 * 				所以开始下标：8+1；结束下标：不变
 * 
 * 				第四次查找，中下标为(9+9)/2 -->9,arr[9]=100,此时已查到
 * 
 * 			通过以上描述，我们可以初略估计在代码中可设的变量有：
 * 					查找的次数count、起始元素下标begin、结束元素的下标end、中间元素的下标mid
 * 			通过这些估计变量可大略构建其算法程序
 * 		
 * 			在冒泡排序中也可以发现其可设的变量是：外循环的次数i=数组长度，i--，控制能比较到哪个元素;
 * 												内循环的次数j=0，j++，j<i，控制遍历元素及其之间的比较;
 * 												
 * 			在选择排序中其可设的变量是：外循环的次数i = 0，i小于数组长度-1，i++，假设作为这堆参与比较数据的最小元素下标min，与其他比较，有更小的就交换下标继续比，直到比完；
 * 										内循环的次数j = i+1,可以取到右边的元素，从这堆参与比较数据第二个取值，与假设的最小值比较
 */

public class ArrayUtil {
	
	public static void main(String[] args) {
		
		int a = 11;
		int b = 2;
		//System.out.println(a/b);//5默认向下取整
		
		int[] arr = {12,13,16,18,19,21,25,36,48,66,99};
		
//		int mid = arr.length/2;
//		System.out.println(arr.length/2);
//		for (int i = 0; i < arr.length/2; i++) {
//			int x = mid;
//			if (36==arr[mid]) {
//				System.out.println("36的下标为："+mid);
//				return;
//			}
//			if (36 >arr[mid]) {
//				mid = (mid + arr.length)/2;
//				//System.out.println("下标为："+mid);
//			}else if(i == 0 && 36 < arr[mid]){
//				mid = mid/2;
//			}else if (i > 0 && 36 < arr[mid]) {
//				mid = (x+mid)/2;
//			}
//			
//		}
//		
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		
		int index = annarySearch(arr,input);
		
		if (index != 404) {
			System.out.println("元素值为"+input+"的下标是："+index );
		}else {
			System.out.println("404 ! ! !\n数组中无元素值："+input);
		}
	}
	
	/**
	 * 从数组中查找目标元素下标
	 * @param arr  被查找的数组，该数组必须是已经被排序的
	 * @param input  目标元素
	 * @return  404表示目标元素不存在该数组中，其他数值表示已查到
	 */

	public static int annarySearch(int[] arr, int input) {
		// TODO 自动生成的方法存根
		
		int bigin = 0;//第一次查找初始的开始元素下标
		int end = arr.length-1;//第一次查找初始的结束元素下标
		
		
		while (bigin <= end) {//当要查找的数大于数组中的最大值时，一直执行bigin = mid + 1;bigin会一直增大直至超过end；
							//若小于数组中最小值，一直执行end = mid - 1;end就会小于bigin，结束循环
			int mid = (bigin + end)/2;//第一次查找的中间元素下标
			//mid是接收随其它数值变化而变化的，需要放在循环中!!!
			
			if (arr[mid] == input) {
				return mid;
			}else if (arr[mid] < input) {
				//目标在“中间”的右边
				//修改开始元素下标
				bigin = mid + 1;//一直增
			}else {
				//目标在“中间”的左边
				//修改接收元素下标
				end = mid - 1;//一直减
			}
		}
		
		return 404;
	}

}
