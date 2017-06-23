package com.repository;

import com.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


/**
 * Created by Jo on 6/22/2017.
 */
//@Repository
public interface IEmployeeRepository extends JpaRepository<Employee, Long>{
}
