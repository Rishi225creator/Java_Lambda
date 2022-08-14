package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemoUsingComparator{
	public static void main(String[] args){
		List<Student> stuList=new ArrayList<Student>();
		stuList.add(new Student("Gaurav",225));
		stuList.add(new Student("Vinita",645));
		stuList.add(new Student("Rashi",645));
		stuList.add(new Student("Ram",345));
		stuList.add(new Student("Shyam",243));
		Collections.sort(stuList,new sortByMarks());
		System.out.println("_______________________________");
		for(Student stu:stuList){
			System.out.println(stu);
		}
	}
}
class sortByMarks implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getMarks()!=o2.getMarks()){
			return o1.getMarks()-o2.getMarks();
		}
		return o1.getName().compareTo(o2.getName());
	}
	
}
