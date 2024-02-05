package com.springExample1.students_crud.service;

import java.util.List;

import com.springExample1.students_crud.entity.Student;

public interface ServiceInterface {
	
List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);

}
