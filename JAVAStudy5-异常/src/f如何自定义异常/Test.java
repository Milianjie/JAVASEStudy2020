package f如何自定义异常;

public class Test {
	
	public static void main(String[] args) {
		
		//创建自定义异常对象
		MyException me = new MyException("自定义异常对象");
		
		me.printStackTrace();
		
	}
	
}
