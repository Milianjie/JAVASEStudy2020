

package d构造方法;

public class Test01 {
	
	public static void main(String[] args){
		
		//创建User类型的对象
		User i1 = new User();
		User i2 = new User("陈圆圆");
		User i3 = new User(28);
		User i4 = new User(28,"陈圆圆");
		
		System.out.println(i1.name);//null
		System.out.println(i1.age);//0
		
		System.out.println(i2.name);//陈圆圆
		System.out.println(i2.age);//0
		
		System.out.println(i3.name);//null
		System.out.println(i3.age);//28
		
		System.out.println(i4.name);//陈圆圆
		System.out.println(i4.age);//28
	}

}
