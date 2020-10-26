package b集合Cellection接口中常用的方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/*
 * 关于集合中的迭代/遍历专题，非常重要
 */

public class CollectionTest02 {
	
	public static void main(String[] args) {
		
		//注意：以下的遍历方式/迭代方式是所有Collection集合通用的一种方式
		//在Map集合中是不能使用的，只能在Collection以及子类和实现类中使用
		
		//创建集合对象
		Collection c = new ArrayList();//有序可重复的
		
		//添加元素
		c.add("Milen");
		c.add(100);
		c.add(new Object());
		c.add(true);
		
		//遍历/迭代集合
		
		//第一步：调用iterator方法获取某个集合对象的迭代器Iterator对象
		Iterator it = c.iterator();
		
		//第二步：通过上面获取的迭代器对象用Iterator中的方法迭代/遍历集合
		/*
		 * boolean hasNext() --如果仍有元素可以迭代，则返回 true。 
 		   E next() --返回迭代的下一个元素。 
 		   void remove() --从迭代器指向的 collection 中移除迭代器返回的最后一个元素（可选操作）。
		 */
		while (it.hasNext()) {
			//不管你当初存进去的是说明类型，取出来统一都是Object，
			//因为存进去对象类型很多种，统一用它们父类型取出，所以next()方法返回的是Object类型
			//但是输出调用的还是各个对象类中的toString方法，没有重写的话就会输出一个对象地址
			Object o =  it.next();//c集合是有序可重复的
			System.out.println(o);
		}
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		
		//底层创建一个Collection中无序不可重复的集合进行迭代
		Collection c2 = new HashSet();
		
		//添加元素
		c2.add(200);
		c2.add(500);
		c2.add(100);
		c2.add(300);
		c2.add(100);
		c2.add(400);
		c2.add(300);
		
		//迭代c2
		for (Iterator iterator = c2.iterator(); iterator.hasNext();) {
			//存进去是什么类型，取出来还是什么类型
			Object object = iterator.next();
			if (object instanceof Integer) {
				System.out.println("Integer类型");
			}
			//只不过在输出的时候转成字符串输出
			System.out.println(object);
		}
		
	}

}
