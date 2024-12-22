package comparator_interface;

import java.util.Comparator;

public class Employ {
	String name;
	int id;
	double salary;
	int age;
	Employ(){
//		no - arg constructor
	}
	Employ(String name , int id , double salary , int age){
		this.name = name ;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	public String toString() {
		return "Name is : " + name + " \tId is : " + id + " \tSalary is : " + salary + " \tAge is : " + age;
	}

}
