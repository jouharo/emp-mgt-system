package com.controllers;

import com.domain.Employee;
import com.repository.IEmployeeRepository;
import com.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Jo on 6/22/2017.
 */
@RestController
@RequestMapping("/api")
public class EmployeeManagementController {
    @Autowired
    IEmployeeService employeeService;
    
    @Autowired
    IEmployeeRepository employeeRepo;

    @RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee){
        //employeeService.addEmployee(employee);
    	employeeRepo.save(employee);
        return ("redirect:/list.html");
    }
    
    @RequestMapping(value = "/addNewEmployee.html", method = RequestMethod.GET)
	public ModelAndView addNewEmployee() {

		Employee emp = new Employee();
		return new ModelAndView("newEmployee", "form", emp);

	}

    @RequestMapping(value = "/listEmployees.html", method = RequestMethod.GET)
	public ModelAndView employees() {
		List<Employee> allEmployees =  employeeRepo.findAll();
		return new ModelAndView("allEmployees", "employees", allEmployees);

	}
}
