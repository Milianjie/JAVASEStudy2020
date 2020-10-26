package pTreeSet;

import java.util.TreeSet;

/*
 * 		1��TreeSet���ϵײ�ʵ������һ��TreeMap
 * 		2��TreeMap���ϵײ���һ��������
 * 		3���ŵ�TreeSet�����е�Ԫ��ʵ�����Ƿŵ�TreeMap�����е�key��������
 * 		4��TreeSet�����ϵ�Ԫ�أ����򲻿��ظ������ǿ�����Ԫ�ذ���С�Զ�����
 * 							     �ַ��������ǰ����ֵ�˳������ÿһ���ַ���Ƚ�
 * 
 *		���Զ�������ǷŽ�TreeSet���޷�����ġ� 	
 *				ԭ����û��ָ���Զ�����Student����ıȽϹ���������ʾ����
 *				����TreeSet����st���������Student����󣬵���add����������Ž�st������
 *				���Ž���һ��Student������ٷŵڶ���Student����ͻᱨ�쳣��
 *				Exception in thread "main" java.lang.ClassCastException: pTreeSet.Student cannot be cast to java.lang.Comparable
 *				ԭ����TreeSet������Ԫ��Ҫ�Զ����򣬾͵���Student�����໥�Ƚϴ�СCompare�����Զ������û�ж���
 *				һ�ױȽϵĹ��򣬾ͻᱨ�쳣
 *		
 *		���ײ�ִ��ԭ��
 *				TreeSet��add�����ײ����TreeMap�е�put������TreeMap����һ���Ƚ���comparator
 *				��comparator�ڹ��췽���������϶���ʱ���Ը��Ƚ��������ȥ������ʾ���ǵ����޲������췽���������϶���
 *				����˵�����Ԫ��ʱ��ʹ�ñȽ���������ʹ����һ��ʵ�ֽӿ�Comparable�еıȽϷ�������keyֵ�ıȽ�������
 *				��ʱcomparator����Ϊnull
 *				put���������ж�comparator�㷨Ϊnull������������null��ת��һ��else��䣬������ȰѴ���ȥ��key
 *				��ǿ��ת����һ�����ڵ���comparTo�������ࣺ
 *				Comparable<? super K> k = (Comparable<? super K>) key;	
 *				������ʾ�������쳣�����޷����µ�keyǿ��ת����Comparable���͵ģ�ԭ�����Զ�����û��ʵ��Comparable�ӿڡ�
 *				Ȼ����ת���ɵ�k���ñȽϷ������ȴ����key�Ƚϣ�
 *				cmp = k.compareTo(t.key);	
 *				if (cmp < 0)
                    t = t.left;
                else if (cmp > 0)
                    t = t.right;
                else
                    return t.setValue(value);
                ������ʾ�������쳣�����޷����µ�keyǿ��ת����Comparable���͵ģ�ԭ�����Զ�����û��ʵ��Comparable�ӿڡ�
                ��ôʵ������ӿڣ���Ӧ�����������д�Ƚ��Զ��������ĸ����ԵĴ��룬��ʱ�����Զ��������Ž�TreeSet����
         TreeMap���ϾͿ��԰��������ض������ԱȽϴ�С
                
                 
 * 
 */
public class TreeSetTest01 {
	
	public static void main(String[] args) {
		
		//���ַ�����ȥ�������ֵ�˳�������������
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
		
		//�洢Integer��װ�࣬������ֵ��С�����������
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
		
		//�洢�Զ������������޷���������Զ������
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
		
		System.out.println("st�����е�Ԫ������"+st.size());
		
		for (Student student : st) {
			System.out.println(student);
		}
		
		
	}

}

class Student{
	
	int  age;
	public Student() {
		// TODO �Զ����ɵĹ��캯�����
	}
	public Student(int age) {
		super();
		this.age = age;
	}
	
	//��дtoString
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		return "student's age = "+age;
	}
	
}
