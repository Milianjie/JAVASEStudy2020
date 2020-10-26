package lString和int和Integer相互转换;

public class Test {
	
	public static void main(String[] args) {
		
		//String-->int: Integer.parseInt(s)
		System.out.println(Integer.parseInt("123456"));
		
		//String-->Integer:  Integer.valueOf(s)
		System.out.println(Integer.valueOf("4565"));
		Integer a = new Integer("1566");//底层也是调用Integer.valueOf(s)
		
		//int-->String:  1、数字+"";2、String.valueOf(i)
		System.out.println(15 + "456");
		System.out.println(String.valueOf(1232656));
		
		//int-->Integer:  1、Integer.valueOf(i)；2、自动装箱
		Integer b = new Integer(465);//老方法，淘汰，底层调用Integer.valueOf(i)
		Integer c = Integer.valueOf(155);//与上面一样，只不过直接点，淘汰
		Integer d = 465;//自动装箱
		
		//Integer-->String:  1、String.valueOf(e)
		Integer e = 4898;
		System.out.println(String.valueOf(e));
		
		//Integer-->int:  1、自动拆箱；2、intValue()
		Integer f = 44;
		System.out.println(f + 56);//100,自动拆箱，自动调用intValue方法
		int g = f.intValue();//成员方法，对象的引用.调用
		
	}

}
