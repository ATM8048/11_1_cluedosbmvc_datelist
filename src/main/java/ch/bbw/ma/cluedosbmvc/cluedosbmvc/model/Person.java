package ch.bbw.ma.cluedosbmvc.cluedosbmvc.model;

public class Person {
    private String Vorname;
    private String Nachname;
    private String Beruf;
    private int Alter;

    public Person(String vorname, String nachname, String beruf, int alter) {
        Vorname = vorname;
        Nachname = nachname;
        Beruf = beruf;
        Alter = alter;
    }

    public String getVorname() {
        return Vorname;
    }

    public void setVorname(String vorname) {
        Vorname = vorname;
    }

    public String getNachname() {
        return Nachname;
    }

    public void setNachname(String nachname) {
        Nachname = nachname;
    }

    public String getBeruf() {
        return Beruf;
    }

    public void setBeruf(String beruf) {
        Beruf = beruf;
    }

    public int getAlter() {
        return Alter;
    }

    public void setAlter(int alter) {
        Alter = alter;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Vorname='" + Vorname + '\'' +
                ", Nachname='" + Nachname + '\'' +
                ", Beruf='" + Beruf + '\'' +
                ", Alter=" + Alter +
                '}';
    }
}
