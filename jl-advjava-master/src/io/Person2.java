package io;

public class Person2 {
	private int personID;
	private int age;
	private float salary;

	public Person2(int personID, int age, float salary) {
		this.personID = personID;
		this.age = age;
		this.salary = salary;
	}

	public Person2() {
		// TODO Auto-generated constructor stub
	}

	public int getPersonID() {
		return personID;
	}

	public int getAge() {
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public void setPersonID(int personID) {
		this.personID = personID;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person2 [personID=" + personID + ", age=" + age + ", salary=" + salary + "]";
	}

}
