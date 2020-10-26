package e数组的扩容与拷贝;

/**
 * 			关于一维数组的扩容与拷贝：
 * 			在Java开发中，数组的长度一旦被确定就无法更改，当数组满了时还想存放更多数据就必须进行扩容
 * 			扩容的方式是：
 * 						新建一个更大容量的数组，然后将小容量数组中的数据一个一个的拷贝到大数组中。
 * 			得出一个结论：
 * 						数组扩容效率较低。原因是拷贝的问题，所以在开发中尽可能少的进行数组的拷贝
 * 			建议是在创建数组时预估所需数组的最佳长度，减少扩容次数以提高效率。
 * 
 * 			Java中数组的拷贝方式：
 * 								调用System类中的arraycopy()方法进行拷贝，该方法中有五个参数,如下：
 * 								System.arraycopy(src, srcPos, dest, destPos, length);
 * 								src ：表示被拷贝数组源
 * 								srcPos：表示所选择的被拷贝数组的下标
 * 								dest：表示要拷贝到的目标数组
 * 								destPos：表示要拷贝到的目标数组起始下标
 * 								length：表示要拷贝的数据长度
 * @author 钟荣杰
 *
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		
		//创建一个被拷贝数组
		int[] a1 = {12,45,665,48,45,99,88,99,65};
		//遍历该数组
		for (int i = 0; i < a1.length; i++) {
			int j = a1[i];
			System.out.println(j);
		}
		System.out.println(a1);//[I@ee7d9f1
		System.out.println("================================>");
		
		//创建一个拷贝的目标数组
		int[] a2 = new int[14];
		//用System.arraycopy();进行拷贝
		System.arraycopy(a1, 2, a2, 5, 7);
		
		/*代码合并时，但是不太好，因为后面还需要该数组，放进一个变量好调用
		System.arraycopy(a1, 2, new int[14], 5, 7);
		*/
		
		//遍历该数组
		for (int i = 0; i < a2.length; i++) {
			int j = a2[i];
			System.out.println("目标数组中 a["+i+"]= "+j);
		}
		
		//在被拷贝数组与目标数组类型相同的情况下，其数据元素是引用数据类型也可以拷贝
	}

}
