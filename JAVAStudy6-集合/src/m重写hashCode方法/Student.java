package m重写hashCode方法;

public class Student {
	
	private int no;
	
	private String name;
	
	public Student() {
		// TODO 自动生成的构造函数存根
	}

	public Student(int age, String name) {
		super();
		this.name = name;
		this.no = age;
	}

	public Student( String name) {
		super();
		this.name = name;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return no;
	}

	public void setAge(int age) {
		this.no = age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}
	
	
	
		

}
