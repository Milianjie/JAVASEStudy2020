package f通过反射机制反射注解和获取注解属性;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectAnnotationTest {
	
	public static void main(String[] args) throws Exception{
		
		//获取AnnotationTest的Class
		Class annotationTestClass = Class.forName("f通过反射机制反射注解和获取注解属性.AnnotationTest");
		
		/*
		 * 判断类上面的注解以及获取该注解对象还有获取该注解对象的属性值
		 */
		//判断获取的.class文件对象是否包含@ReflectAnnotation,当然这也是判断AnnotationTest类上面是否有@ReflectAnnotation
		System.out.println(annotationTestClass.isAnnotationPresent(ReflectAnnotation.class));//true
		if (annotationTestClass.isAnnotationPresent(ReflectAnnotation.class)) {
			
			//获取注解对象
			ReflectAnnotation ran = (ReflectAnnotation)annotationTestClass.getAnnotation(ReflectAnnotation.class);
			System.out.println("类上面的注解对象："+ran);//@f通过反射机制反射注解和获取注解属性.ReflectAnnotation()
			
			//有了注解对象，就像调接口一样直接调就可以获取注解的属性了
			String value = ran.value();
			System.out.println(value);//北京天安门广场	--因为在类上面标注该注解用的是默认的属性值
			System.out.println(ran.username());//钟荣杰
			System.out.println(ran.password());//123456789987654321
		}
		
		//判断String类（String.class文件）上面是否有@ReflectAnnotation
		Class stringClass = Class.forName("java.lang.String");
		System.out.println(stringClass.isAnnotationPresent(ReflectAnnotation.class));//false
		
		/*
		 * 判断类中方法上的注解，并执行上面的操作
		 */
		//首先要获取指定的Method
		Method m1Method = annotationTestClass.getDeclaredMethod("m1");
		
		//判断这个方法上是否有@ReflectAnnotation
		System.out.println(m1Method.isAnnotationPresent(ReflectAnnotation.class));//true
		
		//如果是true，获取该注解对象
		if (m1Method.isAnnotationPresent(ReflectAnnotation.class)) {
			
			//获取注解ReflectAnnotation的对象
			Object object =m1Method.getAnnotation(ReflectAnnotation.class);
			ReflectAnnotation m1ReflectAnnotation = (ReflectAnnotation)object;
			
			//通过获取的注解对象调用属性以获取属性值
			System.out.println(m1ReflectAnnotation.value());//北京天安门广场
			System.out.println(m1ReflectAnnotation.username());//朴初珑
			System.out.println(m1ReflectAnnotation.password());//123456789001
			
		}
	}
	

}
