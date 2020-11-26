package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineRepository extends JpaRepository<ConstructionMachine, Integer> {

}
