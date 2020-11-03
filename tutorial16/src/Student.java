
public class Student extends Person{
	
	private String studenID;
	private int grade;
	private int GPA;
	public String getStudenID() {
		return studenID;
	}
	public void setStudenID(String studenID) {
		this.studenID = studenID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getGPA() {
		return GPA;
	}
	public void setGPA(int gPA) {
		this.GPA = gPA;
	}
	public Student(String name, int age, int height, int weight, String studenID, int grade, int gPA) {
		super(name, age, height, weight);
		this.studenID = studenID;
		this.grade = grade;
		this.GPA = gPA;
	}
	public void show() {
		System.out.println("---------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("학생 학번 : " + getStudenID());
		System.out.println("학생 학년 : " + getGrade());
		System.out.println("학생 성적 : " + getGPA());
	}
	

}
