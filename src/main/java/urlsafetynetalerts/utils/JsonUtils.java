package urlsafetynetalerts.utils;

import com.fasterxml.jackson.databind.*;
import urlsafetynetalerts.models.*;

import java.io.*;
import java.net.*;
import java.util.*;

public class JsonUtils {
    public ObjectMapper objectMapper = new ObjectMapper();
    public JsonUtils() throws IOException {
    }
    SafetyNetAlerts safetyNetAlerts = objectMapper.readValue(
            new URL("https://s3-eu-west-1.amazonaws.com/course.oc-static.com/projects/DA+Java+EN/P5+/data.json"),
            SafetyNetAlerts.class);

    public SafetyNetAlerts jsonTojavaObject() throws IOException {

        return safetyNetAlerts;
    }

    public List<Person> getPersonsFromSafetyNetAlerts() throws IOException {

        return SafetyNetAlerts.getPersons();
    }
    public List<Firestations> getFirestationsFromSafetyNetAlerts() throws IOException {

        return SafetyNetAlerts.getFirestations();
    }

    public List<MedicalRecords> getMedicalRecordsFromSafetyNetAlerts() throws IOException {

        return SafetyNetAlerts.getMedicalrecords();
    }
}
