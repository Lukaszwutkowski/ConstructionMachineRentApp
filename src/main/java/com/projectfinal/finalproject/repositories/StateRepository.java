package com.projectfinal.finalproject.repositories;


import com.projectfinal.finalproject.models.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {


}
