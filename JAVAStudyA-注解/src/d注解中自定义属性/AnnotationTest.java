package d注解中自定义属性;

public class AnnotationTest {
	
	public static void main(String[] args) {
		
		
	}
	
	/*
	 * 如果一个注解当中有没有设置默认值的属性，在标注方法、字段上时需要给属性赋值
	 * 不然会报错
	 */
	//@MyAnnotation(属性名 = 属性值,属性名 = 属性值)
	@MyAnnotation(name = "alibaba",color = "红色",age = 26)
	public void m1() {
		
	}
	//属性指定默认值后该属性可写可不写，就如@Deprecated注解中就有设定默认值的属性（JDK9之后）
	@MyAnnotation(name = "alibaba",color = "红色")
	public void m2() {
		
	}
	
	//当注解中的属性名为value,且z这个注解只有该属性或者有其他属性但都有默认值时，属性名value可省略
	@OtherAnnotation("niupi")
	public void m3() {
			
	}
	//虽然有默认值，但是要将其他属性也要写上来的话value不能省略，如下报错
//	@OtherAnnotation("niupi",age = 20)
//	public void m4() {
//			
//	}
	@OtherAnnotation(value = "niupi",age = 20)
	public void m4() {
			
	}
	
	

}
