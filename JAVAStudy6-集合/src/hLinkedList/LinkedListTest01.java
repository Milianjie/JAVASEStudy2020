package hLinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*
 * 链表的优点：由于链表上的元素在存储空间上的不连续，所以增删元素的时候不会有大量的元素位移，因此随机增删效率较高
 * 			在开发中遇到随机增删元素较多的业务，建议使用LInkedList集合
 * 链表的缺点：不能通过数学表达式计算被查找元素的内存地址，每一次查找都是从头节点开始遍历，直到找到为止
 * 			所以LinkedList集合的检索效率低
 * 
 * 		大多数业务检索频繁，增删较少，所以ArrayList集合是用的最多的
 */

public class LinkedListTest01 {
	
	public static void main(String[] args) {
		
		/*
		 * LinkedList类中有两个Node类型的属性，first和last，
		 * 这两个属性，在创建LinkedList集合对象且没有添加元素（即new节点对象）时指向的是null
		 * 一般在向LinkedList集合添加元素时，add方法内部（linkLast方法）都会将新添加的节点内存地址赋给last，因为新节点这是目前为止的末节点
		 * 如果说在创建节点时（向集合添加元素）last==null，说明此时要创建的节点对象是链表集合的第一个节点，也是最后一个节点（若之后不在创建）
		 * 新节点的内存地址还得赋给first属性
		 * 
		 * 双向链表的节点Node类中有三个属性：pre和last以及存储的数据
		 * 这两个属性在创建对象时存的分别是上一个节点的内存地址和下一个节点的内存地址
		 * 
		 * 只添加一个元素后，first和last指向的都是new出的第一个节点对象的内存地址
		 * 而该节点对象的pre和last属性是null
		 * 由此可知LinkedList中的first属性永远代表集合中的第一个节点（内存地址），last就用永远是末尾节点（内存地址）
		 * 可以查看LinkedList中的add方法理解
		 */
		LinkedList l1 = new LinkedList();
		
		l1.add("a");
		
		//如何让将一个非线程安全的ArrayList集合变成线程安全呢？
		List list = new ArrayList();//非线程安全集合
		
		//变成线程安全
		Collections.synchronizedList(list);
		
		//list集合此时就是线程安全的了
		list.add(1);
		list.add(1);
		list.add(1);
		list.add(1);
		
		
	}

}
