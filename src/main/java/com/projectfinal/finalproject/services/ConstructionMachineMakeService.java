package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.ConstructionMachineMake;
import com.projectfinal.finalproject.repositories.ConstructionMachineMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConstructionMachineMakeService {

    @Autowired
    private ConstructionMachineMakeRepository constructionMachineMakeRepository;

    public List<ConstructionMachineMake> findAll() {
        return constructionMachineMakeRepository.findAll();
    }

    public Optional<ConstructionMachineMake> findById(int id) {
        return constructionMachineMakeRepository.findById(id);
    }

    public void delete(int id) {
        constructionMachineMakeRepository.deleteById(id);
    }

    public void save(ConstructionMachineMake constructionMachineMake) {
        constructionMachineMakeRepository.save(constructionMachineMake);
    }

}
