package h�ɱ䳤�Ȳ���;

/*
 * ���ɱ䳤�Ȳ�����
 * 		�����﷨��int... args
 * 				����... ��������Ҳ������Ϊ��һ������������Ҫע����������㣩
 * 
 * 		1���ɱ䳤�Ȳ���Ҫ�����������0~N��
 * 		2���ɱ䳤�Ȳ���ֻ�ܶ����ڲ����б����һ��λ�ã�Ҳ˵��ֻ�ܶ���һ��
 * 		3���ɱ䳤�Ȳ������Կ�����һ�����飬�����г��ȣ�Ҳ���Դ��������ȥ����û��Ҫ��ô��
 * 		
 */

public class ArgsTest {
	
	public static void main(String[] args) {
		
		m1();//��������
		m1(10);//��2��
		m1(10,20);//3��
		//m1("ada");//����
		
		m2(1);
		m2(1, "zx","ad");
		
		m3("zhongrongjie","piaochulong","piaoxiaomin","linyuner");
		
	}
	
	public static void m1(int... args) {
		System.out.println("m1����ִ����");
	}
	
//	public static void m2(int... args,String...strings) {
//		System.out.println("m2����ִ����");
//	}
	public static void m2(int args,String... strings) {
		System.out.println("m2����ִ����");
	}
	
	public static void m3(String... strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	}

}
