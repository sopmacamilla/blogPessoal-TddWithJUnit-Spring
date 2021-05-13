package com.generation.junit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.junit.model.ContatoModel;

public interface ContatoRepository extends JpaRepository<ContatoModel, Long> {

}
