package i泛型机制;

/*
 * 自定义泛型：在类名后添加箭头括号<里面的标识符随便写>，
 * 		箭头括号里的标识符可以放在类中需要输入参数但不确定定义什么类型
 * 		的类位置
 * 源码中一般出现的是<E>和<T>,E是element缩写，T是type缩写
 */

public class GenericTest03<不确定的类且可以随便写的标识符> {
	
	public static void main(String[] args) {
		
		//使用泛型机制创建对象
		GenericTest03<String> g1 = new GenericTest03<>();//箭头括号填的是String，那么该对象调用的方法中需要参数类型就得是String类型
		
		//类型不匹配
		//g1.out(100);
		g1.out("朴孝敏");
		
		//更换箭头括号的类型
		GenericTest03<Integer> g2 = new GenericTest03<>();
		
		//类型不匹配
		//g2.out("朴孝敏");
		g2.out(100);
		
		String s1 = g1.get();
		Integer i1 = g2.get();
		
		//不使用泛型new对象,默认用原始类型
		GenericTest03 g3 = new GenericTest03();
		
		g3.out("阿敏");//类型不安全
		Object o = g3.get();
		
	}
	
	//可使用泛型的类中的成员方法
	public void out(不确定的类且可以随便写的标识符 s) {
		System.out.println(s);
	}
	
	public 不确定的类且可以随便写的标识符 get() {
		return null;
	}

}
