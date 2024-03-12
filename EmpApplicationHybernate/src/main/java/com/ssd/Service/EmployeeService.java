package com.ssd.Service;

import java.util.List;

import com.ssd.Dao.EmployeeDao;
import com.ssd.Entity.DeptEntity;
import com.ssd.Entity.EmployeeEntity;



public class EmployeeService {
	
	EmployeeDao dao=new EmployeeDao();
	public List<EmployeeEntity> getEmployee(){
		return dao.getEmployee();
		
	}
	public List<DeptEntity>  getDept(){
		return dao.getDept();
	}
	public EmployeeEntity getUserById(Integer empno) {
		return dao.getUserById(empno);
	}
	public void removeStudent(Integer empno) {
		dao.removeStudent(empno);
	}
	   public void saveOrUpdateStudent(EmployeeEntity entity,int empno) {
		   dao.saveOrUpdateStudent(entity, empno);
	   }

}
