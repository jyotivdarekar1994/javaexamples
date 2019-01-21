
public class Student {

	int marks;
	String name;
	
	public int getMarks() {
		return marks;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + "]";
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		Student s;
		s = new Student();
		s.setMarks(70);
		s.setName("Vikas");
	
		Student s1 = new Student();
		s1.setMarks(80);
		s1.setName("Jyoti");
		
		System.out.println(s);
		System.out.println(s1);
	}
	
}
