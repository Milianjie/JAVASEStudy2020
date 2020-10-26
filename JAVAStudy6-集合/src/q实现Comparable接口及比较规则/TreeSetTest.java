package qʵ��Comparable�ӿڼ��ȽϹ���;

import java.util.TreeSet;

public class TreeSetTest {
	
	public static void main(String[] args) {
		
		//����Customer����
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
		
		//����TreeSet����
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
 * ����TreeSet����TreeMap����key���ֵ�Ԫ�ص�����Ҫʵ��Comparable�ӿ�
 * ����һ��Ҫ����comparTo������equals�������Բ���д
 */
class Customer implements Comparable<Customer> {//�ӿڵķ���дҪ�Ƚϵ���
	
	private String name;
	
	private int no;

	private int age;
	
	public Customer() {
		// TODO �Զ����ɵĹ��캯�����
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
	 * ���� Javadoc��
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 * ��Ҫ�ڸ÷����б�д�Ƚϵ��߼�������˵�ȽϵĹ����԰���ʲô���бȽ�
	 * k.comparTo(t.key)
	 * ���Ų���k�ͼ�����ÿһ��k���бȽϣ�����int���ͣ�������>0��<0����=0
	 */
	@Override
	public int compareTo(Customer c) {
		//���÷�����c1.comparTo(c2)
		// ˭���ø÷���thisָ��˭������this=c1
		//��c2��������c��������c=c2
		
		//�ȽϹ����ǰ�������������ԱȽϴ�С��������һ��������Ƚ�
		//�ٷ��߸���������ĸ��ÿ����Ӧ�ַ����ֵ�˳��Ƚ�
		//��Ȼ��TreeMap�����з���0��value�ᱻ����
		if (this.age != c.age) {
			
			return this.age-c.age;//�����µļ�ԭ���ģ��������������
			
		}else if (this.no != c.no) {
			
			return this.no-c.no;
		}
		return this.name.compareTo(c.name);//���������String������д��comparTo����
	}
	
	
	
	
}