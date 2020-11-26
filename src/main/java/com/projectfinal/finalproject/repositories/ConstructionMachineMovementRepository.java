package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineMovementRepository extends JpaRepository<ConstructionMachineMovement, Integer> {

}
