package HAS_A_Relationship.Many_To_Many.bean;

public class Course {

	private String courseName;
	private String courseId;
	private String coursePrice;
	public Course(String courseName, String courseId, String coursePrice) {
		super();
		this.courseName = courseName;
		this.courseId = courseId;
		this.coursePrice = coursePrice;
	}
	public String getCourseName() {
		return courseName;
	}
	public String getCourseId() {
		return courseId;
	}
	public String getCoursePrice() {
		return coursePrice;
	}
	
	
	
	
}
