package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.Employee;
import com.projectfinal.finalproject.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }

    public Optional<Employee> findById(int id) {
        return employeeRepository.findById(id);
    }

    public void delete(int id) {
        employeeRepository.deleteById(id);
    }

    public void save( Employee employee) {
        employeeRepository.save(employee);
    }

    public Employee findByUserName(String un) {
        return employeeRepository.findByUserName(un);
    }

}
