package com.ssd.Dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ssd.Entity.DeptEntity;
import com.ssd.Entity.EmployeeEntity;
import com.ssd.Util.HibernateUtil;

public class EmployeeDao {

	
Transaction transaction = null;
	
	public List<EmployeeEntity>  getEmployee() {
		List<EmployeeEntity> emplist=new ArrayList<EmployeeEntity>();
        try  {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            emplist= session.createQuery("from EmployeeEntity", EmployeeEntity.class).list();
        }catch (Exception e) {
			e.printStackTrace();
		}
        return emplist;
	}
	public List<DeptEntity>  getDept() {
		List<DeptEntity> emplist=new ArrayList<DeptEntity>();
        try  {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            emplist= session.createQuery("from DeptEntity", DeptEntity.class).list();
        }catch (Exception e) {
			e.printStackTrace();
		}
        return emplist;
	}
	public EmployeeEntity getUserById(Integer empno) {
        Session session = null;
        EmployeeEntity user = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            user =  (EmployeeEntity) session.get(EmployeeEntity.class, empno);
            Hibernate.initialize(user);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }
	   public void removeStudent(Integer empno) {
	        Transaction transaction = null;
	        try  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	            transaction = session.beginTransaction();
	            EmployeeEntity employee = session.get(EmployeeEntity.class, empno);
	            if (employee != null) {
	                session.remove(employee);
	                System.out.println("student 1 is deleted");
	            }
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    public void saveOrUpdateStudent(EmployeeEntity entity,int empno) {
	        Transaction transaction = null;
	        try  {
	        	Session session = HibernateUtil.getSessionFactory().openSession();
	            transaction = session.beginTransaction();
	            session.saveOrUpdate(entity);
	            transaction.commit();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    } 
}
