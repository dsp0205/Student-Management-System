package com.example.studentmanagementsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.studentmanagementsystem.entities.Student;
import com.example.studentmanagementsystem.repositories.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);

		
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		
		// Student student1 = new Student("Deep", "Pimpale", "dsp@gmail.com");
		// studentRepository.save(student1);
		
		// Student student2 = new Student("Sanjay", "Pimpale", "sk@gmail.com");
		// studentRepository.save(student2);
		 
		// Student student3 = new Student("Thor", "Odinson", "godofthunder@gmail.com");
		// studentRepository.save(student3);
		
	}

}
