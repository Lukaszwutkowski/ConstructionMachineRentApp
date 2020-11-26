package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineModel;
import com.projectfinal.finalproject.repositories.ConstructionMachineModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineModelService {

    @Autowired
    private ConstructionMachineModelRepository constructionMachineModelRepository;

    public List<ConstructionMachineModel> findAll() {
        return constructionMachineModelRepository.findAll();
    }

    public Optional<ConstructionMachineModel> findById(int id) {
        return constructionMachineModelRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineModelRepository.deleteById(id);
    }

    public void save(ConstructionMachineModel constructionMachineModel) {
        constructionMachineModelRepository.save(constructionMachineModel);
    }

}
