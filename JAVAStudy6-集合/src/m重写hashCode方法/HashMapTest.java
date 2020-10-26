package m重写hashCode方法;

import java.util.HashSet;
import java.util.Set;

/*
 * 【关于重写hashCode和equals方法】
 * 		当向Map集合中存储键值对元素或者取键值对元素时，都是先调用key的hashCode方法，判断键值对应该存在数组的哪个下标位置/从哪个下标位置取出
 * 		然后调用equals方法判断传入的key参数与目标位置或者目标链表的哪个节点对象中的key值相同
 * 	用put方法举例：
 * 		k.hashCode()返回一个哈希值，经过哈希算法转成数组下标
 * 		到数组中去操作，如果发现数组中的该下标位置是null，直接放节点对象上去，此时quals方法不执行
 * 	get(k)方法举例：
 * 		k.hashCode()返回一个哈希值，经过哈希算法转成数组下标
 * 		到数组中去操作，如果发现数组中的该下标位置是null，返回null，equals方法不执行
 * 
 * 【结论】：一个类中的equals重写了，hashCode方法也必须要重写
 * 			在Map集合中，equals返回true，hashCode一定会返回true
 * 			放在HashMap集合中的key部分以及HashSet集合中的元素的类，equals和hashCode方法需同时重写
 * 
 * 	【注意】重写这两个可以用编译器自动生成而且要同时生成，如果该类中有多个属性，如果创建多个对象给这些属性赋值
 * 			你希望这多个对象是同一个实例需要这些对象中属性全部一致才允许的话，在自动重写上面两个
 * 			方法的选择界面将所有属性都打勾，若只要某一个属性相同，这些对象就都相同，那就只在该属性上打勾
 * 
 * 【JDK8后的优化】 当HashMap集合中数组的某一单向链表节点大于8个时，该单向链表自动转成红黑树数据结构
 * 				     但是当红黑树中的对象少于6个时，又自动转成单向链表结构
 * 				     这保证了检索的效率，因为一个单向链表有过多节点就会降低效率
 * 
 * 		
 */

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student( "赵敏");
		Student s2 = new Student( "赵敏");
		
		//重写Student的equals之前是false
		//System.out.println(s1.equals(s2));//false
		
		//重写equals之后
		System.out.println(s1.equals(s2));
		
		System.out.println("s1的hashcode是："+s1.hashCode());//未重写hashCode方法时：517938326  重写后：35605639
		System.out.println("s2的hashcode是："+s2.hashCode());//未重写hashCode方法时：914424520  重写后：35605639
		
		//当单单重写equals方法使其比较内容后，s1.equals(s2)==true，表示s1和s2是一样的
		//那么往一个HashSet集合存放它们，由于不可重复，里面存的只会有一个
		//此时并没有重写hashCode方法
		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		
		System.out.println(students.size());//只重写Student的equals并没有重写hashCode输出：2
	}

}
