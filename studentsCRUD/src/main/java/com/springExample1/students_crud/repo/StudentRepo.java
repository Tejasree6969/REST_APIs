package com.springExample1.students_crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springExample1.students_crud.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

}
