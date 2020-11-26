package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineMaintenance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineMaintenanceRepository extends JpaRepository<ConstructionMachineMaintenance, Integer> {

}
