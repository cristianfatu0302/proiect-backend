package com.example.proiectbackend.repository;

import com.example.proiectbackend.model.Angajat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AngajatRepository extends JpaRepository<Angajat, Integer> {

}
