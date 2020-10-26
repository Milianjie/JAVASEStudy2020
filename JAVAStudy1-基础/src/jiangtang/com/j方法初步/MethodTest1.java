package jiangtang.com.j方法初步;


/*
 *    引入方法计算两个数的求和
 *    什么是方法？
 *          方法就是一段代码片段，其可以完成特定的功能，并且可重复利用
 */


    public class MethodTest1 {
    	
    	//入口
    	    public static void main(String[] args){
    	    //在main方法中调用sumInt方法，完成功能
    	    //注意：加有static的方法，调用时必须采用"类名."的方式调用
    	    	MethodTest1.sumInt(10,20);
    	    	MethodTest1.sumInt(100,20);
    	    	MethodTest1.sumInt(101,201);
    	    	MethodTest1.sumInt(1011,250);
    	    	
    	    	
    	    	
    	    }
	
    //在类体中定义一个方法，完成两数的求和
    //注意：目前所有的方法定义成public static.以后会讲
    	    public static void sumInt(int a,int b){
    	    	int c=a+b;
    	    	System.out.println(a+"+"+b+"="+c);
    	    }
}

