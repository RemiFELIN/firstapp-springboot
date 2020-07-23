package com.formation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.demo.models.Speaker;

public interface SpeakerRepository extends JpaRepository<Speaker, Long>{

}
