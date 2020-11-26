package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.ConstructionMachineMake;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConstructionMachineMakeRepository extends JpaRepository<ConstructionMachineMake, Integer> {

}
