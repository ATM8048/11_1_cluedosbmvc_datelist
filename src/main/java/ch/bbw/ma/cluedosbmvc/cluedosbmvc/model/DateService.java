package ch.bbw.ma.cluedosbmvc.cluedosbmvc.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DateService {

    //Hier werden Lists erstellt:
    private List<Person> personList = new ArrayList<>(
            Arrays.asList(
                    new Person("Martin", "Atanasov", "Informatiker", 23),
                    new Person("Vlatko", "Vasilev", "Musiker", 20),
                    new Person("Riste", "Badenbaucher", "Mechaniker", 30)));

    private List<Weapon> weaponList = new ArrayList<>(
            Arrays.asList(
                    new Weapon("Dolch", "Eisen", 30),
                    new Weapon("Bogen", "Holz", 120),
                    new Weapon("Schwert", "Stahl", 90)));

    private List<Room> roomList = new ArrayList<>(
            Arrays.asList(
                new Room("Wohnzimmer", "20m²", 2, 1),
                    new Room("Schlafzimmer", "15m²", 1, 1),
                    new Room("Küche", "10m²", 1, 0)));

    //Hier werden Funktionen erstellt
    public List<Person> getPersonList(){return personList;}
    public List<Weapon> getWeaponList(){return weaponList;}
    public List<Room> getRoomList(){return roomList;}
}
