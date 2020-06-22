package Java8Features;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	int eno;
	String ename;
	
	public Employee(int eno, String ename){
		this.ename= ename;
		this.eno = eno;
	}
	
	public String toString(){
		return eno+":"+ename;
	}
}

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(10,"Dinesh"));
		list.add(new Employee(11,"Ramesh"));
		list.add(new Employee(9,"Sudhakar"));
		list.add(new Employee(8,"Pradeep"));
		//Ascending order based on Employee number
		Collections.sort(list, (e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		System.out.println(list);
		//Ascending order based on Employee name
		Collections.sort(list, (e1,e2)->e1.ename.compareTo(e2.ename));
		System.out.println(list);
	}

}
