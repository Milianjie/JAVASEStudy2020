package eList接口特有的方法;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * List集合特点：有序可重复，元素有下标
 * 			有序：添加元素的顺序与取出遍历的顺序是一样的，有下标，从0开始以1递增
 * 			可重复：数组中的元素可重复添加
 * 
 * 		List是Collection接口的子接口，有其特有的方法：还未学到泛型，下列方法中的E可用Object代替
 * 			void add(int index, E element) -- 在列表的指定位置插入指定元素（可选操作），非替换。
 *  		E get(int index)--返回列表中指定位置的元素。  
 *  		int indexOf(Object o) -- 返回此列表中第一次出现的指定元素的索引；如果此列表不包含该元素，则返回 -1。
 *        	int lastIndexOf(Object o) --返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1。  
 *          E remove(int index) --移除列表中指定位置的元素（可选操作）。 
 *          E set(int index, E element) --用指定元素替换列表中指定位置的元素（可选操作）。
 *          
 *           计算机英语单词：
 *           增：add、save、new
 *           删：delete、drop、remove
 *           改：update、set、modify
 *           查：find、select、get、query
 * 
 */

public class ListTest01 {
	
	public static void main(String[] args) {
		
		//创建集合
		//要想使用List接口的特有方法，得定义成List类型的集合
		List list = new ArrayList();
		
		//添加元素
		list.add("李冰冰");
		list.add("林允儿");
		list.add("武则天");
		list.add("宋媛媛");
		list.add("终极大哥");
		list.add("林允儿");
		/*
		 * 从某个下标插入元素，用的比较少，因为底层是数组，效率低
		 */
		list.add(2,"沈惜君");
		
		//遍历集合
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("遍历之下=============================");
		
		/*
		 * 返回集合指定位置元素
		 */
		Object o1 = list.get(0);
		System.out.println(o1);//李冰冰
		System.out.println("List特有遍历===================================");
		
		//因为有下标，所以List集合能跟数组一样的方式遍历，Set和Map是没有这种方式遍历的
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("===================================");

		/*
		 * 返回指定元素第一次出现的位置的下标/索引，若不包含元素返回-1
		 */
		int index1 = list.indexOf("林允儿");
		System.out.println("\"林允儿\"在集合中首次出现位置下标: "+index1);
		int index2 = list.indexOf("林允");
		System.out.println("\"林允\"在集合中首次出现位置下标: "+index2);
		System.out.println("===================================");
		
		/*
		 * 返回此列表中最后出现的指定元素的索引；如果列表不包含此元素，则返回 -1
		 */
		int index3 = list.lastIndexOf("林允儿");
		System.out.println("\"林允儿\"在集合中最后一次出现位置下标: "+index3);
		int index4 = list.lastIndexOf("林允");
		System.out.println("\"林允\"在集合中最后一次出现位置下标: "+index4);
		System.out.println("===================================");
		
		/*
		 * 删除集合中指定下标的元素
		 */
		list.remove(5);//将下标为5的元素删除---"终极大哥"
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("===================================");
		
		/*
		 * 用下标将集合中的指定元素用其他元素替换
		 */
		list.set(5, "欧阳小雅");//替换下标为伍的元素
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		System.out.println("===================================");

	}
	
}
