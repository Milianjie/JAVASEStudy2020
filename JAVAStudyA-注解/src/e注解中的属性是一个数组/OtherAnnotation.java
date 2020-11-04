package e注解中的属性是一个数组;

public @interface OtherAnnotation {

	/*
	 * 年龄属性
	 */
	int age();
	
	/*
	 * 邮箱属性，多个，用数组
	 */
	String[] email();
	
	/*
	 * 季节枚举属性
	 */
	Season[] seasons();
	
}
