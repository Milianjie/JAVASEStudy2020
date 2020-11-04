package iFile类常用的方法;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 	1、File类和四大家族没有关系，所以File类不能完成文件的读和写
 * 	2、File类的对象表示什么？
 * 			其对象表示的是文件以及目录路径的抽象表示形式，如
 * 			C:\Drivers  这是一个File对象	
 * 			C:\Drivers\study.txt  这也是一个File对象
 * 		一个File对象对应的可以是一个文件，也可以是一个目录
 * 		File只是一个路径名的抽象表示形式
 * 	3、File类中需要掌握的几个方法
 */

public class FileTest01 {
	
	public static void main(String[] args) {
		
		File file = new File("D:/file");
		
		//判断路径中的file文件或者文件夹是否存在
		System.out.println(file.exists());//false
		
		//在路径中生成file文件夹或者文件
		//下面是如果D:\file不存在，则将file以文件的形式创建出来
//		if (!file.exists()) {
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO 自动生成的 catch 块
//				e.printStackTrace();
//			}
//		}
		
		//下面的是如果D:\file不存在，则将file以目录的形式新建
		if (!file.exists()) {
				file.mkdir();//该方法创单个
		}
		
		
		//创建多重目录
		File file2 = new File("D:/a/b/c/d/e/f");
		if (!file2.exists()) {
			file2.mkdirs();//该方法创多个
		}
		
		
		//获取文件的父路径
		File file3 = new File("D:/a/b/c/d/e/f/java.txt");
		if (file3.exists()) {
		String string = file3.getParent();
		System.out.println(string);//D:\a\b\c\d\e\f
		//也可以另一种方法，只不过返回是类型是File类的，不是String类型
		File parentFile = file3.getParentFile();
		//然后调用getAbsolutePath方法，该方法是获取绝对路径
		System.out.println("获取绝对路径："+parentFile.getAbsolutePath());//D:\a\b\c\d\e\f
		
		
		//获取绝对路径
		File file4 = new File("我的区长父亲");
		System.out.println("绝对路径："+file4.getAbsolutePath());//绝对路径：G:\Users\Administrator\eclipse-workspace\JAVAStudy7-IO流\我的区长父亲
		
		
		//获取文件名
		String string2 = file3.getName();
		System.out.println(string2);//java.txt
		
		
		//判断是否是一个目录
		System.out.println(file4.isDirectory());//false
		
		
		//判断是否是一个文件
		System.out.println(file4.isFile());//true
		
		
		//获取文件最后一次修改时间，返回是自1970年1月1日08时00分00秒000毫秒到最后一次修改时间的总毫秒数,long类型
		long time = file3.lastModified();
		System.out.println(time);//1603693942199
		//将这些毫秒在创建Date对象时作为参数传进去，可得到具体时间，但是得建一个可视化的样式显示
		Date lastModifyTime = new Date(time);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");
		System.out.println(file3.getName()+"最后一次修改时间："+simpleDateFormat.format(lastModifyTime));
		
		
		//获取文件大小
		System.out.println(file3.length());//0字节
		
		
		//File中ListFiles方法，可以获取当前目录下的所有子文件以及文件夹
		//返回的是File数组,数组中保存的是子文件的绝对路径
		//File[] listFile()
		File file5 = new File("F:\\A级达标测试项目管理模板（试）");
		File[] files = file5.listFiles();
		for (File f : files) {
			System.out.println(f);
			System.out.println(f.getName());
		}
			
		
		}
	}

}
