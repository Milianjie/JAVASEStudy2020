package g实际开发中使用自定义异常;

/*
 * 		自定义一个异常：该异常表示数组已满时无法再放数值进该数组时出现问题
 * 		在方法中的可能发生异常的条件语句中用关键字throw不是throws抛出自己new出的自定义异常对象
 * 		描述信息在new对象时按照发生啥问题填写相应提示信息到参数中
 */

public class MyArrayOperationException extends Exception{
	
	public MyArrayOperationException() {
		// TODO 自动生成的构造函数存根
	}
	
	public MyArrayOperationException(String s) {
		// TODO 自动生成的构造函数存根
		super(s);
	}

}
