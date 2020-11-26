package com.projectfinal.finalproject.services;


import com.projectfinal.finalproject.models.JobTitle;
import com.projectfinal.finalproject.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobTitleService {

    @Autowired
    private JobTitleRepository jobTitleRepository;

    public List<JobTitle> findAll(){
        return jobTitleRepository.findAll();
    }

    public Optional<JobTitle> findById(int id) {
        return jobTitleRepository.findById(id);
    }

    public void delete(int id) {
        jobTitleRepository.deleteById(id);
    }

    public void save(JobTitle jobTitle) {
        jobTitleRepository.save(jobTitle);
    }

}
