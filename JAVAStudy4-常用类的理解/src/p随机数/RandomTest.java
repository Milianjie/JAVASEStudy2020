package p随机数;

import java.util.Random;

public class RandomTest {
	
	public static void main(String[] args) {
		//创建随机数对象
		Random random = new Random();
		
		//随机产生一个int取值范围内的随机数
		System.out.println(random.nextInt());
		
		//随机产生一个boolean范围内的随机真假
		System.out.println(random.nextBoolean());
		
		//产生[0~100]的随机数。不能产生101
		//nextInt(101)翻译为：下一个int类型的数据是101，表示只能取到101
		System.out.println(random.nextInt(101));
		
		
		//随机产生五个随机数放入数组中，要求五个随机数不重复
		/*
		 * 方法1
		 * 该方法是先生成一个随机数无论是0还是其他值都能放进数组中，
		 * 然后再用该值与非自己下标的数组元素比较，所以无论是否将数组的所有元素都变成-1，都不会陷入死循环
		 */
		int[] arr = new int[5];
		//使数组中的值不是0
		for (int i = 0; i < arr.length; i++) {
				arr[i] = -1;	
		}
		
		for (int i = 0; i < arr.length; i++) {
			int number = random.nextInt(5); 
			System.out.println("生成的随机数："+number);
				arr[i] = number;
				for (int j = 0; j < arr.length; j++) {
					if (i==j) {
						continue;
					}
					if (arr[j]==number) {
						i--;
						break;
					};
					
				}
				
			}
		//遍历数组
		for (int i = 0; i < arr.length; i++) {
			int j = arr[i];
			System.out.print(j+" ");
		}
		System.out.println();
		
		/*
		 *  方法2
		 *  由于该方法是先判断随机数是否在数组中，否的时候再把数传进数组
		 *  如果不把初始化数组中的所有0值换成不在[0-4]范围内，在数组前四个元素都填入值后，最后一个数组元素为0
		 *  随机数只能生成0，而数组最后一个又为0，陷入判断的死循环
		 */
		int[] arr1 = new int[5];
		//使数组中的值不是0
		for (int i = 0; i < arr1.length; i++) {
				arr1[i] = -1;	
		}
		
		int index = 0;
		while (index<arr1.length) {
			
			int num = random.nextInt(5);
			
			if (!contains(arr1,num)) {
				
				arr1[index++] = num;
				
			}
			
		}//编写一个返回值为boolean类型判断数组中是否包含num的方法
		//遍历数组
		for (int i = 0; i < arr1.length; i++) {
			int j = arr1[i];
			System.out.print(j+" ");
		}
			
	}
	public static boolean contains(int[] arr,int key) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				//条件成立表示包含
				return true;
			}
			
		}
		//这个表示不包含
		return false;
	}
	
}
