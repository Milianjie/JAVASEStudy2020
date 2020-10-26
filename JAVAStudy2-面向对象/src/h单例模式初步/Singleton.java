/*
 *    实现单例模式
 *    
 *    要领：
 *         1.首先构造方法私有化private
 *         2.对外提供一个公开且静态的获取当前类型(返回值为当前类)对象的方法
 *         3.最后提供一个当前类型的静态变量
 *         
 *         单例模式分两种：
 *         饿汉式单例：在类加载阶段就创建了对象
 *         懒汉式单例：用到对象的时候才创建对象
 */
     //懒汉式单例
package h单例模式初步;

public class Singleton {
	
	//静态变量
	private static Singleton s = null;
	
	private Singleton(){
		
	}
	
	//对外提供一个公开的获取Singleton类型对象的方法
	public static Singleton set(){
		if (s==null){
			  s=new Singleton();
		}
		return s;
	}

}
