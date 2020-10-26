package jiangtang.com.d运算符;

public class OperatorTest1 {
		
		public static void main(String[] args){
			
			int a=10,b=3;
				System.out.println(a+b);//13
				System.out.println(a-b);//7
				System.out.println(a/b);//3
				System.out.println(a*b);//30
				System.out.println(a%b);//1
			
			//关于++
			int m=10;
				m++;
				System.out.println("m="+m);//11
				
			int s=10;
				System.out.println("s="+s);
				++s;
				System.out.println("s="+s);
			
			//++出现在变量的后面
			int k=10;
			int e=k++;//出现在后面，k先赋值再自加1
		    	System.out.println("k="+k);//11
		    	System.out.println("e="+e);//10
			
			//++出现在变量前面
			int i=10;
			int d=++i;//在变量前，i先自加1再赋值给d
				System.out.println("i="+i);
				System.out.println("d="+d);
		}	


}
