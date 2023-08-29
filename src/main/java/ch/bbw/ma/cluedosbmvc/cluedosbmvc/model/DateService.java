package ch.bbw.ma.cluedosbmvc.cluedosbmvc.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DateService {
    private List<Person> personList = new ArrayList<>(
            Arrays.asList(
                    new Person("Martin", "Atanasov", "Informatiker", 23),
                    new Person("Vlatko", "Vasilev", "Musiker", 20),
                    new Person("Riste", "Badenbaucher", "Mechaniker", 30)));

    public List<Person> getPersonList(){return personList;}
}
