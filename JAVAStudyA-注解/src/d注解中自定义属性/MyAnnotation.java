package d注解中自定义属性;

/*
 * 	自定义注解@MyAnnotation
 * 	自定义注解中的自定义属性
 */

public @interface MyAnnotation {
	
	/**
	 * 自定义注解中的属性，下面这个是注解MyAnnotation的name属性
	 * @return
	 */
	String name();
	
	/*
	 * 颜色属性
	 */
	String color();
	
	/*
	 * 年龄属性,为该属性设置一个默认值
	 */
	int age() default 25;

}
