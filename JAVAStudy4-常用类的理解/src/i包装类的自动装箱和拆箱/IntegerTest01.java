package i包装类的自动装箱和拆箱;

/*
 * 		自动装箱：基本数据类型自动转换成包装类型
 * 		自动拆箱：包装类型自动转换成基本数据类型
 * 	有了自动拆箱后，Number中方法就用不着了
 * 		好处：
 * 			就是方便编程，比如说调用方法要传的参数是Object引用类型，把一个基本数据类放进去会将其自动装箱
 * 			就不需要手动的new对象装箱了，但这必须是在JDK1.5以后的版本才行
 */

public class IntegerTest01 {
	
	public static void main(String[] args) {
		
		//在JDK1.5以后的版本中包装类支持自动装箱和拆箱
				Integer xInteger = 100;//int类型--->自动转换为 Integer包装类，自动装箱，不用显示的new对象了
				int yInt = xInteger;//自动拆箱
		
		//+作加号时两边要求是基本数据类型，xInteger是包装类型，此时自动拆箱转换成基本数据类型，不会报错
		System.out.println(xInteger + 1);
		
		Integer a = 1000;
		Integer b = 1000;
		//==比较的两个对象的内存地址，此时不会触发自动拆箱机制
		System.out.println(a == b);//false
	}

}
