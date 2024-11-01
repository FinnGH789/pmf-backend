package com.example.pmfbackend.Repository;

import com.example.pmfbackend.Entity.Einnahmen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EinnahmenRepository extends JpaRepository<Einnahmen, Long> {
}