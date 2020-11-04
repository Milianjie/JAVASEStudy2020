package bean;

public class Vip {
	
	private String name;
	private String birth;
	private boolean sex;
	private int num;
	
	public Vip() {
		super();
	}

	public Vip(String name, String birth, boolean sex, int num) {
		super();
		this.name = name;
		this.birth = birth;
		this.sex = sex;
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Vip [name=" + name + ", birth=" + birth + ", sex=" + sex + ", num=" + num + "]";
	}
	
	

}
