package i���ͻ���;

/*
 * �Զ��巺�ͣ�����������Ӽ�ͷ����<����ı�ʶ�����д>��
 * 		��ͷ������ı�ʶ�����Է���������Ҫ�����������ȷ������ʲô����
 * 		����λ��
 * Դ����һ����ֵ���<E>��<T>,E��element��д��T��type��д
 */

public class GenericTest03<��ȷ�������ҿ������д�ı�ʶ��> {
	
	public static void main(String[] args) {
		
		//ʹ�÷��ͻ��ƴ�������
		GenericTest03<String> g1 = new GenericTest03<>();//��ͷ���������String����ô�ö�����õķ�������Ҫ�������;͵���String����
		
		//���Ͳ�ƥ��
		//g1.out(100);
		g1.out("��Т��");
		
		//������ͷ���ŵ�����
		GenericTest03<Integer> g2 = new GenericTest03<>();
		
		//���Ͳ�ƥ��
		//g2.out("��Т��");
		g2.out(100);
		
		String s1 = g1.get();
		Integer i1 = g2.get();
		
		//��ʹ�÷���new����,Ĭ����ԭʼ����
		GenericTest03 g3 = new GenericTest03();
		
		g3.out("����");//���Ͳ���ȫ
		Object o = g3.get();
		
	}
	
	//��ʹ�÷��͵����еĳ�Ա����
	public void out(��ȷ�������ҿ������д�ı�ʶ�� s) {
		System.out.println(s);
	}
	
	public ��ȷ�������ҿ������д�ı�ʶ�� get() {
		return null;
	}

}
