package fList集合的ArrayList实现类;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ArrayList集合：
 * 		1、默认创建的集合初始化容量是10：底层是先创建一个长度为0的数组，当添加第一个元素时在初始化容量为0
 * 		2、集合底层是一个Object[]数组
 * 		3、构造方法两个，无参的跟有参的：
 * 			new ArrayList();
 * 			new ArrayList(20); --指定集合容量
 * 		4、数组的优点：
 * 			检索的效率高--原因是数组中的每个元素占用空间大小相同，内存地址连续，知道首元素内存地址，又知道下标
 * 						  通过数学表达式计算出元素的内存地址，所以检索效率高
 * 		5、数组缺点：
 * 			随机增删元素效率比较低，但是往数组末尾添加元素效率不受影响
 * 			数组无法存储大容量数据--因为堆中很难找到一块连续且巨大的内存空间
 * 		6、ArrayList由于底层是数组结构，以上的优缺点就是该集合的优缺点
 * 		     又因为java开发过程中检索操作频繁，增删较少，而且都是往末尾添加元素，所以ArrayList是用的最多的集合
 */

public class ArrayListTest01 {
	
	public static void main(String[] args) {
		
		//无参数构造方法创建集合对象，集合容量默认10
		ArrayList l1 = new ArrayList();
		
		//指定创建容量为20的集合
		//底层数组长度20
		List l2 = new ArrayList(20);
		
		//size方法只是返回集合当前的元素个数，并不能返回集合的容量
		System.out.println(l1.size());//0		
		
		//添加元素
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		//超出容量后继续添加元素，容量扩大到原来容量的多少倍呢？
		//查找源代码，如下
		l1.add(11);
		/*
		private void grow(int minCapacity) {
        // overflow-conscious code
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);
        if (newCapacity - minCapacity < 0)
            newCapacity = minCapacity;
        if (newCapacity - MAX_ARRAY_SIZE > 0)
            newCapacity = hugeCapacity(minCapacity);
        // minCapacity is usually close to size, so this is a win:
        elementData = Arrays.copyOf(elementData, newCapacity);
    }
		 */
		//可知新容量是原容量的1.5倍，其中涉及到二进制位运算Binary
		
		
	}

}
