package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineTypeRepository extends JpaRepository<ConstructionMachineType, Integer> {

}
