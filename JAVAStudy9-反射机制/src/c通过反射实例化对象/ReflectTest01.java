package c通过反射实例化对象;

/*
 * 获取到Class的作用
 */

public class ReflectTest01 {
	
	public static void main(String[] args) {
		
		
		//下面这种用反射机制的方法比以前创建对象的方式更加灵活
		try {
			//通过反射机制获取Class，然后用Class实例化对象
			Class c = Class.forName("bean.User");//c代表User类型
			
			//newInstance()这个方法会调用User的无参数构造方法来实例化User对象，返回的是一个泛型指定类
			//如果User类中写了有参数发构造方法，并没把无参数构造方法补上就会报无法实例化异常和构造方法无法找到异常
			//【重点】必须保证无参构造是存在的，以后写的类一定要把无参构造方法上
			Object object = c.newInstance();
			System.out.println(object);
			
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
