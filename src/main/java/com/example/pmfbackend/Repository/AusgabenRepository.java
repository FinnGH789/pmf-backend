package com.example.pmfbackend.Repository;


import com.example.pmfbackend.Entity.Ausgaben;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AusgabenRepository extends JpaRepository<Ausgaben, Integer> {
}
