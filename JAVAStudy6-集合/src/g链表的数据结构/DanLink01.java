package g链表的数据结构;

/*
 * 		该类模拟单向链表：链表的数据结构，其基本单元是节点Node
 * 						  对于单向链表来说，他的节点有两个属性：
 * 				1、第一个是存储的数据
 * 				2、第二个是下一个节点对象的内存地址
 */

public class DanLink01 {
	
	//头节点
	Node01 header = null;
	
	int size;
	
	public int size() {
		return size;
	}
	
	//向链表末尾中添加元素的方法
	public void add(Object obj) {
		//创建一个新的节点对象
		//将链表中末尾节点存下一个节点内存地址null赋上新节点对象的内存地址
		//有可能这个节点是第一个，也可能第二、第三个....
		
		if (header == null) {
			//说明还没有节点
			//new一个新的节点对象，作为头节点，改头节点既是头又是尾
			header =new Node01(obj, null);
		}else {
			//说明头节点已经存在
			//找出末节点的next属性，让当前末节点的next是新节点
			Node01 currentLastNode = findLast(header);
			currentLastNode.next = new Node01(obj, null);
		}
		size++;
	}
	
	/**
	 * 专门查找末尾节点的方法
	 * @param node 从传入的该节点开始找
	 * @return
	 */
	private Node01 findLast(Node01 node) {
		// TODO 自动生成的方法存根
		if (node.next == null) {
			return node;
		}
		//通过递归查询初始传入节点的下一个节点，直到找到末尾节点
		return findLast(node.next);
	}

	//删除链表中某个数据的方法
	public void remov(Object obj) {
		
	}
	
	//修改链表中某个数据的方法
	public void modify(Object newobj) {
		
	}
	
	//查找链表中某个数据的方法
	public int get(Object obj) {
		return 1;
	}

}
