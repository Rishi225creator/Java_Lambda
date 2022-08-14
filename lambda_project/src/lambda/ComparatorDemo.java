package lambda;
import java.util.*;

public class ComparatorDemo {
	public static void main(String[] args){
		List<Student> stuList=new ArrayList<Student>();
		stuList.add(new Student("Gaurav",225));
		stuList.add(new Student("Vinita",645));
		stuList.add(new Student("Rashi",645));
		stuList.add(new Student("Ram",345));
		stuList.add(new Student("Shyam",243));
		for(Student stu:stuList){
			System.out.println(stu);
		}
		Collections.sort(stuList);
		System.out.println("_______________________________");
		for(Student stu:stuList){
			System.out.println(stu);
		}
	}
}
