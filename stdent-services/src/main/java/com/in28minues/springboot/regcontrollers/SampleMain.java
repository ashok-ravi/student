package com.in28minues.springboot.regcontrollers;

import com.in28minues.springboot.RestClient.StudentClient;
import com.in28minues.springboot.model.Student;

public class SampleMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student s=new Student(10,"Ashok Ravi",100);
		System.out.println("Hash code of S:"+s.hashCode());
		Student s1=new Student(11,"Lakshmi K",100);
		System.out.println("Hash code of S1:"+s1.hashCode());
		StudentClient.getEmployees();
		//StudentClient client = new StudentClient();
	}

}
