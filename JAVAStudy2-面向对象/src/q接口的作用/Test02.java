package q接口的作用;

public class Test02 {
	
	public static void main(String[] args){
		
		//生产引擎
		Engine02 e1 = new YAMAHA02();//多态
		
		//生产汽车
		Car c = new Car(e1);
		
		//测试引擎
		c.TestEngine();
		
		//换HONGDA
		Engine02 e2 = new HONGDA02();
		c.e = e2;//c.e相当于以前的c.name="XXX",因为e是父类型的，可直接更换属性值，无需再创建对象
		c.TestEngine();
		
	}

}
