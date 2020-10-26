package l哈希表的数据结构;

import java.util.HashMap;
import java.util.Map;


/*
 * HashMap集合：
 * 			1、HashMap集合底层的哈希表/散列表的数据结构
 * 			2、哈希表数据结构
 * 				哈希表是一个数组和单向链表的结合体
 * 				数组：查询效率高，随机增删效率低
 * 				链表：查询效率低，随机增删效率高
 * 			哈希表则将两者结合，发挥它们各自的优点。
 * 			3、HashMap集合底层源码：
 * 			public class HashMap<K,V>{
 * 
 * 				//HashMap底层就是一个数组（一维数组）
 * 				transient Node<K,V>[] table;
 * 			
 * 				//静态内部类，实现的是继承于Map接口中的静态内部接口，HashMap集合中的键值对是该类new对象存储
 * 				static class Node<K,V> implements Map.Entry<k,V>{
 * 					
	 					final int hash;//哈希值--是key的hashCode()方法执行的结果，哈希值通过哈希算法可转化为数组下标
	        			final K key;//存储到Map集合中的key
	        			V value;//存储到Map集合中的value
	        			Node<K,V> next;//下一个节点的内存地址
 * 			
 * 			}
 * 		}
 * 			【结论】哈希表/散列表：一维数组，这个数组中的每一个元素是一个单向链表
 * 
 * 			【掌握】：map.put(k,v)和v = map.get(k);这两个方法底层的执行原理
 * 
 * 			【put(k,v)方法执行实现原理】：
 * 			第一步：调用put方法，底层创建Node对象（或者说Node节点），先将传入的参数k,v封装到Node对象中。
 * 
 * 			第二步：底层会调用k类型的hashCode方法将k值经过该方法从而得到一个该k的哈希值hash
 * 			然后把经过哈希算法得出的的哈希值作为数组的下标，如果发现数组中该下标位置没有存储元素，直接将该
 * 			Node对象放进数组该下标为hash的位置，作为数组元素。但如果该下标对应位置有链表了，此时就拿k值和链表上
 * 			每个节点的k值进行equals方法比较，若所有的equals返回的都是false，那么将这个新节点添加进该链表的末尾
 * 			但如果有一个equals返回true，由于不可重复，该节点k不边，但是value值被新节点的value值覆盖。
 * 			
 * 			【get(k)方法执行实现原理】：
 * 			第一步：调用get(k)方法，将传入的k值调用k所属类的hashCode()方法对k值经过哈希算法得出哈希值hash，在经过哈希算法转换作为查找的数组下标，
 * 			利用hash定位数组中下标的位置，如果该下标位置啥也没有，返回null。如果该位置有个单向链表，就拿着k值和链表中的每个节点
 *			中的k作equals方法比较，返回的都是false，那么get方法返回null，若某个节点返回true，该节点就是我们要找的目标，get方法返回该节点的value
 *
 *			【结论】HashMap集合，就是将所有键值对存进链表中的每一个节点中，然后以这些节点中的key属性存储的值进行分类（用hashCode方法），不同类的
 *					节点以用该节点k值得出的哈希值转成的下标区分，得出的哈希值相同就属同一类，该下标就是数组中的下标（位置），那么
 *					如果用get方法查询某个value就可以用hashCode方法先得出输入参数k的哈希值转成下标就可以判断在哪个下标位置的链表，其余的就不需要比对了。
 *					相比于将所有节点放在一个链表上一个一个比对，查询效率提高了很多，但又比数组低。
 *
 *			所以说存进HashMap集合的Key部分数据类中一定要重写equals和hashCode方法! ! !
 *	
 *			4、HashMap集合特点：
 *			无序，不可重复
 *			无序是因为添加的键值对不知道放在哪个链表上
 *			不可重复是equals方法保证key不可重复，但若重复，value会被新的覆盖
 *			
 *			放在HashMap集合中key部分相当于放在HashSet集合中，所以HashMap集合中的元素的类要重写hashCode和equals方法
 *
 *			5、哈希表HashMap使用不当时无法发挥其性能
 *			假设所有的hashCode方法返回一个固定值，底层的哈希表就变成了纯单向链表：被称作散列分布不均匀
 *			散列分布均匀：
 *				假设100个元素，10个单向链表，那么每个单向链表存10个节点是做好的
 *			若返回值设定都不一样的值，就变成纯数组了，没有链表概念了
 *	
 *			6、重点：放在HashMap集合的key部分元素和HashSet集合中的元素的类需要重写hashCode和equals方法
 *			
 *			7、HashMap集合的初始化容量是16（底层数组长度），默认加载因子0.75
 *				默认加载因子表示当HashMap集合里面的元素存到容量的75%时，底层数组开始扩容。
 *				当我们自己初始化容量时，容量大小最好是2的倍数，官方推荐，提高存储效率
 *
 *			
 *			
 *					
 */

public class HashMapTest01 {
	
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "bnnn");
	}

}
