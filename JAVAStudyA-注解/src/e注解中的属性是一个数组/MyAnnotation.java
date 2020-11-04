package e注解中的属性是一个数组;

public @interface MyAnnotation {
	
	/*
	 * 注解当中的属性类型可以有：
	 * 	byte short int long float double char boolean String Class 以及枚举类型
	 * 还有以上的数组形式
	 */
	
	int value1();
	
	String value2();
	
	int[] value3();
	
	String[] value4();
	
	Season value5();
	
	Season[] value6();
	
	Class parameterType();
	
	Class[] parameterTypes();
	

}
