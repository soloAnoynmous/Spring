package com.tutorial.service;

import com.tutorial.model.Speaker;
import com.tutorial.repository.SpeakerRepository;
import com.tutorial.repository.SpeakerRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakServiceImpl no args constructor");
    }


    // for constructor injection
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakServiceImpl setter");
        this.repository = repository;
    }
}
