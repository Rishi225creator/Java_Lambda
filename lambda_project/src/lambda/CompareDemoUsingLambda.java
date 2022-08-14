package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareDemoUsingLambda{
	public static void main(String[] args){
		List<Student> stuList=new ArrayList<Student>();
		stuList.add(new Student("Gaurav",225));
		stuList.add(new Student("Vinita",645));
		stuList.add(new Student("Rashi",645));
		stuList.add(new Student("Ram",345));
		stuList.add(new Student("Shyam",243));
		Collections.sort(stuList,(ob1,ob2)->{
			if(ob1.getMarks()!=ob2.getMarks()){
				return ob1.getMarks()-ob2.getMarks();
			}
			return ob1.getName().compareTo(ob2.getName());
		});
		System.out.println("_______________________________");
		for(Student stu:stuList){
			System.out.println(stu);
		}
	}
}
