package com.example.PatientRegistryreactive.Repository;

import com.example.PatientRegistryreactive.Model.Patients;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PatientRepository extends ReactiveMongoRepository<Patients, String> {

}