package com.service;

import com.domain.Employee;
import com.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jo on 6/22/2017.
 */
@Service
public class EmployeeServiceImpl implements IEmployeeService{
    @Autowired
    IEmployeeRepository employeeRepository;

    @Override
    public void addEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    @Override
    public List<Employee> getListOfEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployee() {
        return null;
    }
}
