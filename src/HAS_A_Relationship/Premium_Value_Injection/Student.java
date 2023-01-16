package HAS_A_Relationship.Premium_Value_Injection;

public class Student {
	
	private String name;
	private int age;
	private int sId;
	
	
	public Student(String name, int age, int sId){
		this.name = name;
		this.age = age;
		this.sId = sId;
	}
	
	public String getNamae() {
		return name;
	}
	public void setNamae(String namae) {
		this.name = namae;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	
	public String toString(){
		return "[ "+name+", "+age+", "+sId+" ]";
	}
	
	

}
