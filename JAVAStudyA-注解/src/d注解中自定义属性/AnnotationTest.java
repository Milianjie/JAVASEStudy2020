package dע�����Զ�������;

public class AnnotationTest {
	
	public static void main(String[] args) {
		
		
	}
	
	/*
	 * ���һ��ע�⵱����û������Ĭ��ֵ�����ԣ��ڱ�ע�������ֶ���ʱ��Ҫ�����Ը�ֵ
	 * ��Ȼ�ᱨ��
	 */
	//@MyAnnotation(������ = ����ֵ,������ = ����ֵ)
	@MyAnnotation(name = "alibaba",color = "��ɫ",age = 26)
	public void m1() {
		
	}
	//����ָ��Ĭ��ֵ������Կ�д�ɲ�д������@Deprecatedע���о����趨Ĭ��ֵ�����ԣ�JDK9֮��
	@MyAnnotation(name = "alibaba",color = "��ɫ")
	public void m2() {
		
	}
	
	//��ע���е�������Ϊvalue,��z���ע��ֻ�и����Ի������������Ե�����Ĭ��ֵʱ��������value��ʡ��
	@OtherAnnotation("niupi")
	public void m3() {
			
	}
	//��Ȼ��Ĭ��ֵ������Ҫ����������ҲҪд�����Ļ�value����ʡ�ԣ����±���
//	@OtherAnnotation("niupi",age = 20)
//	public void m4() {
//			
//	}
	@OtherAnnotation(value = "niupi",age = 20)
	public void m4() {
			
	}
	
	

}
