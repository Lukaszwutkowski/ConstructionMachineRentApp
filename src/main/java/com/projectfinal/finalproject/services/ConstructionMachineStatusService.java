package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineStatus;
import com.projectfinal.finalproject.repositories.ConstructionMachineStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineStatusService {

    @Autowired
    private ConstructionMachineStatusRepository constructionMachineStatusRepository;

    public List<ConstructionMachineStatus> findAll() {
        return constructionMachineStatusRepository.findAll();
    }

    public Optional<ConstructionMachineStatus> findById(int id) {
        return constructionMachineStatusRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineStatusRepository.deleteById(id);
    }

    public void save(ConstructionMachineStatus constructionMachineStatus) {
        constructionMachineStatusRepository.save(constructionMachineStatus);
    }

}
