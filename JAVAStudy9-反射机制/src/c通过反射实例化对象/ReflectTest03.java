package c通过反射实例化对象;

/*
 * 	分析Class.forName()方法发生了什么：
 * 		执行该方法时，使获得的class字节码文件的类中的静态代码块执行
 * 		就是说发生了类加载
 * 
 * 	【重点】如果希望一个类中的静态代码块执行，而其他代码一律不执行
 * 		可以使用
 * 				Class.forName("完整的类名");
 * 		这个方法。该方法执行，导致类加载，类加载让静态代码块执行
 * 
 * 	JDBC需要用
 */

public class ReflectTest03 {
	
	public static void main(String[] args) {
		
		try {
			Class.forName("bean.MyClass");
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
