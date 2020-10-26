package kMap接口常用方法;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
 * 遍历Map集合需要的两个方法
 */

public class MapTest02 {
	
	public static void main(String[] args) {
		
		//创建Map集合对象
		Map<Integer, String> map1 = new HashMap<>();
		
		//往集合添加键值对
		map1.put(1, "黎燕");
		map1.put(2, "林黛玉");
		map1.put(3, "朴初珑");
		map1.put(4, "穆宛儿");
		map1.put(5, "江玉燕");
		
		//先获取Map集合中所有的key
		Set<Integer> set = map1.keySet();
		
		/*
		 * 第一种方式遍历
		 */
		//通过for或者for/each循环遍历存储所有key的Set集合，利用get方法获取每个key对应的value
		for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();) {
			Integer integer = iterator.next();
			System.out.println(integer+" = "+map1.get(integer));
		}
		System.out.println("========================================");
		for (Integer integer : set) {
			System.out.println(integer+" = "+map1.get(integer));
		}
		
		System.out.println("========================================");
		/*
		 * 第二种方式遍历：Set<Map.Entry<K,V>> entrySet()
		 * 因为Map接口有三个实现类，而Map接口中的静态内部类Map.Entry（或者说静态内部接口）在Map接口
		 * 被HashMap或者HasTable等实现时Map.Entry接口也会被实现类的内部类实现，本例定义的是HashMap集合，查看
		 * 其源码发现，Map.Entry接口被HashMap中的静态内部类HashMap.Node实现了，Node类中的属性有key和value（不仅仅），所以严格上来将
		 * 我们通过Set<Map.Entry<K,V>> entrySet()方法将map集合转换成Set集合后，Set集合中的对象类型是Node类对象
		 * 就是说上面的方法就是将存储键值对的内部类对象放进了Set集合中，也间接说明HashMap集合中的key和value是以内部类对象
		 * 存储的，可以看一下下一个包里的知识
		 */
		Set<Map.Entry<Integer, String >> set2 = map1.entrySet();
		//遍历set2集合，每一次取出一个Node
		for (Iterator<Map.Entry<Integer, String >> iterator = set2.iterator(); iterator.hasNext();) {
			Map.Entry<Integer, String> node = iterator.next();
			//Node中key和value两个属性存储Map集合转化过来的键与值，所以如下
			Integer i = node.getKey();
			String s = node.getValue();
			System.out.println(i+" = "+s);
		}
		System.out.println("========================================");
		for (Map.Entry<Integer, String> node : set2) {
			System.out.println(node.getKey()+"="+node.getValue());
		}
	}

}
