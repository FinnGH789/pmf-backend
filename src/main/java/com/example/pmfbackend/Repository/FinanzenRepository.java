package com.example.pmfbackend.Repository;

import com.example.pmfbackend.Entity.Finanzen;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanzenRepository extends JpaRepository<Finanzen, Long> {
}
