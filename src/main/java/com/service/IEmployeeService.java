package com.service;

import com.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by Jo on 6/22/2017.
 */
@Service
public interface IEmployeeService {
    void addEmployee(Employee emp);
    List<Employee> getListOfEmployees();
    Employee getEmployee();
}
