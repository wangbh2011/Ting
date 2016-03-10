package com.demo.info;

abstract class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public int getAge() {
		return this.age;

	}

	public void setAge(int age) {
		this.age = age;

	}

	public abstract String info();

}

class Student extends Person {
	private String school;

	public Student(String name, int age, String school) {
		super(name, age);
		this.school = school;

	}

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;

	}

	public String info() {
		return "name:" + super.getName() +"age:" + super.getAge() + ";school:"
				+ this.getSchool();

	}
}

public class Abstract02 {
	public static void main(String args[]) {
		Student student = new Student("pretty", 13, "Sum");
		System.out.println(student.info());

	}

}
