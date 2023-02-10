FROM openjdk:8
ADD target/PatientRegistry-reactive-0.0.1-SNAPSHOT.jar  patientregistry
ENTRYPOINT ["java","-jar","patientregistry"]