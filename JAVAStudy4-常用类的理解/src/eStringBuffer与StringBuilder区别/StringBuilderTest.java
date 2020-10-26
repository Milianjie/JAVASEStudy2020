package eStringBuffer与StringBuilder区别;

/*
 * 		StringBuffer与StringBuilder的区别：
 * 			StringBuffer中的方法前面都有synchronized关键字修饰，表示其在多线程环境下运行是安全的
 * 			StringBuilder中的方法前面没有synchronized，表示其在多线程环境下运行是不安全的
 * 		总之：
 * 				StringBuffer线程安全
 * 				StringBuilder非线程安全
 */	

public class StringBuilderTest {

}
