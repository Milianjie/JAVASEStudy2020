package o数字类的理解;

import java.text.DecimalFormat;

/*
 * 		关于数字格式化（了解）
 */

public class DecimalFormatTest1 {
	
	public static void main(String[] args) {
		
		//java.text.DecimalFormat专门负责对输入数字按指定格式进行格式化，与日期的格式化原理一样
				//DecimalFormat dFormat = new DecimalFormat("满足需求的数字格式");
			
				/*
				 * 数字格式符号：
				 * 			#   代表任意数字
				 * 			,   代表千分位
				 * 			.	代表小数点
				 * 			0     代表输入的数字没法填满格式中符号位置补0
				 * 
				 * 			##,###.##   表示：加入千分位，保留两位小数
				 */
			
			DecimalFormat df1 = new DecimalFormat("###,###.##");
			String s1 = df1.format(1124.1515);
			System.out.println(s1);//1,124.15
			
			DecimalFormat df2 = new DecimalFormat("###,###.0000");//保留4个小数位，不够补0
			System.out.println(df2.format(3140.22));//3,140.2200

		
	}
		
}
