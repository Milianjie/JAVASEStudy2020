package nHashMap与Hashtable区别;

import java.util.Hashtable;
import java.util.Map;

/*
 * 【区别】:
 * 			HashMap集合中的key和value部分可以为null，且key部分只能有一个null，map.get(null);照样返回key为null的value值
 * 			Hashtable中的key和value都不能为null，是线程安全的
 * 		
 * 			Hashtable底层也是哈希表结构，而且其初始化容量是11，加载因子与HashMap一样都是0.75
 * 
 * 			key经过hashCode方法得出哈希值hash经过哈希算法得出的值作为数组下标，如下：
 * 			int index = (hash & 0x7FFFFFFF) % tab.length;
 * 
 * 【Hashtable】该集合的扩容是原容量乘2再加1
 */

public class HashtableTest01 {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1, "bzxbcn");
		
	}

	

}
