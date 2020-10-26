
/*
 *     程序在执行的过程中参数的传递问题:
 *     1.传递的参数是基本数据类型
 *     2.传递的参数是引用数据类型
 */
    //以下程序传递基本数据类型
package f程序执行参数传递问题;

public class Test01 {
	
	public static void m1(int i){//有static的方法，懂？
		i++;
		System.out.println("i-->"+i);//11
		
	}	
	//无论在哪里此处都是程序的入口,最先执行此处
	public static void main(String[] args){
		int i=10;
		m1(i);
		System.out.println("i-->"+i);//10
	}

}
