package gע���ڿ����е�Ӧ��;

import java.lang.reflect.Field;

public class IdAnnotationTest {
	
	public static void main(String[] args) {
		
		try {
			
			Class animalClass = Class.forName("gע���ڿ����е�Ӧ��.Animal");
			
			Field[] fields = animalClass.getDeclaredFields();
			
			if (animalClass.isAnnotationPresent(Id.class)) {
				
				//��Ǳ���
				boolean isOk = false;
				for (Field field : fields) {
					if ("id".equals(field.getName()) && "int".equals(field.getType().getName())) {
						isOk = true;
						break ;
					}
				}
				if (isOk!=true) {
					throw new ClassNotIdFieldException("��@Id��ע���������int���͵�id�ֶ�! ! !");
				}
				
			}
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
		
	}

}
