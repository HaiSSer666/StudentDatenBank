package main;

public class Student {

	private String name;
	private int age, id;
	
	public Student(int id, String name, int age) {
		this.name=name;
		this.age=age;
		this.id=id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String toString() {
		return "Name - "+name + ", age - " + age + " , year - "+id;
	}
}
