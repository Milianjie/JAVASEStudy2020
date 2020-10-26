/*
 *    关于Object中的finalize方法
 *    
 *       finalize声明时候调用?
 *       1.finalize方法每个对象都有
 *       2.finalize方法不需要程序员去调用，系统自动调用
 *       3.java对象没有更多的引用指向它，则其变成垃圾数据
 *         等待垃圾回收器的回收，垃圾回收器再回收这个java对象之前会
 *         自动调用该对象的finalize方法
 *      finalize方法是该对象马上就要被回收了，
 *      例如:需要释放资源，则可以在该方法中释放
 *     
 */
package rObject类;

public class Test04 {
	
	public static void main(String[] args){
		
		 Animal p1 = new  Animal();
		p1 = null;//没有引用再指向它，等待回收
		
		//程序员只能"建议"垃圾回收器回收
		System.gc();//十八Object类.Animal@4203fcfb这个对象要被回收聊!
	}

}

class Animal{
	//重写Object中的finalize方法
	public void finalize() throws Throwable {
		 System.out.println(this+"这个对象要被回收聊!");
		 //this是当前Animal类型的对象引用，默认调用继承的Object类中的toString方法
		 
		 //让引用重新指向该对象,就不会被回收
		 Animal p1 = this;
	 }
}