package g实际开发中使用自定义异常;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		try {
			input(arr, "钟荣杰",0);
			input(arr, "阿sir",1);
			input(arr, "黄种人",2);
			input(arr, "故寒山",3);
			input(arr, "铁剑",4);
			input(arr, "sexnao",4);
			
		} catch (MyArrayOperationException e) {
			// TODO 自动生成的 catch 块
			//e.printStackTrace();
			String s = e.getMessage();
			System.out.println(s);
		}finally {
			for (int i = 0; i < arr.length; i++) {
				String string = arr[i];
				System.out.print(string+" ");
			}
		}
		
		
	}
	
	public static void input(String[] array,String s,int key) throws MyArrayOperationException {

		
			if (array[array.length-1] != null) {
				//创建异常对象，并且手动抛出
				throw new MyArrayOperationException("该数组已满，无法添加元素");
				
			}
			int index = key ;
				if (array[index] == null) {
					array[index] = s;
				}
				

		
	}

}
