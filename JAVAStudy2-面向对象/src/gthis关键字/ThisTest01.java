
/*
 *    this�ؼ��֣�
 *              1.this��ʲô��
 *              this��һ����������
 *              �ڶ��е�ÿһ��Java�����϶���this
 *              this�����ڴ��ַָ������
 *              
 *              2.this������ʲô�ط�
 *              ��һ��this����Ӧ���ڳ�Ա������
 *              
 *              �ڶ���this����Ӧ���ڹ��췽����
 *              �﷨��this(ʵ��)
 *                    ͨ��һ�����췽��ȥ������һ�����췽��
 *                    this(ʵ��);����������ڹ��췽���ĵ�һ��
 *                    ���ã�ʹ����õ�����������
 */
package gthis�ؼ���;

public class ThisTest01 {
	
	public static void main(String[] args){
		
		//����MyDate�����
		MyDate u1 =new MyDate();
		System.out.println(u1.year+"��"+u1.month+"��"+u1.day+"��");
		
		MyDate u2 =new MyDate(2019,9,18);
		System.out.println(u2.year+"��"+u2.month+"��"+u2.day+"��");
	}

}

class MyDate{
	
	//����
	int year;
	int month;
	int day;
	
	//���췽��
	
	//�����ڴ������ڶ����ʱ��Ĭ��������1997-1-1
	MyDate(){//�޲����Ĺ��췽������Ҳд����
		this(1997,1,1);
	}
	
	MyDate(int _year,int _month,int _day){
		year=_year;
		month=_month;
		day=_day;
	}
}
