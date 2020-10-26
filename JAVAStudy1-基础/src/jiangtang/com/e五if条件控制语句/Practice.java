package jiangtang.com.e五if条件控制语句;

/*
 *     需求：
 *     1.系统给定人的年龄。[1-100]
 *     2.系统给定程序，通过人的年龄，来判断这个人处于哪个生命阶段
 *     [1-5]  幼年
 *     [6-16]  少年
 *     [17-25]  青少年
 *     [26-35]  青年
 *     [36-60]  中年
 *     [61-100]  老年
 */



import java.util.Scanner;
public class Practice {
	
	public static void main(String[] args){
		 
		Scanner scanner=new Scanner(System.in);
		
		int i=scanner.nextInt();
		/*
		if (i>100 || i<1){
			System.out.println("错误");
		}else if(i>=1 && i<=5){
			System.out.println("幼年");
		}else if(i<=16){
			System.out.println("少年");
		}else if(i<=25){
			System.out.println("青少年");
		}else if(i<=35){
			System.out.println("青年");
		}else if(i<=60){
			System.out.println("中年");
		}else if(i<=100){
			System.out.println("老年");
		}
		*/
		
		String grade="老年";
		if (i>100 || i<1){
			grade="错误";
		}else if(i>=1 && i<=5){
			grade="幼年";
		}else if(i<=16){
			grade="少年";
		}else if(i<=25){
			grade="青少年";
		}else if(i<=35){
			grade="青年";
		}else if(i<=60){
			grade="中年";
		}
			System.out.println(grade);
		}
	}