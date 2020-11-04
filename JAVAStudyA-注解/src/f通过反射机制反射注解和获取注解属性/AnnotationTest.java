package f通过反射机制反射注解和获取注解属性;

@ReflectAnnotation
public class AnnotationTest {
	
	int i;
	
	@ReflectAnnotation(username = "朴初珑",password = "123456789001")
	public void m1() {
		
	}

}
