package s集合工具类Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * 	java.util.Collections集合工具类
 */

public class CollectionsTest {
	
	public static void main(String[] args) {
		
		//创建ArrayList集合。线程不安全
		List<String> list = new ArrayList<String>();
		
		//用工具类使其线程安全
		Collections.synchronizedList(list);
		
		list.add("c");
		list.add("h");
		list.add("d");
		list.add("m");
		list.add("a");
		list.add("s");
		
		//使用工具类Collections对List集合进行排序，前提是集合中元素的类实现了Comparable接口以及该接口的方法
//		Collections.sort(list);
//		for (String string : list) {
//			System.out.println(string);
//		}
		System.out.println("============================");
		
		Collections.sort(list, new Comparator<String>() {//因为字符串之间的比较规则只有一种，String就只需实现Comparable接口,这里只是示例
			@Override									//用集合工具类给数组排序的两种方法：实现了Comparable接口和实现了Comparator接口
			public int compare(String o1, String o2) {
				// TODO 自动生成的方法存根
				return o1.compareTo(o2);
			}
		});
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("============================");
		//创建Set集合无法直接用工具类对该集合进行排序，需要将Set集合转成List集合才能对其进行排序
		Set<String> set = new HashSet<>();
		
		set.add("c");
		set.add("f");
		set.add("a");
		set.add("d");
		set.add("b");
		//编译不通过
		//Collections.sort(set);//类型 Collections 中的方法 sort（List<T>）对于参数（Set<String>）不适用
		
		//将set集合转换成List集合，通过创建一个新的List集合，在构造方法中将Set集合作为参数传进去
		ArrayList<String> list2 = new ArrayList<>(set);
		//然后再进行排序
		Collections.sort(list2);
		
		for (String string : list2) {
			System.out.println(string);
		}
		
	}

}
