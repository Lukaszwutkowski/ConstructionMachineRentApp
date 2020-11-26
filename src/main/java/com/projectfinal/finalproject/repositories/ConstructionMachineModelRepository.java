package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineModelRepository extends JpaRepository<ConstructionMachineModel, Integer> {

}
