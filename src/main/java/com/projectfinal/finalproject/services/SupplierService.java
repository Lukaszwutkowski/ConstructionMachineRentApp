package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.Supplier;
import com.projectfinal.finalproject.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> findAll(){
        return supplierRepository.findAll();
    }

    public Optional<Supplier> findById(int id) {
        return supplierRepository.findById(id);
    }

    public void delete(int id) {
        supplierRepository.deleteById(id);
    }

    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }
}
