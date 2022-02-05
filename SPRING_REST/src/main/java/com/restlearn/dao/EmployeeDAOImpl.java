package com.restlearn.dao;


import com.restlearn.dao.EmployeeDAO;
import com.restlearn.entity.Employee;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void saveEmployee(Employee employee) {
        sessionFactory.getCurrentSession().saveOrUpdate(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    @Override
    public Employee getEmployee(Long id) {
        return sessionFactory
                .getCurrentSession()
                .get(Employee.class, id);
    }


    @Override
    public List<Employee> getAllEmployees() {
        return sessionFactory
                .getCurrentSession()
                .createQuery("from Employee ", Employee.class)
                .getResultList();
    }
}
