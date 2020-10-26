package i类的继承;

public class Test00 {
	
	public static void main(String[] args){
		
		//创建信用卡对象
		DebitAccount00 da = new DebitAccount00();
		
		//给信用卡账号赋值
		da.set("456988945445466556");//赋值
		System.out.println(da.get());//读取
		
		//不能直接访问actno
		//System.out.println(da.actno);
	}

}
