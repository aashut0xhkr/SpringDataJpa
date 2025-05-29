package com.datajpa;


import com.datajpa.entity.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class DatajpaApplication {

	public static void main(String[] args) {SpringApplication.run(DatajpaApplication.class, args);
		Student s1=new Student(101,"raju","male");
		Student s2=new Student(102,"rani","female");
		Student s3=new Student(103,"ashok","male");
		Student s4=new Student(104,"ashu","male");

		List<Student> list= Arrays.asList(s1,s2,s3,s4);
//		SimpleJpaRepository<T, ID> r;
//		r.saveAll(list);
//		r.deleteStudent(104);
//
//		System.out.println("Class name: " + r.getClass().getName());
//
//		System.out.println("Record Inserted"+list);


	}

}
