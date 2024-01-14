package com.example.first.project.Service;

import com.example.first.project.Model.Employee;
import com.example.first.project.Repository.EmployRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class EmployeeService implements EmployRepository {
    private EntityManager entityManager;
    @Autowired
    public EmployeeService(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> list= entityManager.createQuery("From Employee",Employee.class) ;
        List<Employee> employees=list.getResultList();
        return employees;
    }
}
