
/*
 *   this用在成员方法中
 */
package gthis关键字;

public class ThisTest02 {
	
	public static void main(String[] args){
		
		//创建对象
		Employ w = new Employ("Smith",15545);
		w.work();
		
		//创建对象
				Employ w1= new Employ("Bob",15845);
				w1.work();
				w.m1();
	}

}

class Employ{
	
	//员工名字
	String name;
	//编号
	int num;
	
	Employ(){}
	
	Employ(String _name,int _num){
		name=_name;
		_num=num;
	}
	
	//提供一个成员工作的方法
	public void work(){
		//下面的name是成员变量，访问它用“引用.”
		//所以下面的name=this.name,this省略了
		/*
		 * 所以this用在成员方法中，谁(w or w1)去调用这个方法，this就代表谁
		 * this指的就是当前对象
		 */
		System.out.println(name+"在工作");
	}
	//成员方法1
	public void m1(){
		this.m2();//this.=w.
		m2();//这两个调用效果一致，集在成员方法中this.可省略
	}
	//成员方法2
	public void m2(){
		System.out.println("测试");
	}
}
