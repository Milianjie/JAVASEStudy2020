//生产汽车
package q接口的作用;

/**
 * 
 * @author 钟荣杰
 *
 */

public class Car {//此处不需要实现
	
	//Filed
	//引擎
	//面向接口编程，不能填YAMAHA02 y;,引擎不能被固定
	Engine02 e;
	
	//Contructor
	Car(Engine02 e){//此处的e初始化后的内存地址赋给上面的e
		this.e=e;
	}
	//汽车应该能测试引擎 
	public void TestEngine(){
		e.start();//面向接口调用
		          //e传过来是谁的地址就调用谁的start方法
	}

}
