package aע��Ķ���;

/*
 * 1��ע�⣬Ҳ��ע�����ͣ�Ӣ������annotation
 * 
 * 2��ע����һ���࣬�����Ҳ������.class�ļ���������һ��������������
 * 
 * 3���Զ���ע�⣬�﷨��ʽ���£�
 * 		[���η��б�] @interface ע����{
 * 
 * 	}
 * 
 * 4��ע���ʹ��
 * 		��һ��ע��ʹ�õ��﷨��ʽ��
 * 			@ע��������
 * 		�ڶ���ע��ʹ�õ�λ�ã�
 * 			ע����Գ��������ϡ������ϣ�������Ա������̬�����Լ����췽��������Ա������ֲ������ϡ�ע����,�ӿ��ϣ�ö����,�β��ϵȵ�
 * 
 */
@MyAnnotation
public class AnnotationTest {
	
	@MyAnnotation
	private int i;
	
	@MyAnnotation
	public AnnotationTest() {
		// TODO �Զ����ɵĹ��캯�����
	}
	
	@MyAnnotation
	public void m1() {
		
		@MyAnnotation
		int a = 0;
		
	}
	
	@MyAnnotation
	public static void m2(
			@MyAnnotation
			String name,
			@MyAnnotation
			int c) {
		
		
	}

}

@MyAnnotation
interface MyInterface{}

@MyAnnotation
enum MyEnum{}

@MyAnnotation
@interface OtherAnnotation{}


