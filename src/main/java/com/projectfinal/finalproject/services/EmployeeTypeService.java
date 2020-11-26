package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.EmployeeType;
import com.projectfinal.finalproject.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {

    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    public List<EmployeeType> findAll(){
        return employeeTypeRepository.findAll();
    }

    public Optional<EmployeeType> findById(int id) {
        return employeeTypeRepository.findById(id);
    }

    public void delete(int id) {
        employeeTypeRepository.deleteById(id);
    }

    public void save( EmployeeType employeeType) {
        employeeTypeRepository.save(employeeType);
    }

}
