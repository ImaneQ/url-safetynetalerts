package urlsafetynetalerts.models;

import java.util.*;

public class SafetyNetAlerts {
    static List<Person> people;
    static List<Firestations> firestations;
    static List<MedicalRecords> medicalrecords;
    public static List<Person> getPersons() {
        return people;
    }

    public void setPersons(List<Person> people) {
        SafetyNetAlerts.people = people;
    }

    public static List<Firestations> getFirestations() {
        return firestations;
    }

    public void setFirestations(List<Firestations> firestations) {
        SafetyNetAlerts.firestations = firestations;
    }

    public static List<MedicalRecords> getMedicalrecords() {
        return medicalrecords;
    }

    public void setMedicalrecords(List<MedicalRecords> medicalrecords) {
        SafetyNetAlerts.medicalrecords = medicalrecords;
    }

    @Override
    public String toString() {
        return "SafetyNetAlerts{" +
                "persons=" + people +
                ", firestations=" + firestations +
                ", medicalrecords=" + medicalrecords +
                '}';
    }
}
