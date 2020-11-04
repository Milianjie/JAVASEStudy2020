package d关于文件路径;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
 * 【文件的路径问题】
 */

public class AboutFilePath {
	
	public static void main(String[] args) {
		
//		try {
//			//创建输入流
//			FileReader  reader = new FileReader("src/c通过反射实例化对象/classinfo.properties");
//		} catch (FileNotFoundException e) {
//			// TODO 自动生成的 catch 块
//			e.printStackTrace();
//		}
		/*
		 * 上面这种路径方式的缺点：移植性差，在IDEA中默认路径是当前project的根（eclipse中默认是项目的根）
		 * 这个代码假设离开了eclipse（IDEA），换到了其他位置，可能当前路径就不是该项目（project）了，这时该路径就无效了
		 */
		
		//下面的一种比较通用的方式，即使代码换了位置也一样通用
		//局限就是文件必须放在类路径下，即工程或者项目下的src下面
		//src就是类路径的根，src外面就是eclipse或者IDEA默认的路径根
		/*
		 * 解释：
		 * 		1、 Thread.currentThread()--获取当前线程对象
		 * 		2、getContextClassLoader()--当前线程对象的方法，作用是获取该线程对象的类加载器对象（java中的类加载器有很多种）
		 * 		3、getResource("db.properties")--【获取资源】这是类加载器对象的方法，作用是当前线程的类加载器默认从类的根路径下加载资源
		 * 		4、getPath()--拿取到绝对路径
		 */
		String path = Thread.currentThread().getContextClassLoader().getResource("db.properties").getPath();
		
		//采用以上代码拿取到一个在类路径下文件的绝对路径
		//因为文件路径有中文，所以拿到有些乱码，建议以后路径不要有中文和空格，这里是学习，可以忽略
		System.out.println(path);///G:/Users/Administrator/eclipse-workspace/JAVAStudy9-%e5%8f%8d%e5%b0%84%e6%9c%ba%e5%88%b6/bin/db.properties
		
	}

}
