package com.example.PatientRegistryreactive.Controller;

import com.example.PatientRegistryreactive.Repository.PatientRepository;
import com.example.PatientRegistryreactive.Model.Patients;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PatientController {
    @Autowired
    private PatientRepository repo;

    @GetMapping("/viewPatients")
    public Flux<Patients> getAllPatients() {
        return repo.findAll();
    }

    @PostMapping("/addPatient")
    public Mono<Patients> addPatient(@RequestBody Patients patient) {
        return repo.save(patient);
    }
}

