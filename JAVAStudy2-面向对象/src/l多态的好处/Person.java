/*
 *     模拟主人
 */
package l多态的好处;

public class Person {
	
	/*
    //喂养
	public void feed(Dog d){
		d.eat();
	}
	
	//因为用户的业务改变了所以软件要升级
	public void feed(Cat c){
		c.eat();
	}
	//以上代码得出：person类型的扩展能力太差
	 * 
	 */
	//尽量不要面向具体编程，要面向父类编程，面向抽象编程
	public void feed(Animal a){//也就说只要是继承了Animal类的都可以往这传，Animal a就相当于包括
		a.eat();               //上面的Dog d 和Cat c，有多少子类就包括
	}                          //测试调用方法中的参数写子类型的引用，不写父类型的引用a
	
	public void test(Animal b){
		b.name();               
	}   
}
