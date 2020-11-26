package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineType;
import com.projectfinal.finalproject.repositories.ConstructionMachineTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineTypeService {

    @Autowired
    private ConstructionMachineTypeRepository constructionMachineTypeRepository;

    public List<ConstructionMachineType> findAll() {
        return constructionMachineTypeRepository.findAll();
    }

    public Optional<ConstructionMachineType> findById(int id) {
        return constructionMachineTypeRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineTypeRepository.deleteById(id);
    }

    public void save(ConstructionMachineType constructionMachineType) {
        constructionMachineTypeRepository.save(constructionMachineType);
    }

}
