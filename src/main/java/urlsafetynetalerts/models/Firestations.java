package urlsafetynetalerts.models;

import java.util.*;

public class Firestations {
    public String address;
    public String station;

    public static List<Firestations> firestations;
    public static List<Firestations> getFirestations() {
        return firestations;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    @Override
    public String toString() {
        return "Firestations{" +
                "address='" + address + '\'' +
                ", station='" + station + '\'' +
                '}';
    }

}
