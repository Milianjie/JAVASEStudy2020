
/*
 *     ������ִ�еĹ����в����Ĵ�������:
 *     1.���ݵĲ����ǻ�����������
 *     2.���ݵĲ�����������������
 */
    //���³��򴫵ݻ�����������
package f����ִ�в�����������;

public class Test01 {
	
	public static void m1(int i){//��static�ķ���������
		i++;
		System.out.println("i-->"+i);//11
		
	}	
	//����������˴����ǳ�������,����ִ�д˴�
	public static void main(String[] args){
		int i=10;
		m1(i);
		System.out.println("i-->"+i);//10
	}

}
