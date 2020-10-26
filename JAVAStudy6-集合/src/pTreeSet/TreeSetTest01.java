package pTreeSet;

import java.util.TreeSet;

/*
 * 		1、TreeSet集合底层实际上是一个TreeMap
 * 		2、TreeMap集合底层是一个二叉树
 * 		3、放到TreeSet集合中的元素实际上是放到TreeMap集合中的key部分上了
 * 		4、TreeSet集合上的元素：无序不可重复，但是可以让元素按大小自动排序
 * 							     字符串排序是按照字典顺序升序，每一个字符相比较
 * 
 *		【自定义的类是放进TreeSet是无法排序的】 	
 *				原因是没有指定自定义类Student对象的比较规则，在下面示例中
 *				创建TreeSet集合st，创建多个Student对象后，调用add方法将对象放进st集合中
 *				当放进第一个Student对象后再放第二个Student对象就会报异常：
 *				Exception in thread "main" java.lang.ClassCastException: pTreeSet.Student cannot be cast to java.lang.Comparable
 *				原因是TreeSet集合中元素要自动排序，就得拿Student对象相互比较大小Compare，而自定义的类没有定义
 *				一套比较的规则，就会报异常
 *		
 *		【底层执行原理】
 *				TreeSet是add方法底层调用TreeMap中的put方法，TreeMap中有一个比较器comparator
 *				该comparator在构造方法创建集合对象时可以赋比较器对象进去，下面示例是调用无参数构造方法创建集合对象，
 *				就是说在添加元素时不使用比较器来排序，使用另一个实现接口Comparable中的比较方法进行key值的比较来排序
 *				此时comparator就是为null
 *				put方法中先判断comparator算法为null，我们这里是null，转到一个else语句，该语句先把传进去的key
 *				先强制转换成一个用于调用comparTo方法的类：
 *				Comparable<? super K> k = (Comparable<? super K>) key;	
 *				【下面示例出的异常就是无法将新的key强制转换成Comparable类型的，原因是自定义类没有实现Comparable接口】
 *				然后用转换成的k调用比较方法与先存入的key比较：
 *				cmp = k.compareTo(t.key);	
 *				if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
                【下面示例出的异常就是无法将新的key强制转换成Comparable类型的，原因是自定义类没有实现Comparable接口】
                那么实现这个接口，就应该是在里面编写比较自定义类中哪个属性的代码，到时将该自定义类对象放进TreeSet或者
         TreeMap集合就可以按对象中特定的属性比较大小
                
                 
 * 
 */
public class TreeSetTest01 {
	
	public static void main(String[] args) {
		
		//存字符串进去，按照字典顺序排序，升序输出
		TreeSet<String> ts1 = new TreeSet<>();
		
		ts1.add("zhangsan");
		ts1.add("lisi");
		ts1.add("wangwu");
		ts1.add("zhouliu");
		ts1.add("zhaoqi");
		
		for (String string : ts1) {
			System.out.println(string);
						/*
							lisi
							wangwu
							zhangsan
							zhaoqi
							zhouliu
				 					*/
		}
		
		//存储Integer包装类，按照数值大小排序，升序输出
		TreeSet<Integer> ts2 = new TreeSet<>();
		
		ts2.add(200);
		ts2.add(900);
		ts2.add(20);
		ts2.add(3000);
		ts2.add(62);
		ts2.add(100);
		
		for (Integer integer : ts2) {
			System.out.println(integer);
		}
		
		//存储自定义的类对象是无法对其进行自动排序的
		TreeSet<Student> st = new TreeSet<>();
		
		Student s1 = new Student(20);
		System.out.println(s1);
		Student s2 = new Student(32);
		Student s3 = new Student(23);
		Student s4 = new Student(15);
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		
		System.out.println("st集合中的元素数："+st.size());
		
		for (Student student : st) {
			System.out.println(student);
		}
		
		
	}

}

class Student{
	
	int  age;
	public Student() {
		// TODO 自动生成的构造函数存根
	}
	public Student(int age) {
		super();
		this.age = age;
	}
	
	//重写toString
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		return "student's age = "+age;
	}
	
}
