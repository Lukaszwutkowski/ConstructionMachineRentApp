package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineStatusRepository extends JpaRepository<ConstructionMachineStatus, Integer> {

}
