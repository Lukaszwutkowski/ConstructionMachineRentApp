package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.Contact;
import com.projectfinal.finalproject.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public Optional<Contact> findById(int id) {
        return contactRepository.findById(id);
    }

    public void delete(int id) {
        contactRepository.deleteById(id);
    }

    public void save( Contact contact) {
        contactRepository.save(contact);
    }

}
