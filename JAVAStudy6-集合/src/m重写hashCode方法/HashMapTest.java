package m��дhashCode����;

import java.util.HashSet;
import java.util.Set;

/*
 * ��������дhashCode��equals������
 * 		����Map�����д洢��ֵ��Ԫ�ػ���ȡ��ֵ��Ԫ��ʱ�������ȵ���key��hashCode�������жϼ�ֵ��Ӧ�ô���������ĸ��±�λ��/���ĸ��±�λ��ȡ��
 * 		Ȼ�����equals�����жϴ����key������Ŀ��λ�û���Ŀ��������ĸ��ڵ�����е�keyֵ��ͬ
 * 	��put����������
 * 		k.hashCode()����һ����ϣֵ��������ϣ�㷨ת�������±�
 * 		��������ȥ������������������еĸ��±�λ����null��ֱ�ӷŽڵ������ȥ����ʱquals������ִ��
 * 	get(k)����������
 * 		k.hashCode()����һ����ϣֵ��������ϣ�㷨ת�������±�
 * 		��������ȥ������������������еĸ��±�λ����null������null��equals������ִ��
 * 
 * �����ۡ���һ�����е�equals��д�ˣ�hashCode����Ҳ����Ҫ��д
 * 			��Map�����У�equals����true��hashCodeһ���᷵��true
 * 			����HashMap�����е�key�����Լ�HashSet�����е�Ԫ�ص��࣬equals��hashCode������ͬʱ��д
 * 
 * 	��ע�⡿��д�����������ñ������Զ����ɶ���Ҫͬʱ���ɣ�����������ж�����ԣ������������������Щ���Ը�ֵ
 * 			��ϣ������������ͬһ��ʵ����Ҫ��Щ����������ȫ��һ�²�����Ļ������Զ���д��������
 * 			������ѡ����潫�������Զ��򹴣���ֻҪĳһ��������ͬ����Щ����Ͷ���ͬ���Ǿ�ֻ�ڸ������ϴ�
 * 
 * ��JDK8����Ż��� ��HashMap�����������ĳһ��������ڵ����8��ʱ���õ��������Զ�ת�ɺ�������ݽṹ
 * 				     ���ǵ�������еĶ�������6��ʱ�����Զ�ת�ɵ�������ṹ
 * 				     �Ᵽ֤�˼�����Ч�ʣ���Ϊһ�����������й���ڵ�ͻή��Ч��
 * 
 * 		
 */

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Student s1 = new Student( "����");
		Student s2 = new Student( "����");
		
		//��дStudent��equals֮ǰ��false
		//System.out.println(s1.equals(s2));//false
		
		//��дequals֮��
		System.out.println(s1.equals(s2));
		
		System.out.println("s1��hashcode�ǣ�"+s1.hashCode());//δ��дhashCode����ʱ��517938326  ��д��35605639
		System.out.println("s2��hashcode�ǣ�"+s2.hashCode());//δ��дhashCode����ʱ��914424520  ��д��35605639
		
		//��������дequals����ʹ��Ƚ����ݺ�s1.equals(s2)==true����ʾs1��s2��һ����
		//��ô��һ��HashSet���ϴ�����ǣ����ڲ����ظ���������ֻ����һ��
		//��ʱ��û����дhashCode����
		Set<Student> students = new HashSet<>();
		students.add(s1);
		students.add(s2);
		
		System.out.println(students.size());//ֻ��дStudent��equals��û����дhashCode�����2
	}

}
