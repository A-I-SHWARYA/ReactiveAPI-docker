package com.example.PatientRegistryreactive.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;






@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "patients")
public class Patients {
    @Id
    private String id;
    private String patient_name;
    private String gender;
    private String phone;
    private int age;
    private String address;
    private String doctor_name;
}
