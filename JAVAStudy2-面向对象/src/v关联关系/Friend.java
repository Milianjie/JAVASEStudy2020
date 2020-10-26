package v关联关系;

public class Friend {
	
	String name;
	String addr;
	String tel;
	Me me;
	
	public Friend(String addr){
		
		this.addr=addr;
	}
	public Friend(Me m) {
		this.me=m;
	}

}
