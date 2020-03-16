package com.tutorial.service;

import com.tutorial.model.Speaker;
import com.tutorial.repository.SpeakerRepository;
import com.tutorial.repository.SpeakerRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new SpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
