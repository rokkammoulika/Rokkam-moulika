package com.studentapp.StudentAppSpringBoot.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.studentapp.StudentAppSpringBoot.Entity.StudentEntity;
import com.studentapp.StudentAppSpringBoot.Service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
	public StudentService studentService;

	@PostMapping("/students")
	public ResponseEntity<?> createStudentData(@Valid @RequestBody StudentEntity student, BindingResult reerror) {

		Map<String, String> mapError = new HashMap<>();
		if (reerror.hasErrors()) {
			for (FieldError error : reerror.getFieldErrors()) {
				mapError.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<>(mapError, HttpStatus.BAD_REQUEST);
		}
		StudentEntity studentData = studentService.createStudentData(student);
		return new ResponseEntity<StudentEntity>(studentData, HttpStatus.OK);
	}

	@GetMapping("/students")
	public ResponseEntity<List<StudentEntity>> getAllEmployees() {
		List<StudentEntity> getEmployee = studentService.getAllStudents();
		return new ResponseEntity<List<StudentEntity>>(getEmployee, HttpStatus.OK);

	}

	@GetMapping("/students/{id}")
	public ResponseEntity<StudentEntity> getEmployee(@PathVariable Long id) {
		StudentEntity getbyId = studentService.getStudentById(id);
		return new ResponseEntity<StudentEntity>(getbyId, HttpStatus.OK);
	}

	@PutMapping("/students/{id}")
	public ResponseEntity<String> updateEmployee(@RequestBody StudentEntity emp) {
		studentService.updateStudentData(emp);
		return new ResponseEntity<String>("Successfully Updated",HttpStatus.OK);

	}

	@DeleteMapping("/students/{id}")
	public ResponseEntity<String> deleteByIdStudent(@PathVariable Long id) {
		studentService.deleteByIdstudent(id);
		return new ResponseEntity<String>("Successfully Delete",HttpStatus.OK);

	}
}
