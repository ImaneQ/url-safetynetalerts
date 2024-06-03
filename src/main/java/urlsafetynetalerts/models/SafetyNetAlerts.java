package urlsafetynetalerts.models;

import java.util.*;

public class SafetyNetAlerts {
    static List<Persons> persons;
    static List<Firestations> firestations;
    static List<MedicalRecords> medicalrecords;
    public static List<Persons> getPersons() {
        return persons;
    }

    public void setPersons(List<Persons> persons) {
        SafetyNetAlerts.persons = persons;
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
                "persons=" + persons +
                ", firestations=" + firestations +
                ", medicalrecords=" + medicalrecords +
                '}';
    }
}
