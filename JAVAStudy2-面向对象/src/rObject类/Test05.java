package rObject类;

public class Test05 {
	
	public static void main(String[] args){
		
		//hashCode方法返回的是该对象的哈希码值
		//java对象的内存地址经过哈希算法的出的int类型
		
		Test05 t = new Test05();
		System.out.println(t.hashCode());//1270922949
	}

}
