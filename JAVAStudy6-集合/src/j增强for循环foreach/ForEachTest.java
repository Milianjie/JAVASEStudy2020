package j增强for循环foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * JDK5之后的新特性：增强for循环（foreach）
 * 		语法格式：
 * 				for(类型名 变量名 : 数组对象/集合对象){
 * 						System.out.orintln(变量名)
 * 				}
 * 		缺点：该循环没有下标，在需要用到下标的循环中不建议用
 */

public class ForEachTest {
	
	public static void main(String[] args) {
		
		int[] array = {10,101,45,56,87,7};
		
		//普通遍历数组
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			System.out.println(j);
		}
		System.out.println("===========================");
		
		//增强循环遍历数组
		for (int i : array) {//i代表的是数组中取出的元素
			System.out.println("增强for："+i);
		}
		System.out.println("===========================");
		
		//创建集合
		List<String> list = new ArrayList<String>();
		
		list.add("abc");
		list.add("def");
		list.add("陈圆圆");
		list.add("西施");
		list.add("朴智妍");
		
		//迭代器迭代集合
		for (Iterator<String> iterator = list.iterator(); iterator.hasNext();) {
			String string = iterator.next();
			System.out.println(string);
		}
		System.out.println("===========================");
		//增强for循环迭代集合
		for (String string : list) {
			System.out.println("增强for："+string);
		}
	}

}
