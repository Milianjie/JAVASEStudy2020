package eע���е�������һ������;

public class OtherAnnotationTest {
	
	public static void main(String[] args) {
		
		
		
	}
	//�������Ǵ�����
	@OtherAnnotation(age = 20,email = {"126554@qq.com","778787@qq.com"},seasons = {Season.SPRING,Season.AUTUNM})
	public void m1() {
		
	}
	
	//ֻ��һ��Ԫ�ؽ�����ʱ�����ſ�ʡ��
	@OtherAnnotation(age = 20,email = "778787@qq.com",seasons = Season.WINTER)
	public void m2() {
		
	}
	
	/*
		@Target(ElementType.METHOD)
		@Retention(RetentionPolicy.SOURCE)
		���Կ���֪��������Ԫע���ж���һ��ö����������ԣ�����������value��ö������ElementType��RetentionPolicy
	 */

}
