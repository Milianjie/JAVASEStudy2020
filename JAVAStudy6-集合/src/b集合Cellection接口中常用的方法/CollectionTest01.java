package b集合Cellection接口中常用的方法;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 关于java.util.Collection接口中的常用方法
 * 		1、Collection中能存放什么元素？
 * 			没有使用泛型之前，Collection中可以存储Object的所有子类型
 * 			使用泛型之后，Collection只能存储某个具体的子类型
 * 			集合后期学习泛型语法，目前不需要管，Collection存储任何类型
 * 			只要是Object的子类型就可。(集合中不能直接存储基本数据类型和java对象
 * 			只能存储java对象的内存地址)
 * 		2、Collection中的常用方法
 * 			（1）boolean add(Object e)  --向集合中添加元素
 * 			（2）int size()  --返回此 collection 中的元素数。
 * 			（3）void clear() --移除此 collection 中的所有元素（可选操作）。
 * 			（4）boolean contains(Object o)  --如果此 collection 包含指定的元素o，则返回 true，否者返回false。
 * 			（5）boolean remove(Object o) --从此 collection 中移除指定元素的单个实例，如果存在的话（可选操作）。
 * 			（5）boolean isEmpty()  --判断集合是否为空， 如果此 collection 不包含元素，则返回 true。
 * 			（6）Object[] toArray() --调用该方法将集合转换成数组
 */

public class CollectionTest01 {
	
	public static void main(String[] args) {
		
		//创建集合对象
		//Collection c = new Collection();--接口是抽象的，不能实例化对象
		
		//多态
		Collection c = new ArrayList();
		
		//测试Collection中的常用方法
		/*
		 * 向集合中添加元素
		 */
		c.add(1000);//自动装箱，底层包装类Integer将1000转换成了Integer对象
		c.add(3.14);//Double包装类自动装箱(JDK5新特性)
		c.add(true);//自动装箱
		c.add(new Object());
		
		/*
		 * 获取集合中元素的个数
		 */
		System.out.println("集合c中元素的个数为："+c.size());//4
		
		/*
		 * 清空集合中的元素
		 */
		c.clear();
		System.out.println("集合c中元素的个数为："+c.size());//0
		
		//再添加元素
		c.add("hello");//将字符串对象的内存地址放入集合
		c.add("中国人");
		c.add("木兰");
		c.add("小杰");
		
		/*
		 * 判断集合中是否包含某个指定元素，如"木兰"
		 */
		boolean b1 = c.contains("木兰");//true
		System.out.println(b1);
		boolean b2 = c.contains("小兰");//false
		System.out.println(b2);
		
		System.out.println("集合c中元素的个数为："+c.size());//4
		
		/*
		 * 删除某个指定元素，如果存在的话
		 */
		c.remove("hello");
		System.out.println("集合c中元素的个数为："+c.size());//3
		
		/*
		 * 简称集合是否包含元素，否，返回true
		 */
		System.out.println(c.isEmpty());//false
		c.clear();
		System.out.println(c.isEmpty());//true
		
		//再添加元素
				c.add("hello");//将字符串对象的内存地址放入集合
				c.add("中国人");
				c.add("木兰");
				c.add("小杰");
				
		/*
		 * 将集合转换成Object数组
		 */
		Object[] o = c.toArray();
		for (int i = 0; i < o.length; i++) {
			Object object = o[i];
			System.out.println(object);//编译时发现是Object类的引用内存地址，Object中有toString
									//运行时调用的仍然是Object子类中重写的toString方法
		}
	}

}
