package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineMaintenance;
import com.projectfinal.finalproject.repositories.ConstructionMachineMaintenanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineMaintenanceService {

    @Autowired
    private ConstructionMachineMaintenanceRepository constructionMachineMaintenanceRepository;

    public List<ConstructionMachineMaintenance> findAll() {
        return constructionMachineMaintenanceRepository.findAll();
    }

    public Optional<ConstructionMachineMaintenance> findById(int id) {
        return constructionMachineMaintenanceRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineMaintenanceRepository.deleteById(id);
    }

    public void save(ConstructionMachineMaintenance constructionMachineMaintenance) {
        constructionMachineMaintenanceRepository.save(constructionMachineMaintenance);
    }

}
