package HAS_A_Relationship.Many_To_Many.bean;

public class Student {
	
	private String stdName;
	private String stdId;
	private String stdAddr;
	
//	Has-A Variable
	Course[] course;

	public Student(String stdName, String stdId, String stdAddr, Course[] course){
		super();
		this.stdName = stdName;
		this.stdId = stdId;
		this.stdAddr = stdAddr;
		this.course = course;
	}

	public String getStdName(){
		return stdName;
	}

	public String getStdId(){
		return stdId;
	}

	public String getStdAddr(){
		return stdAddr;
	}
	
	public void getCourse(){
		int i = 1;
		for(Course cr:course){
			System.out.println("Course-" + i + " Name : " + cr.getCourseName());
			System.out.println("Course-" + i + " Id : " + cr.getCourseId());
			System.out.println("Course-" + i + " price : " + cr.getCoursePrice());
			i++;
			System.out.println();
		}
	}

//	public Course[] getCourse(){
//		return course;
//	}
	
	

}
