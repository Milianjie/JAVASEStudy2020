package v关联关系;

public class Test {
	
	public static void main(String[] args){
		
		Friend f = new Friend("广西贺州");
		
		//建立关联关系
		Me m = new Me(f);
		
		System.out.println(m.f.addr);
		
		Me me = new Me("哈沙科i");
		
		Friend friend = new Friend(me);
		
		System.out.println(friend.me.name);
		
	}

}
