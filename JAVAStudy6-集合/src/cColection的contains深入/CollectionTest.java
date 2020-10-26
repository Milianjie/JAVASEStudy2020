package cColection的contains深入;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Collection集合中的contains方法深入
 */

public class CollectionTest {
	
	public static void main(String[] args) {
		
		//创建集合对象
		Collection collection  = new ArrayList();
		
		//添加元素
		String string1 = new String("abc");
		String string2 = new String("def");
		collection.add(string1);
		collection.add(string2);
		
		//新建一个String对象
		String x= new String("abc");
		
		//集合中元素的个数
		System.out.println("集合中元素个数："+collection.size());
		
		//问collection中是否包含x？答案是否定的，因为集合中存储的是内存地址x!=String1
		//但是我们一般用集合都是用它存储对象的，取出来的是具体对象或者数字，所以
		//在判断某元素是否在集合中的contains方法肯定不能单单比较地址，还得比内容
		//所以contains方法底层一定调用了重写后的equals方法
		
		//用contains判断x是否在collection中
		System.out.println(collection.contains(x));//true

		
	}

}
