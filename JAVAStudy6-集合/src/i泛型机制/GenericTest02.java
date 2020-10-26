package i泛型机制;

import java.util.ArrayList;
import java.util.List;

/*
 * JDK8之后引入了自动类型推断机制，或者说砖石表达式
 */

public class GenericTest02 {
	
	public static void main(String[] args) {
		
		//引入的自动类型推断机制，就是在创建集合new对象的语句中不用再写类名进去，可根据前面自动推断
		List<Animal> list = new ArrayList<>();		
	}

}
