/*
 *    super�ؼ������ڹ��췽���У�
 *         �﷨�� super(ʵ��);
 *         
 *       ���ã�ͨ������Ĺ��췽��ȥ���ø���Ĺ��췽��
 *       �﷨����һ�����췽����һ�����û����ʾthis(...); Ҳû����ʾsuper(...);
 *                ϵͳ��Ĭ�ϵ���super(...);
 *       ע�⣺super(...);�ĵ���ֻ�ܷ��ڵ�һ�С�����䲻�ܺ�this(...);����
 *       
 *       super(...);��Ȼ�����˸����еĹ��췽�����������ᴴ���������
 *       
 *       ��java�����У�ֻҪ�Ǵ���java������ôObject�е��޲������췽��һ����ִ��
 *       
 *       ����ģʽ��ȱ�㣺��Ϊ��Ҫ���췽��˽�л����������޷���������
 *                      ���Ե���ģʽ�������޷����̳�
 */
package msuper�ؼ���;

public class DebitAccount02 extends Account02{
	
	//Filed
	//���еĶ�������
	private double debit;
	
	//Constructor
	public DebitAccount02(){
		//�˴�������䣺super(); �������޲��������ø����е��޲������췽��
		System.out.println("����DebiAccount02���޲������췽��ִ��");
	}
	
	//�����Զ�˽�л�ʱ,�޷�ֱ�ӷ���ִ�У�������super(...);
	public DebitAccount02(String actno,double balance,double debit){
		//ͨ������Ĺ��췽��ȥ���ø���Ĺ��췽���������ǣ�����ǰ��������еĸ�����������ֵ
		super(actno,balance);//�������˽�л����Բ�����this.��ֵ
		this.debit=debit;
	}
	
	//setter and getter
	public void setDebit(double debit){
		this.debit=debit;
	}
	public double getDebit(){
		return debit;
	}

}
