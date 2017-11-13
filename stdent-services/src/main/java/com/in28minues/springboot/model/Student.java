package com.in28minues.springboot.model;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.EqualsBuilder;;

public class Student {

	int no;
	String name;
	int marks;
	
	public Student()
	{
		
	}
	
	public Student(int no, String name, int marks) {
		super();
		this.no = no;
		this.name = name;
		this.marks = marks;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 37).
			       append(no).
			       append(name).
			       append(marks).toHashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		
		Student that = (Student) obj;
		return new EqualsBuilder().
				append(no,that.no).
				append(name,that.name).
				append(marks,that.marks).
				isEquals();
	}
	@Override
	public String toString() {
		return "Student [no=" + no + ", name=" + name + ", marks=" + marks + "]";
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}
}
