package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineHire;
import com.projectfinal.finalproject.repositories.ConstructionMachineHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineHireService {

    @Autowired
    private ConstructionMachineHireRepository constructionMachineHireRepository;

    public List<ConstructionMachineHire> findAll() {
        return constructionMachineHireRepository.findAll();
    }

    public Optional<ConstructionMachineHire> findById(int id) {
        return constructionMachineHireRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineHireRepository.deleteById(id);
    }

    public void save(ConstructionMachineHire constructionMachineHire) {
        constructionMachineHireRepository.save(constructionMachineHire);
    }

}
