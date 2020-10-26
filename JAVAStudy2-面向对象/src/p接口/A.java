/*
 *   接口也是一种引用类型，可以把它等同看作类，因为编译后生成的是.class文件
 *       
 *       1.如何定义接口
 *         [修饰符] interface 接口名 {}
 *       2.接口中只能出现：常量  抽象方法
 *       3.接口其实是一个特殊的抽象类，特殊在接口完全是抽象的
 *       4.接口中没有构造方法，无法被实例化
 *       5.接口和接口之间可以多继承
 *       6.一个类可以实现多个接口。(这里的"实现"可以看作继承)
 *       7.一个非抽象的类实现接口，需要将接口中的所有方法重写/实现/覆盖
 */
package p接口;

public interface A {
	
	//常量(必须用public static final修饰)
	public static final String SUCCESS="success";
	public static final double PI=3.14;
	//在接口中，public static final可以省略
	byte MAX_VALUE=127;
	
	//抽象方法(接口中所有方法都是public abstract)
	public abstract void m1();
	//接口中public abstract可省略
	void m2();

}

interface B{
	void m1();
}
interface C{
	void m2();
}
interface D{
	void m3();
}
interface E extends B,C,D{//接口多继承
	void m4();
}

//implements是实现的意思，是一个关键字
//implements和extends意义相同
class MyData implements B,C{//类实现接口，需将抽象方法重写
	public void m1(){
		
	}
	public void m2(){
		
	}
}