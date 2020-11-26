package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.City;
import com.projectfinal.finalproject.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public List<City> findAll() {
        return cityRepository.findAll();
    }

    public Optional<City> findById(int id) {
        return cityRepository.findById(id);
    }

    public void delete(int id) { cityRepository.deleteById(id); }

    public void save( City city) {
        cityRepository.save(city);
    }



}
