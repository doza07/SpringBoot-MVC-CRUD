package com.doza.springboot.mvcdemo.service;

import com.doza.springboot.mvcdemo.model.Employee;


import java.util.List;


public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theId);

    void save(Employee theEmployee);

    void deleteById(int theId);

}
