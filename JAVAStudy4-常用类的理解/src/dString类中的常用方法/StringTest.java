package dString���еĳ��÷���;

public class StringTest {
	
	public static void main(String[] args) {
		
		//String���еĳ��÷���
		/*
		 * ��1������ char charAt(int index)
		 * �������������(�±�)ȡ���ַ����е�ĳ���ַ�
		 */
		char c = "�й���".charAt(1);
		System.out.println(c);//��
		
		/*
		 * (2)�˽�  int compareTo(String anotherString)
		 *    �����ֵ������˳��Ƚ��ַ���,˳�������൱����ֵ���,��������ͬ�����Ľ��бȽϣ�ֻҪһ�����ȳ�������Ͳ�����
		 *    �ַ���֮��Ƚϴ�С
		 */        
		int result = "abc".compareTo("abc");
		System.out.println(result);//0(����0)		��ֵ���--10-10=0
		
		int result1 = "abce".compareTo("abcd");
		System.out.println(result1);//-1(С��0)		��ֵ����-ǰС���--9-10=-1<0

		int result2 = "abcd".compareTo("abce");
		System.out.println(result2);//1(����0)		��ֵ����-ǰ���С--10-9=1>0

		
		System.out.println( "abcd".compareTo("acbd"));//-1
		
		/*
		 * (3)����  boolean contains(CharSequence)
		 * �ж�ǰ����ַ����Ƿ����������ַ���
		 */
		System.out.println("Hello world".contains("world"));//true
		System.out.println("http://www.baidu.com".contains("world"));//false
		
		/*
		 * (4)����  boolean endsWith(String suffix)
		 * �жϵ�ǰ�ַ����Ƿ���ĳ���ַ�����β
		 */
		System.out.println("test.txt".endsWith(".txt"));//true
		System.out.println("test.txt".endsWith(".java"));//false
		
		/*
		 * (5)���� boolean equals(Object object)
		 *�Ƚ������ַ�����equals����
		 *equals��û�е�compareTo������?
		 *��д��equals�����ǽ�������ַ�����ֳ��ַ�Ȼ��ת����char���ͻ���byte���͵����飬Ȼ���������Ƚϵ�
		 */
		System.out.println("abc".equals("abc"));
		
		/*
		 * (6) ����  boolean equalsIgnoreCase(String anotherString)
		 * 		�Ƚ������ַ����Ƿ���ȣ�ͬʱ���Դ�Сд
		 */
		System.out.println("ABC".equalsIgnoreCase("abc"));//true
		
		/*
		 * (7)����  byte[] getByte()
		 * ���ַ�������ת����byte������
		 */
		byte[] bytes = "abcdefghijkmlnopqrst".getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.print(bytes[i]+" ");//97 98 99 100 101 102 103 104 105 106 107 109 108 110 111 112 113 114 115 116 
		}
		System.out.println();
		
		/*
		 * (8)����  int indexOf(String str)
		 * �ж�ĳ�����ַ����ڵ�ǰ�ַ����е�һ�γ��ִ�������
		 */
		System.out.println("oraclejava.netc++com.phppythonjavago".indexOf("java"));//6
		
		/*
		 * (9)����   boolean isEmpty()
		 * �ж�һ���ַ����Ƿ�Ϊ��
		 */
		System.out.println("".isEmpty());//true
		System.out.println("a".isEmpty());//false
		
		/*
		 * (10)����  int length()
		 * �����ַ����ĳ���
		 * �ж�����ĳ��ȵ�length�����ԣ�û�����ţ��ַ������Ƿ���
		 */
		System.out.println("sdasdsa".length());//7
		System.out.println("".length());//0
		
		/*
		 * (11)����  int lastIndexOf(String str)
		 * �ж�ĳ�����ַ����ڵ�ǰ�ַ��������һ�γ����ڵ��������±꣩
		 */
		System.out.println("oraclejava.netc++com.phppythonjavago".lastIndexOf("java"));//30
		
		/*
		 * (12)����   String replace(CharSequence target, CharSequence replacement) 
		 * ������Ŀ���ַ���target�滻��������ַ���replacement
		 * String�ķ���ӿ���CharSequnce
		 */
		String newString = "http://www.baidu.com".replace("http://", "https://");
		System.out.println(newString);//https://www.baidu.com
		//�����е�:�滻��=
		System.out.println("name:zhongrongjie&password:123&age:20".replace(":", "="));//name=zhongrongjie&password=123&age=20
		
		/*
		 * (13)����   String[] split(String regex) 
		 * ���ݸ���������ʽ��ƥ���ִ��ַ�����
		 */
		String[] ymd = "1997-02-15".split("-");//"1997-02-15"��"-"Ϊ�ָ������в�֣�����һ��String���͵�������
		for (int i = 0; i < ymd.length; i++) {
			System.out.print(ymd[i]+" ");
		}
		System.out.println();
		
		/*
		 * (14)����  boolean startsWith(String prefix)
		 * �жϵ�ǰ�ַ����Ƿ���ĳ�����ַ�����ʼ
		 */
		System.out.println("http://www.baidu.com".startsWith("http://"));//true
		System.out.println("http://www.baidu.com".startsWith("https://"));//false
		
		/*
		 * (15)����  String substring(int beginIndex) 
		 * ����һ���µ��ַ��������Ǵ��ַ�����һ�����ַ���,�������������ʼ�����ȡ��ǰ�ַ���
		 */
		System.out.println("http://www.baidu.com".substring(7));//www.baidu.com
		// String substring(int beginIndex, int endIndex) -->ָ����ȡ�ַ����Ŀ�ʼ�������������
		//�����ַ�����ָ���� beginIndex ����ʼ��ֱ������ endIndex - 1 �����ַ�
		System.out.println("http://www.baidu.com".substring(7, 10));//www -->����10����
		
		/*
		 * (16)����   char[] toCharArray() 
		 * ���ַ���ת����char����
		 */
		char[] chars = "�����й���".toCharArray();
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]+" ");
		}
		System.out.println();
		
		/*
		 * (18)����   String toLowerCase()  &   String toUpperCase()  
		 * ���ַ���ת����Сд����ߣ����д���ұߣ�
		 */
		System.out.println("ABCSDJDIjdsid".toLowerCase());//abcsdjdijdsid
		System.out.println("ABCSDJDIjdsid".toUpperCase());//ABCSDJDIJDSID
		

		/*
		 * (19)����   String trim() 
		 *  �����ַ����ĸ���������ǰ���հ׺�β���հס�ȥ���ַ���ǰ��Ŀհף�ֻ��ǰ��
		 */
		System.out.println("    my neme is lihuauhau        ".trim());//my neme is lihuauhau

		/*
		 * (17)����  static String valueOf() 
		 * String��ֻ�и÷����Ǿ�̬�ģ�����Ҫ��������
		 * �����ǽ����ַ�������boolean��int��char�����ͣ�ת�����ַ���
		 * �÷�����String����ʵ���˷������أ���������Ĳ��������Զ����ø����͵�valueOf����
		 */
		System.out.println(String.valueOf(true));//true
		System.out.println(String.valueOf(100));//100
		System.out.println(String.valueOf(3.14));//3.14
		//����������һ�����󣬵ײ�ͻ���øö������͵���д��toString����,���Կ���Դ��
		System.out.println(String.valueOf(new Object()));//java.lang.Object@cac736f
		System.out.println(String.valueOf(new StringTest()));//��дtoString����
		//�ܴ�ӡ������̨�ϵĶ����ַ�����println�ײ�����String.valueOf()
		//����Ϊʲô���һ�������toString����ΪSystem.out.println()��println�����ײ�����String.valueOf()�����÷����ֵ�toString
		//����println()��������Ƕ���Ļ����õ�println����Դ��
		/*
			 public void println(Object x) {
			    String s = String.valueOf(x);
			    synchronized (this) {
			        print(s);
			        newLine();
			    }
			}
		 */



	}
	//��д�����toString
	@Override
	public String toString() {
		// TODO �Զ����ɵķ������
		//return super.toString();
		return "��дtoString����";
	}

}
