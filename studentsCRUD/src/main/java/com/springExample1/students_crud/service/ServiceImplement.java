package com.springExample1.students_crud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springExample1.students_crud.entity.Student;
import com.springExample1.students_crud.repo.StudentRepo;

@Service
public class ServiceImplement implements ServiceInterface{

	
	private StudentRepo studentRepo;
	
	
	/**
	 * @param studentRepo
	 */
	public ServiceImplement(StudentRepo studentRepo) {
		super();
		this.studentRepo = studentRepo;
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepo.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		return studentRepo.save(student);;
	}

	@Override
	public void deleteStudentById(Long id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

	/**
	 * 
	 */

	

}
