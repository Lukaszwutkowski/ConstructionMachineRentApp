package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineHire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineHireRepository extends JpaRepository<ConstructionMachineHire, Integer> {

}
