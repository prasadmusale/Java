package com.example.SpringJDBCDemo;

import com.example.SpringJDBCDemo.Model.Student;
import com.example.SpringJDBCDemo.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringJdbcDemoApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setRollNo(104);
		s.setName("Param");
		s.setMarks(67);

		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		System.out.println(s);



	}

}
