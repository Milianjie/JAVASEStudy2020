package kMap接口常用方法;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * java.util.Map接口中常用的方法：
 * 		1、Map和Collection没有继承关系
 * 		2、Map集合以key和value（键值对）的方式存储数据
 * 			key和value都是引用数据类型
 * 			key和value都是存储对象的内存地址
 * 			key起主导的地位，value是key的附属品
 * 		3、Map接口中常用的方法
 * 			V put(K key, V value) --向Map集合中添加键值对。将指定的值与此映射中的指定键关联（可选操作）。 
 * 			void clear() --清空Map集合。 从此映射中移除所有映射关系（可选操作）。
 * 			boolean containsKey(Object key) --判断Map中是否包含某个key。 如果此映射包含指定键的映射关系，则返回 true。  
 * 			boolean containsValue(Object value) --判断Map中是否包含某个value。 如果此映射将一个或多个键映射到指定值，则返回 true。 
 * 			boolean isEmpty() --判断Map集合元素个数是否为空。如果此映射未包含键-值映射关系，则返回 true。
 * 			V get(Object key) --获取Map集合中所有的key（所有的key是一个Set集合） 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
 * 			V remove(Object key) --通过key删除该key的键值对。如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
 * 			int size() --获取Map集合中键值对的个数。返回此映射中的键-值映射关系数。  
 * 			Collection<V> values() --获取Map集合中所有的value，返回一个Collection。 返回此映射中包含的值的 Collection 视图。
 * 
 * 			Set<Map.Entry<K,V>> entrySet() --将Map集合转换成Set集合。返回此映射中包含的映射关系的 Set 视图。
 * 				假设一个Map集合如下：
 * 			map1集合的对象：
 * 				key			value
 * ------------------------------------------
 * 				1			zhangsan
 * 				2			lisi
 * 				3			wangwu
 * 				4			zhouliu
 * 			经过entrySet方法后：Set set = map1.entrySet();
 *     		set集合的对象为：
 *     			1=zhangshan
 *     			2=lisi
 *     			3=wangwu
 *     			4=zhouliu
 *     【注意】Map集合经过entrySet方法转换成Set集合后，Set集合中的元素类型是Map.Entry类的
 *     		因为类Map.Entry是在Map接口中的静态内部类（内部接口），这种类在内部是仍然是class Entry{}
 *     		定义的，但是类的名称要加外部类前缀来显示它是一个静态内部类，因为有<>，所以它也支持泛型
 */

public class MapTest01 {
	
	public static void main(String[] args) {
		
		//创建Map集合对象
		Map<Integer, String> map1 = new HashMap<>();
		
		//往集合添加键值对
		map1.put(1, "黎燕");
		map1.put(2, "林黛玉");
		map1.put(3, "朴初珑");
		map1.put(4, "穆宛儿");
		map1.put(5, "江玉燕");
		
		//获取集合键值对的个数
		System.out.println(map1.size());//5
		
		//判断集合是否包含某个key
		//contains方法底部都是调用重写的equals方法，所以自定义的类一定要重写equals
		System.out.println(map1.containsKey(3));//true
		
		//判断集合是否包含某个value
		System.out.println(map1.containsValue("林黛玉"));
		
		//获取集合中的所有key，返回的是一个Set集合
		Set<Integer> key = map1.keySet();
		for (Integer integer : key) {
			System.out.println(integer);
		}
		
		//获取集合中所有的value，返回的是一个Collection
		Collection<String> value = map1.values();
		for (String string : value) {
			System.out.println(string);
		}
		
		//通过key删除某对key-value
		map1.remove(4);
		System.out.println(map1.size());
		
		//判断集合是否为空
		System.out.println(map1.isEmpty());
		
		//清空Map集合
		map1.clear();
		System.out.println(map1.size());
	}

}
