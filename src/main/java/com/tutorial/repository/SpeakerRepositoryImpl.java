package com.tutorial.repository;

import com.tutorial.model.Speaker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class SpeakerRepositoryImpl implements SpeakerRepository {

    @Value("#{ T(java.lang.Math).random() *100}")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Satyam");
        speaker.setLastName("Singh");
        speaker.setSeedNum(seedNum);

        speakers.add(speaker);

        return speakers;
    }
}
