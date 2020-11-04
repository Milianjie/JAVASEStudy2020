package d注解中自定义属性;


public @interface OtherAnnotation {
	
	String value();
	
	int age() default 20;

}
