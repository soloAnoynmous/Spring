package com.tutorial.repository;

import com.tutorial.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Satyam");
        speaker.setLastName("Singh");

        speakers.add(speaker);

        return speakers;
    }
}
