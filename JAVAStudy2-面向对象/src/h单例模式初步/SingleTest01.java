
package h����ģʽ����;

public class SingleTest01 {
	
	public static void main(String[] args){
		
		
		Singleton u1 = Singleton.set();//��Ҫ���÷��������Ǳ����У�����. ����ʡ
		Singleton u2 = Singleton.set();//Singleton.set=s = new Singleton()
		
		System.out.println(u1==u2);

}
}