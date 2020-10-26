package j数字格式化异常;

/*
 * 		所学过的经典异常：
 * 			空指针异常：NullPointException
 * 			类型转换异常：ClassCastException
 * 			数组下标越界异常：ArrayIndexOutOfBoundsEception
 * 			数字格式化异常：NumberFormatException
 */

public class ExceptionTest {
	
	public static void main(String[] args) {
		
		//手动装箱
		Integer x = new Integer(1000);
		
		//手动拆箱
		int y = x.intValue();
		System.out.println(y);
		
		//放字符串进去至少得是数字字符串
		Integer d = new Integer("565656");
		
		//以下代码编译没有问题，符合Java语句语法，Integer有传字符串进去的构造方法
		//但是运行时会报异常java.lang.NumberFormatException
		//Integer a = new Integer("中国人");
		
		
	}

}
