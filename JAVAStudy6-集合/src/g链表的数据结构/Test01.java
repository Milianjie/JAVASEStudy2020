package g链表的数据结构;

public class Test01 {
	
	public static void main(String[] args) {
		
		//创建单向链表对象
		DanLink01 link01 = new DanLink01();
		
		//往链表添加节点，调用DanLink01中的add，就创建了Node类的对象
		//我们可以这样理解链表，链表只是一种具有对数据或者对象有特别的操作方式的数据结构，
		//并不是有这样一种内存空间，因为节点是一个对象，存储在堆中，节点中的属性有数据和下一节点的内存地址
		//我们定义的这种类，叫做链表，类中有许多与其他类不同的对数据或对象的操作方法
		//同理，如数组、二叉树、哈希表等都是有对对象或数据有它们独特的操作方法（包括存储方式，添加方式等等）
		//我们也不用自己写这些的类，java中已经写好了
		link01.add(100);
		link01.add(200);
		link01.add(300);
		
		//获取链表中的元素个数
		System.out.println(link01.size);//3

		
	}
	
}
