/*
 *   ����Object�е�equals����
 *   
 *     equals����:
 *     
 *         public boolean equals(Object obj) {
        return (this == obj);
    }
    o1.equals(o2):o1��this��o2��obj
    == ����������������ͣ��Ƚϵ����ڴ��ַ����ͬ��true����֮��false
    Object�е�equals�����Ƚϵ����������õ��ڴ��ַ
    
    java������equals������Ƶ�Ŀ�ģ��ж������Ķ����Ƿ�һ��	

 */
package rObject��;

public class Test02 {
	
	public static void main(String[] args){
		
		Object o1 = new Object();
		Object o2 = new Object();
		
		//o1.equals()����˵��ǰ�����ַ��o1������˵this==o1
		//o1.equals(o2)����ʱobj==o2
		System.out.println(o1.equals(o2));//false
		System.out.println(o1==o2);
		
		Star s1 = new Star(250,"������");
		Star s2 = new Star(250,"������");
		System.out.println(s1.equals(s2));//false
		System.out.println(s1==s2);
	}

}

class  Star{
	
	//���֤����
	int id;
	//����
	String name;
	
	Star(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	//Object�е�equals�����Ƚϵ����ڴ��ַ
	//����ʾҵ���߼���Ӧ�Ƚ�����
	//����Object�е�equals����ҲҪ��д
	//��������涨��д
	//�˴�����涨��������֤��һ�£�������һ�£������ͬһ����
	//s1.equals(s2)
	//s1�൱����this��s2�൱��obj����obj��Object���͵ģ�Object��
	//û��id���ԣ�����obj.id���ʲ��ˣ�����Ҫ��objǿ��ת��ΪStar���͵�����
	 public boolean equals(Object obj){
		 
		 if (this==obj){
			 
			return true;
			 
		           }
		 if(obj instanceof Star){//�Ƕ�̬�Ϳ���ǿ������ת��
		 
			 Star s = (Star)obj;
		
			 if(this.id==s.id && s.name.equals(name)){
			 //��Ϊs.name.equals()���õ���String������д��equals����,ʲô���͵�����.���������õľ����Ǹ����еķ���
			 //������ϵ�������͵�����ָ�������͵Ķ��󣬶�̬
				 return true;
		       }
		   }
		 return false;
	 }
}
