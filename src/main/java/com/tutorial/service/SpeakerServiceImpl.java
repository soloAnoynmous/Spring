package com.tutorial.service;

import com.tutorial.model.Speaker;
import com.tutorial.repository.SpeakerRepository;
import com.tutorial.repository.SpeakerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;


    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    // for setter injection
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
