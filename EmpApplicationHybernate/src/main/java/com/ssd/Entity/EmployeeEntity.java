package com.ssd.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")

public class EmployeeEntity {
	
	@Id
	@GeneratedValue

	private Integer empno;
	private String ename;
	private String job;
	private Integer mgr;
	private String hiredate;
	private Double sal;
	private Double comm;
	private Integer deptno;
	
	
	
	public Integer getEmpno() {
		return empno;
	}



	public void setEmpno(Integer empno) {
		this.empno = empno;
	}



	public String getEname() {
		return ename;
	}



	public void setEname(String ename) {
		this.ename = ename;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public Integer getMgr() {
		return mgr;
	}



	public void setMgr(Integer mgr) {
		this.mgr = mgr;
	}



	public String getHiredate() {
		return hiredate;
	}



	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}



	public Double getSal() {
		return sal;
	}



	public void setSal(Double sal) {
		this.sal = sal;
	}



	public Double getComm() {
		return comm;
	}



	public void setComm(Double comm) {
		this.comm = comm;
	}



	public Integer getDeptno() {
		return deptno;
	}



	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}



	public EmployeeEntity(Integer empno, String ename, String job, Integer mgr, String hiredate, Double sal,
			Double comm, Integer deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}



	public EmployeeEntity() {
		super();
	}



	@Override
	public String toString() {
		return "EmployeeEntity [empno=" + empno + ", ename=" + ename + ", job=" + job + ", mgr=" + mgr + ", hiredate="
				+ hiredate + ", sal=" + sal + ", comm=" + comm + ", deptno=" + deptno + "]";
	}
	

}
