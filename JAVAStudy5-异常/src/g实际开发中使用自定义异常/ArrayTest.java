package gʵ�ʿ�����ʹ���Զ����쳣;

public class ArrayTest {
	
	public static void main(String[] args) {
		
		String[] arr = new String[5];
		try {
			input(arr, "���ٽ�",0);
			input(arr, "��sir",1);
			input(arr, "������",2);
			input(arr, "�ʺ�ɽ",3);
			input(arr, "����",4);
			input(arr, "sexnao",4);
			
		} catch (MyArrayOperationException e) {
			// TODO �Զ����ɵ� catch ��
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
				//�����쳣���󣬲����ֶ��׳�
				throw new MyArrayOperationException("�������������޷����Ԫ��");
				
			}
			int index = key ;
				if (array[index] == null) {
					array[index] = s;
				}
				

		
	}

}
