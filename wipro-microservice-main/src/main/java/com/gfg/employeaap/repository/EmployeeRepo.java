package com.gfg.employeaap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gfg.employeaap.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
