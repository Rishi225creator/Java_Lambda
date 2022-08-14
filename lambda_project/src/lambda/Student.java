  package lambda;

public class Student implements Comparable{
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int compareTo(Student o) {
		if(this.marks!=o.marks){
			return this.marks-o.marks;
		}
		return 0;
	}
	@Override
	public String toString(){
		return "Name:"+this.name+" Marks:"+this.marks;
	}
	@Override
	public int compareTo(Object o) {
		Student curr=(Student)(o);
		if(this.marks!=curr.marks){
			return this.marks-curr.marks;
		}
		return this.name.compareTo(curr.name);
	}
}
