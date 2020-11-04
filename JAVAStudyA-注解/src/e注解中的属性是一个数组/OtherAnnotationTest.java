package e注解中的属性是一个数组;

public class OtherAnnotationTest {
	
	public static void main(String[] args) {
		
		
		
	}
	//数组中是大括号
	@OtherAnnotation(age = 20,email = {"126554@qq.com","778787@qq.com"},seasons = {Season.SPRING,Season.AUTUNM})
	public void m1() {
		
	}
	
	//只放一个元素进数组时大括号可省略
	@OtherAnnotation(age = 20,email = "778787@qq.com",seasons = Season.WINTER)
	public void m2() {
		
	}
	
	/*
		@Target(ElementType.METHOD)
		@Retention(RetentionPolicy.SOURCE)
		所以可以知晓这两个元注解中都有一个枚举数组的属性，且属性名是value，枚举类是ElementType和RetentionPolicy
	 */

}
