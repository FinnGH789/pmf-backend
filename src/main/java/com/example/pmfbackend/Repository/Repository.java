package com.example.pmfbackend.Repository;

import com.example.pmfbackend.Entity.Ausgaben;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Ausgaben, Long> {
}
