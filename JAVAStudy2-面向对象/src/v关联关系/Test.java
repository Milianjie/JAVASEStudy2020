package v������ϵ;

public class Test {
	
	public static void main(String[] args){
		
		Friend f = new Friend("��������");
		
		//����������ϵ
		Me m = new Me(f);
		
		System.out.println(m.f.addr);
		
		Me me = new Me("��ɳ��i");
		
		Friend friend = new Friend(me);
		
		System.out.println(friend.me.name);
		
	}

}
