

package d���췽��;

public class Test01 {
	
	public static void main(String[] args){
		
		//����User���͵Ķ���
		User i1 = new User();
		User i2 = new User("��ԲԲ");
		User i3 = new User(28);
		User i4 = new User(28,"��ԲԲ");
		
		System.out.println(i1.name);//null
		System.out.println(i1.age);//0
		
		System.out.println(i2.name);//��ԲԲ
		System.out.println(i2.age);//0
		
		System.out.println(i3.name);//null
		System.out.println(i3.age);//28
		
		System.out.println(i4.name);//��ԲԲ
		System.out.println(i4.age);//28
	}

}
