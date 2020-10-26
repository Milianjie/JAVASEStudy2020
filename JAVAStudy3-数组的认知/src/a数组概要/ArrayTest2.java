package a数组概要;

/*
 * 数组初始化方式的选择：
 * 					1、当已经确定数组中所要存储元素的值时，采用静态初始化
 * 					2、不确定将来数组要存储哪些具体数据时，采用动态初始化，预先分配内存空间
 */

public class ArrayTest2 {
	
	public static void main(String[] args) {
		
		//动态初始化一维数组
		int[] a = new int[5];//创建一个int类型长度为5的一维数组，每个元素默认值为0
		
		//遍历数组a
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("下标为"+i+"的元素值是 "+a[i]);
			
		}
		//后期赋值
		a[0]=2;
		a[1]=5;
		a[2]=9;
		a[3]=8;
		a[4]=6;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println("下标为"+i+"的元素值是 "+a[i]);
			
		}
		System.out.println("=========================================");
		
		//动态初始化一个Object类型的一维数组
		Object[] o = new Object[3];
		
		for (int i = 0; i < o.length; i++) {
			Object object = o[i];
			System.out.println("下标为"+i+"的元素值为"+object);
			
		}
		//静态初始化Object类型数组
		//创建对象
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = new Object();
		//创建数组
		Object[] objects = {o1,o2,o3};
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);//调用Object中的toString()方法，因为未改写的toString是引用的字符串表示	
		}
		
		System.out.println("=========================================");
		
		
	}

}
