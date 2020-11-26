package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachine;
import com.projectfinal.finalproject.repositories.ConstructionMachineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineService {

    @Autowired
    private ConstructionMachineRepository constructionMachineRepository;

    public List<ConstructionMachine> findAll() {
        return constructionMachineRepository.findAll();
    }

    public Optional<ConstructionMachine> findById(int id) {
        return constructionMachineRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineRepository.deleteById(id);
    }

    public void save(ConstructionMachine constructionMachine) {
        constructionMachineRepository.save(constructionMachine);
    }

}
