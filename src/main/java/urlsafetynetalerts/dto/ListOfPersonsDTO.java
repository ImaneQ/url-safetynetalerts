package urlsafetynetalerts.dto;

import urlsafetynetalerts.models.*;
import urlsafetynetalerts.utils.*;

import java.io.*;
import java.util.*;

public class ListingFromStationNumberDTO {

    private List<PersonForListingFromStationNumberDTO> persons = new ArrayList<>();
    private int nombreAdultes;
    private int nombreEnfants;

    /*
Cette url doit retourner une liste des personnes couvertes par la caserne de pompiers correspondante.
Donc, si le numéro de station = 1, elle doit renvoyer les habitants couverts par la station numéro 1.
La liste doit inclure les informations spécifiques suivantes : prénom, nom, adresse, numéro de téléphone.
De plus, elle doit fournir un décompte du nombre d'adultes et du nombre d'enfants
 (tout individu âgé de 18 ans ou moins) dans la zone desservie.

     */

    public ListingFromStationNumberDTO(String lastName, String firstName, String address, String phone, int nombreAdultes, int nombreEnfants) throws IOException {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.nombreAdultes = nombreAdultes;
        this.nombreEnfants = nombreEnfants;
    }

    public String lastName;
    public String firstName;
    public String address;
    public String phone;
    public String station;

    public ListingFromStationNumberDTO() {

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getNombreAdultes() {
        return nombreAdultes;
    }

    public void setNombreAdultes(int nombreAdultes) {
        this.nombreAdultes = nombreAdultes;
    }

    public int getNombreEnfants() {
        return nombreEnfants;
    }

    public void setNombreEnfants(int nombreEnfants) {
        this.nombreEnfants = nombreEnfants;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public static Map<String, String> getPersonsStation() {
        return personsStation;
    }

    public void setPersonsStation(Map<String, String> personsStation) {
        this.personsStation = personsStation;
    }

    JsonUtils jsonUtils = new JsonUtils();


    static Map<String, String> personsStation = new HashMap<String, String>();

    public static List<Map<String, String>> displayPersonsByStation(List<Firestations> firestations, List<Person> people, List<MedicalRecords> medicalRecords, String station) throws IOException {
        List<Map<String, String>> personsStation = new ArrayList<>();

        for (Firestations f : firestations) {

            String addressFirestation = f.getAddress();
            String numberOfStation = f.getStation();

            for (Person p : people) {

                String personsLivingAdress = p.getAddress();

                if (Objects.equals(addressFirestation, personsLivingAdress) && Objects.equals(numberOfStation, station)) {
                    int adultsInt = 0;
                    int childrenInt = 0;
                    int age = 0;
                    String adults = adultsInt + "";
                    String children = childrenInt + "";

                    Map<String, String> personDetails = Map.of("firstName", p.getFirstName(), "lastName", p.getLastName(), "address", p.getAddress(), "phone", p.getPhone(), "adults count", adults, "children count", children);

                    personsStation.add(personDetails);


                }


            }
        }
        return personsStation;
    }

    public static void getAdultsAndChildrenCountWithBirthdateInMedicalRecords(Map<String, String> personsStation, List<Firestations> firestations, List<Person> people, List<MedicalRecords> medicalRecords, String station) {
        Map<String, String> personsStation = getPersonsStation();

        int adultsInt = 0;
        int childrenInt = 0;
        int age = 0;
        String adults = adultsInt + "";
        String children = childrenInt + "";

        for (MedicalRecords m : medicalRecords) {

            if (Objects.equals(people., m.getFirstName()) && Objects.equals(p.getLastName(), m.getLastName())) {
                age = calculateAge(m.getBirthdate());
                System.out.println("age de chaque personne :" + age);
                if (age > 18) {
                    adultsInt++;
                    System.out.println(" age adulte" + age);

                    System.out.println("+ 1 adulte" + adultsInt);

                } else {
                    childrenInt++;
                    System.out.println(" age enfant" + age);

                    System.out.println("+ 1 enfant" + childrenInt);

                }
                personsStation.put("Number of Adults", adults);
                personsStation.put("Number of Children", children);
            }
            personsStation.put("Number of Adults", adults);
            personsStation.put("Number of Children", children);
        }

    }

    // --------------------------------

    public static

    ListingFromStationNumberDTO listing = new ListingFromStationNumberDTO();

    List<Firestations> firestations = Firestations.getFirestations();

    List<String> adresses = new ArrayList<>();


 for(
    Firestations firestation:firestations)

    {


        if (firestation.getStation() == stationNumber) {


            adresses.add(firestation.getAddress());

        }


    }


    List<PersonForListingFromStationNumberDTO> personsDTO = new ArrayList<>();


    List<Person> personList = PersonDao.getPersonDao();


 for(
    Person person :personList)

    {


        for (String address : adresses) {


            if (person.getAddress().equals(address)) {


                PersonForListingFromStationNumberDTO pdto = new PersonForListingFromStationNumberDTO();


                pdto.setLastname(person.getLastName());


                pdto.setName(person.getFirstName());


                personsDTO.add(pdto);


            }


        }


    }
 
 listing.setPersons(personsDTO);

 return ResponseEntity.ok().

    body(listing);

}
 // --------------------------------
    /*    int adultsInt = 0;
                    int childrenInt = 0;
                    int age = 0;
                    String adults = adultsInt + "";
                    String children = childrenInt + "";

                    for (MedicalRecords m : medicalRecords) {

                        if (Objects.equals(p.getFirstName(), m.getFirstName()) && Objects.equals(p.getLastName(), m.getLastName())) {
                            age = calculateAge(m.getBirthdate());
                            System.out.println("age de chaque personne :" + age);
                            if (age > 18) {
                                adultsInt++;
                                System.out.println(" age adulte" + age);

                                System.out.println("+ 1 adulte" + adultsInt);

                            } else {
                                childrenInt++;
                                System.out.println(" age enfant" + age);

                                System.out.println("+ 1 enfant" + childrenInt);

                            }
                            personsStation.put("Number of Adults", adults);
                            personsStation.put("Number of Children", children);
                        }
                        personsStation.put("Number of Adults", adults);
                        personsStation.put("Number of Children", children);
                    }
*/

    /* for (