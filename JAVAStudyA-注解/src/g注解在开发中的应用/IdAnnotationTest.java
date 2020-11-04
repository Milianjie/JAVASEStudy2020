package g注解在开发中的应用;

import java.lang.reflect.Field;

public class IdAnnotationTest {
	
	public static void main(String[] args) {
		
		try {
			
			Class animalClass = Class.forName("g注解在开发中的应用.Animal");
			
			Field[] fields = animalClass.getDeclaredFields();
			
			if (animalClass.isAnnotationPresent(Id.class)) {
				
				//标记变量
				boolean isOk = false;
				for (Field field : fields) {
					if ("id".equals(field.getName()) && "int".equals(field.getType().getName())) {
						isOk = true;
						break ;
					}
				}
				if (isOk!=true) {
					throw new ClassNotIdFieldException("被@Id标注的类必须有int类型的id字段! ! !");
				}
				
			}
		} catch (ClassNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
	}

}
