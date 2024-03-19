package com.studentapp.StudentAppSpringBoot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.studentapp.StudentAppSpringBoot.Entity.StudentEntity;
import com.studentapp.StudentAppSpringBoot.Exception.AllExecptionClass;
import com.studentapp.StudentAppSpringBoot.Repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;

	public StudentEntity createStudentData(StudentEntity student) {
		StudentEntity std = null;
		try {
			std = studentRepository.save(student);
		} catch (Exception e) {
			throw new AllExecptionClass("Already Email    " + student.getEmail() + "     exist");
		}
		return std;
	}

	public List<StudentEntity> getAllStudents() {
		return studentRepository.findAll();

	}

	public StudentEntity getStudentById(Long id) {
		return studentRepository.findById(id).get();

	}

	public void updateStudentData(StudentEntity emp) {
		studentRepository.saveAndFlush(emp);
	}

	public void deleteByIdstudent(Long id) {
		studentRepository.deleteById(id);
	}
}
