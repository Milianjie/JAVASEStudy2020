package g链表的数据结构;

/*
 * 该类模拟单向链表的节点
 */
public class Node01 {
	
	//节点中存储的数据
	Object element;
	
	//节点中存储的下一个节点的内存地址
	Node01 next;
	
	public Node01(Object obj, Node01 next) {
		// TODO 自动生成的构造函数存根
		this.element = obj;
		this.next = next;
	}

}
