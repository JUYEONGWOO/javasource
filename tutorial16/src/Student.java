
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
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());
		System.out.println("�л� �й� : " + getStudenID());
		System.out.println("�л� �г� : " + getGrade());
		System.out.println("�л� ���� : " + getGPA());
	}
	

}
