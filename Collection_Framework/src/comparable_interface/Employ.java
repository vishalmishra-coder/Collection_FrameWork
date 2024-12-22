package comparable_interface;

public class Employ implements Comparable<Employ>{
	String name;
	int id;
	double salary;
	int age;
	Employ(){
//		no-arg constructor
	}
	
	Employ(String name , int id , double salary , int age){
		this.name = name ;
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	
	public String toString() {
		return "Name is : " + name + " \tId is : " + id + " \tSalary is : " + salary + " \tAge is :" + age;
	}
	public int compareTo(Employ e) {
//		return this.id - e.id;//It will sort from low id to high id.
		
		return e.id - this.id;//It will Sort from High id to Low id
	}
	
	/*public int compareTo(Employ e) {
		if(this.salary == e.salary) {
			return this.id - e.id;
		}
		return (int)(this.salary - e.salary);
	}*/
	
	/*public int compareTo(Employ e) {
		if(this.name.equals(e.name)) {
			return this.id - e.id;
		}
		return this.name.compareToIgnoreCase(e.name);
	}*/
	

}
