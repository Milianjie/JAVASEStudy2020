package q实现Comparable接口及比较规则;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		//创建Customer对象
		Customer c1 = new Customer("a", 1001, 15);
		Customer c2 = new Customer("b", 1001, 15);
		Customer c3 = new Customer("c", 1002, 16);
		Customer c4 = new Customer("d", 1003, 16);
		Customer c5 = new Customer("e", 1001, 22);
		Customer c6 = new Customer("f", 1008, 18);
		Customer c7 = new Customer("g", 1002, 16);
		Customer c8 = new Customer("h", 1006, 17);
		Customer c9 = new Customer("i", 1002, 16);
		Customer c10 = new Customer("j", 1008, 18);
		Customer c11 = new Customer("k", 1009, 15);
		
		//创建TreeSet集合
		TreeSet<Customer> ts = new TreeSet<>();
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		ts.add(c5);
		ts.add(c6);
		ts.add(c7);
		ts.add(c8);
		ts.add(c9);
		ts.add(c10);
		ts.add(c11);
		
		for (Customer customer : ts) {
			System.out.println(customer);
		}
		
	}

}

/*
 * 放在TreeSet或者TreeMap集合key部分的元素的类需要实现Comparable接口
 * 而且一定要事项comparTo方法，equals方法可以不重写
 */
class Customer implements Comparable<Customer> {//接口的泛型写要比较的类
	
	private String name;
	
	private int no;

	private int age;
	
	public Customer() {
		// TODO 自动生成的构造函数存根
	}

	public Customer(String name, int no, int age) {
		super();
		this.name = name;
		this.no = no;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", no=" + no + ", age=" + age + "]";
	}

	/*
	 * （非 Javadoc）
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * 需要在该方法中编写比较的逻辑，或者说比较的规则，以按照什么进行比较
	 * k.comparTo(t.key)
	 * 拿着参数k和集合中每一个k进行比较，返回int类型，可能是>0、<0或者=0
	 */
	@Override
	public int compareTo(Customer c) {
		//调用方法是c1.comparTo(c2)
		// 谁调用该方法this指向谁，所以this=c1
		//而c2传进来给c，所以有c=c2
		
		//比较规则是按对象的年龄属性比较大小，若年龄一样按号码比较
		//再否者根据名字字母的每个对应字符按字典顺序比较
		//当然在TreeMap集合中返回0，value会被覆盖
		if (this.age != c.age) {
			
			return this.age-c.age;//返回新的减原来的，是升序排列输出
			
		}else if (this.no != c.no) {
			
			return this.no-c.no;
		}
		return this.name.compareTo(c.name);//这里调用用String类中重写的comparTo方法
	}
	
	
	
	
}