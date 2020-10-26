package dCollection的remove删除方法;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * 	集合元素的删除remove：Collection接口中有个集合对象的remove方法，而迭代器Iterator类中也有一个remove方法，作用与区别？
 * 
 * 		重点1：只要集合的内容结构发生改变，迭代器必须重新获取当集合结构发生变化，迭代器未重新获取，
 * 			     若调用next()方法，会报异常ConcurrentModificationException
 * 
 * 		重点2：在迭代循环中不能使用集合对象的remove方法删除元素，但可以使用Iterator的remove删除
 * 			     原理是迭代器在被集合对象用iterator方法获取时，会将当前集合的结构记录下来，在循环
 * 			     的每一次迭代时都用记录与当前集合最匹配，匹配上就迭代，不然就报异常，而迭代器中的
 * 			   remove方法是将记录和当前集合中的元素都删除了，所以迭代能正常执行，也相当于这样能自动更新迭代器 	
 */

public class CollectionTest01 {
	
	public static void main(String[] args) {
		
		//创建集合对象
		Collection c = new ArrayList();
		
		//未向集合添加元素时获取迭代器有什么问题？
		//此时获取的是指向集合没有元素的迭代器，用此迭代器迭代集合是没有元素迭代的
		//所以，只要集合的内容结构发生改变，迭代器必须重新获取
		//当集合结构发生变化，迭代器未重新获取，若调用next()方法，会报异常ConcurrentModificationException
		//建议使用for循环，当要迭代集合时，再循环语句初始化位置获取迭代器，如下方的for循环
		//Iterator it = c.iterator();
		
		//添加元素
		c.add(10);
		c.add(20);
		c.add(60);
		c.add(90);
		
		//for循环迭代集合
		for (Iterator iterator = c.iterator(); iterator.hasNext();) {
			
			Object object =  iterator.next();
			
			//在迭代循环中删除元素
			//若使用的是集合对象的remove进行元素删除，删除后集合的结构就发生了变化
			//然而在循环过程中迭代器是没有重新获取的，就会出现异常ConcurrentModificationException
			//c.remove(20);
			
			//为避免上面这种情况，迭代器中的remove就派上了用场
			iterator.remove();//删除的一定是迭代器指向的当前元素
			System.out.println(object);
		}
		System.out.println("集合长度："+c.size());//0
		System.out.println("==========================");
		
		//获取迭代器
		Iterator it = c.iterator();
		//while循环迭代集合
		while (it.hasNext()) {
			//编写代码时，next()的返回值类型必须是Object类型
			Object object = (Object) it.next();
			System.out.println(object);
		}
	}

}
