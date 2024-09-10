package com.example.security.controller;

import java.util.*;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.security.model.Student;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class StudentController {

	private List<Student> students = new ArrayList<>(List.of(new Student(1, "John", 20), new Student(2, "Cena", 21)));

	@GetMapping("/getStudents")
	public List<Student> getStudents() {
		return students;
	}

	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody Student student) {
		students.add(student);
		return student;
	}

	@GetMapping("/getCsrfToken")
	public CsrfToken getCsrfToken(HttpServletRequest request) {
		return (CsrfToken) request.getAttribute("_csrf");
	}
	
	
}
