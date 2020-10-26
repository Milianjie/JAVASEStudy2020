package l冒泡与选择排序算法;

import java.awt.print.Printable;

/**
 * 			选择排序：
 * 					每一次循环从参与这堆比较的数据中找到最小值，把这个最小值和这堆参与比较的数据的第一个数据交换位置
 * 			选择排序的每一次交换相比于冒泡排序来说都是有意义的!
 * 
 * 				给出原始数组数据：{3,2,7,6,9,1}
 * 					参与比较的数据 3,2,7,6,9,1
 * 				第一次循环后：1,2,7,6,9,3 ---->交换位置  5
 * 
 * 					参与比较数据 2,7,6,9,3
 * 				第二次循环后：2,7,6,9,3 ---->交换位置   1
 * 
 * 					参与比较数据7,6,9,3
 * 				第三次循环后：3,6,9,7 ---->交换位置   5
 * 		
 * 					参与比较数据 6,9,7
 * 				第四次循环后：6,9,7 ---->不交换位置   3
 * 
 * 					参与比较数据 9,7
 * 				第五次循环后：7,9 ---->交换位置   5
 * 			注意：六条数据循环五次!!!
 * 				  由于是找出最小值与最左边的元素交换位置，参与比较的数据中最小元素值可以在任意一个位置，在内循环中
 * 			我们要保存的是最小值的下标,然后在一次循环结束后与最左边交换位置
 * 					
 * @author 钟荣杰
 *
 */

public class SelectSort {
	
	public static void main(String[] args) {
		
		int[] array = {3,2,7,6,9,1};
		
		
		/*
		for (int i = 0; i < array.length-1; i++) {
			int mIdex =i;
			int temp = 0;
			for (int j = i; j < array.length-2; j++) {
				if (array[mIdex] > array[j+1]) {
					mIdex = j+1;	
					//System.out.println("j+1 "+ mIdex);
				}else {
					mIdex = mIdex;
					//System.out.println("j "+mIdex);
				}
				System.out.println(mIdex);
			}
			System.out.println(mIdex);
			System.out.println("=====================");
			temp = array[i];
			array[i] = array[mIdex];
			array[mIdex] = array[i];
		}*/
		
		//选择排序
		//6条数据循环5次--外层循环5次
		for (int i = 0; i < array.length-1; i++) {
			//i的值是0 1 2 3 4
			//i的值正好是参与比较的这堆数据的最左边那个元素的下标
			//System.out.println(i);
			//i也是参与比较的数据的起始下标
			//假设起点i下标的位置的元素最小
			int min = i;
				for (int j = i+1; j < array.length; j++) {
					if (array[min] >array[j]) {//判断假设的最小值与右边的比较
						min = j;//将更小的元素下标赋给min，否者不做任何修改，然后j++,最小元素再与下一个右边元素比较
					}
				}
			
				
				//当i和min相同时，表示假设是对的，不做任何位置交换
				//i和min不等时，假设是错的，又比这个更小的值
				//所以需要拿着这个更小的元素与最左边的元素做位置交换
				if (min!=i) {
					//有更小的元素
					//array[min]最小的元素
					//array[i] 最前面的元素
					int temp;
					temp = array[min];
					array[min] = array[i];
					array[i] = temp;
				}
				
				
		}
		

		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.print(j+" ");
		}
		
	}
}
