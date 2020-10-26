package jiangtang.com.d运算符;

public class OperatorTest3 {
	
	/*
	 *     关于赋值运算符
	 *         基本的赋值运算符
	 *            =
	 *            
	 *         扩展的赋值运算符
	 *            +=   追加
	 *            -=
	 *            *=
	 *            /=
	 *            
	 *          += 例子：
	 *          int i=10;
	 *          i += 10;  相当于i = i+10;
	 *            
	 */


		public static void main(String[] args){
			
			//基本赋值运算符
			int i=10;
			System.out.println(i);//10
			
			//追加
			i += 10;
			System.out.println(i);//20
			
			//-=
			i-=5;
			System.out.println(i);//15
			
			//*=
			i*=3;
			System.out.println(i);//45
			
			///=
			i/=15;
			System.out.println(i);//3
			
			//%=
			i%=2;
			System.out.println(i);//1
			
			//基本赋值运算符与扩展赋值运算符的区别
			byte b=10;
			
			//以下代码编译不通过，因为运算结果是int类型，而=前面是byte类型
			//i = i+10;
			
			//以下可编译通过
			//语法：扩展赋值运算符不改变运算结果类型，但可能损失精度
			b += 10;
			System.out.println(b);//20
			
			//编译通过，但严重损失精度
			b+=1000;
			System.out.println(b);//结果为-4
					
			
		}



}
