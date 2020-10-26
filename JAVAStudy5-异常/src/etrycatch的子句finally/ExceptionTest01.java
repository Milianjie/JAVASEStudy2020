package etrycatch的子句finally;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 		关于try..catch语句中的子句finally：
 * 			1、finally中的代码是最后执行的，并且是一定会执行的，即使try中的语句出现异常finally中的语句照样执行
 * 			2、finally语句通常使用在哪些情况？
 */

public class ExceptionTest01 {
	
	public static void main(String[] args) {
		
		FileInputStream fis = null;//声明位置放到try的外面，finally中才能用
		
		try {
			//创建一个输入流对象
			 fis = new FileInputStream("E:\\1.AlexNet\\vocapp.py");
			//开始读文件
			
			//
			String s = null;
			s.toString();//该语句一定会发生空指针异常,发生异常下面的语句就不再执行
			System.out.println("你好牛皮哦");
			
			//流使用完后，需要关闭它，因为其占用资源
			//正常情况即使上面出现异常，流也必须关闭
			//然而关闭语句放在这，流就没法关闭，怎么办呢？可以将其放到finally子句中
			//fis.close();
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("finally中的语句执行了！！！！");
			//流的关闭放在这里比较保险
			//这里的代码一定会执行
			//即使try中出现异常也照执行不误
			try {
				//可能try语句中new不成对象，fis就还是null，这样就不需要关闭流，加个条件语句
				if (fis!=null) {
					fis.close();
				}
				
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
		
		
	}

}
