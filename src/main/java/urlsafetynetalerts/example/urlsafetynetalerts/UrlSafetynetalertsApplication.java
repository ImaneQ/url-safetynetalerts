package urlsafetynetalerts.example.urlsafetynetalerts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import urlsafetynetalerts.models.*;
import urlsafetynetalerts.utils.*;

import java.io.*;
import java.util.*;

@SpringBootApplication
public class UrlSafetynetalertsApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(UrlSafetynetalertsApplication.class, args);

        JsonUtils jsonUtils = new JsonUtils();
        List<Firestations> firestations = jsonUtils.getFirestationsFromSafetyNetAlerts();
        List<Person> people = jsonUtils.getPersonsFromSafetyNetAlerts();
        List<MedicalRecords> medicalRecords = jsonUtils.getMedicalRecordsFromSafetyNetAlerts();
        ListOfPersonsDTO listOfPersonsDTO = new ListOfPersonsDTO();

        System.out.println(jsonUtils.jsonTojavaObject());
        System.out.println(jsonUtils.getPersonsFromSafetyNetAlerts());
        System.out.println(jsonUtils.getMedicalRecordsFromSafetyNetAlerts());
        System.out.println(jsonUtils.getFirestationsFromSafetyNetAlerts());
        System.out.println(listOfPersonsDTO.displayPersonsByStation(firestations, people, medicalRecords,"2"));
        System.out.println(listOfPersonsDTO.calculateAge("03/06/1984"));
    }

}
