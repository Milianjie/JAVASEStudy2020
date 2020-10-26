
    //关于代码的顺序
package h八static关键字;

public class StaticTest05 {
	
	//编译通过
	static int i=10;
	static{
		System.out.println(i);
	}
	/*
	 * 编译不通过
	
	static{
		System.out.println(i);非法向前引用
	} 
	 * static int i=10;
	 */
	public static void main(String[] args) {
		
		System.out.print(StaticTest05.i);
		
	}

}
