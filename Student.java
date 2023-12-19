package stack;

public class Student {
	int id;
	String name;
	
	public Student(int id,String name){
		this.id=id;
		this.name=name;
	}
	
	public void display() {
		System.out.println(id+" "+name);
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
}
