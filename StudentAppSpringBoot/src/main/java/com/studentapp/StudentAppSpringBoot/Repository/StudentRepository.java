package com.studentapp.StudentAppSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.studentapp.StudentAppSpringBoot.Entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{

}
