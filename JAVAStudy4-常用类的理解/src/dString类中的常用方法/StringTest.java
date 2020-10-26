package dString类中的常用方法;

public class StringTest {
	
	public static void main(String[] args) {
		
		//String类中的常用方法
		/*
		 * （1）掌握 char charAt(int index)
		 * 根据输入的索引(下标)取出字符串中的某个字符
		 */
		char c = "中国人".charAt(1);
		System.out.println(c);//国
		
		/*
		 * (2)了解  int compareTo(String anotherString)
		 *    根据字典的排列顺序比较字符串,顺序后面的相当于数值大的,而且是相同索引的进行比较，只要一个被比出来后面就不比了
		 *    字符串之间比较大小
		 */        
		int result = "abc".compareTo("abc");
		System.out.println(result);//0(等于0)		数值相等--10-10=0
		
		int result1 = "abce".compareTo("abcd");
		System.out.println(result1);//-1(小于0)		数值不等-前小后大--9-10=-1<0

		int result2 = "abcd".compareTo("abce");
		System.out.println(result2);//1(大于0)		数值不等-前大后小--10-9=1>0

		
		System.out.println( "abcd".compareTo("acbd"));//-1
		
		/*
		 * (3)掌握  boolean contains(CharSequence)
		 * 判断前面的字符串是否包含后面的字符串
		 */
		System.out.println("Hello world".contains("world"));//true
		System.out.println("http://www.baidu.com".contains("world"));//false
		
		/*
		 * (4)掌握  boolean endsWith(String suffix)
		 * 判断当前字符串是否以某个字符串结尾
		 */
		System.out.println("test.txt".endsWith(".txt"));//true
		System.out.println("test.txt".endsWith(".java"));//false
		
		/*
		 * (5)掌握 boolean equals(Object object)
		 *比较两个字符串用equals方法
		 *equals有没有调compareTo方法呢?
		 *重写的equals方法是将输入的字符串拆分成字符然后转换成char类型或者byte类型的数组，然后遍历数组比较的
		 */
		System.out.println("abc".equals("abc"));
		
		/*
		 * (6) 掌握  boolean equalsIgnoreCase(String anotherString)
		 * 		比较两个字符串是否相等，同时忽略大小写
		 */
		System.out.println("ABC".equalsIgnoreCase("abc"));//true
		
		/*
		 * (7)掌握  byte[] getByte()
		 * 将字符串对象转换成byte型数组
		 */
		byte[] bytes = "abcdefghijkmlnopqrst".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i]+" ");//97 98 99 100 101 102 103 104 105 106 107 109 108 110 111 112 113 114 115 116 
		}
		System.out.println();
		
		/*
		 * (8)掌握  int indexOf(String str)
		 * 判断某个子字符串在当前字符串中第一次出现处的索引
		 */
		System.out.println("oraclejava.netc++com.phppythonjavago".indexOf("java"));//6
		
		/*
		 * (9)掌握   boolean isEmpty()
		 * 判断一个字符串是否为空
		 */
		System.out.println("".isEmpty());//true
		System.out.println("a".isEmpty());//false
		
		/*
		 * (10)掌握  int length()
		 * 返回字符串的长度
		 * 判断数组的长度的length是属性，没有括号，字符串的是方法
		 */
		System.out.println("sdasdsa".length());//7
		System.out.println("".length());//0
		
		/*
		 * (11)掌握  int lastIndexOf(String str)
		 * 判断某个子字符串在当前字符串中最后一次出现在的索引（下标）
		 */
		System.out.println("oraclejava.netc++com.phppythonjavago".lastIndexOf("java"));//30
		
		/*
		 * (12)掌握   String replace(CharSequence target, CharSequence replacement) 
		 * 将所有目标字符串target替换成所需的字符串replacement
		 * String的分类接口是CharSequnce
		 */
		String newString = "http://www.baidu.com".replace("http://", "https://");
		System.out.println(newString);//https://www.baidu.com
		//将下列的:替换成=
		System.out.println("name:zhongrongjie&password:123&age:20".replace(":", "="));//name=zhongrongjie&password=123&age=20
		
		/*
		 * (13)掌握   String[] split(String regex) 
		 * 根据给定正则表达式的匹配拆分此字符串。
		 */
		String[] ymd = "1997-02-15".split("-");//"1997-02-15"以"-"为分隔符进行拆分，放入一个String类型的数组中
		for (int i = 0; i < ymd.length; i++) {
			System.out.print(ymd[i]+" ");
		}
		System.out.println();
		
		/*
		 * (14)掌握  boolean startsWith(String prefix)
		 * 判断当前字符串是否以某个子字符串开始
		 */
		System.out.println("http://www.baidu.com".startsWith("http://"));//true
		System.out.println("http://www.baidu.com".startsWith("https://"));//false
		
		/*
		 * (15)掌握  String substring(int beginIndex) 
		 * 返回一个新的字符串，它是此字符串的一个子字符串,从输入的索引开始往后截取当前字符串
		 */
		System.out.println("http://www.baidu.com".substring(7));//www.baidu.com
		// String substring(int beginIndex, int endIndex) -->指定截取字符串的开始索引与接收索引
		//该子字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符
		System.out.println("http://www.baidu.com".substring(7, 10));//www -->索引10不截
		
		/*
		 * (16)掌握   char[] toCharArray() 
		 * 将字符串转换成char数组
		 */
		char[] chars = "我是中国人".toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		/*
		 * (18)掌握   String toLowerCase()  &   String toUpperCase()  
		 * 将字符串转换成小写（左边）或大写（右边）
		 */
		System.out.println("ABCSDJDIjdsid".toLowerCase());//abcsdjdijdsid
		System.out.println("ABCSDJDIjdsid".toUpperCase());//ABCSDJDIJDSID
		

		/*
		 * (19)掌握   String trim() 
		 *  返回字符串的副本，忽略前导空白和尾部空白。去除字符串前后的空白，只是前后
		 */
		System.out.println("    my neme is lihuauhau        ".trim());//my neme is lihuauhau

		/*
		 * (17)掌握  static String valueOf() 
		 * String中只有该方法是静态的，不需要创建对象
		 * 作用是将非字符串（如boolean、int、char等类型）转换成字符串
		 * 该方法在String类中实现了方法重载，根据输入的参数类型自动调用该类型的valueOf方法
		 */
		System.out.println(String.valueOf(true));//true
		System.out.println(String.valueOf(100));//100
		System.out.println(String.valueOf(3.14));//3.14
		//如果传入的是一个对象，底层就会调用该对象类型的重写的toString方法,可以看看源码
		System.out.println(String.valueOf(new Object()));//java.lang.Object@cac736f
		System.out.println(String.valueOf(new StringTest()));//重写toString方法
		//能打印到控制台上的都是字符串，println底层会调用String.valueOf()
		//所以为什么输出一个会调用toString，因为System.out.println()的println方法底层会调用String.valueOf()，而该方法又调toString
		//如下println()中输入的是对象的话调用的println方法源码
		/*
			 public void println(Object x) {
			    String s = String.valueOf(x);
			    synchronized (this) {
			        print(s);
			        newLine();
			    }
			}
		 */



	}
	//重写该类的toString
	@Override
	public String toString() {
		// TODO 自动生成的方法存根
		//return super.toString();
		return "重写toString方法";
	}

}
