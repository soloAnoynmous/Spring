package com.tutorial.repository;

import com.tutorial.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
