package com.projectfinal.finalproject.services;

import com.projectfinal.finalproject.models.ConstructionMachineMovement;
import com.projectfinal.finalproject.repositories.ConstructionMachineMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineMovementService {

    @Autowired
    private ConstructionMachineMovementRepository constructionMachineMovementRepository;

    public List<ConstructionMachineMovement> findAll() {
        return constructionMachineMovementRepository.findAll();
    }

    public Optional<ConstructionMachineMovement> findById(int id) {
        return constructionMachineMovementRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineMovementRepository.deleteById(id);
    }

    public void save(ConstructionMachineMovement constructionMachineMovement) {
        constructionMachineMovementRepository.save(constructionMachineMovement);
    }

}
