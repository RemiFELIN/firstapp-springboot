package com.formation.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.formation.demo.models.Session;

public interface SessionRepository extends JpaRepository<Session, Long>{

}
