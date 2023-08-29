package ch.bbw.ma.cluedosbmvc.cluedosbmvc.model;

public class Room {
    private String Bezeichnung;
    private String Groesse;
    private int Anzahl_fenster;
    private int Anzahl_tuere;

    public Room(String bezeichnung, String groesse, int anzahl_fenster, int anzahl_tuere) {
        Bezeichnung = bezeichnung;
        Groesse = groesse;
        Anzahl_fenster = anzahl_fenster;
        Anzahl_tuere = anzahl_tuere;
    }

    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public String getGroesse() {
        return Groesse;
    }

    public void setGroesse(String groesse) {
        Groesse = groesse;
    }

    public int getAnzahl_fenster() {
        return Anzahl_fenster;
    }

    public void setAnzahl_fenster(int anzahl_fenster) {
        Anzahl_fenster = anzahl_fenster;
    }

    public int getAnzahl_tuere() {
        return Anzahl_tuere;
    }

    public void setAnzahl_tuere(int anzahl_tuere) {
        Anzahl_tuere = anzahl_tuere;
    }

    @Override
    public String toString() {
        return "Room{" +
                "Bezeichnung='" + Bezeichnung + '\'' +
                ", Groesse='" + Groesse + '\'' +
                ", Anzahl_fenster=" + Anzahl_fenster +
                ", Anzahl_tuere=" + Anzahl_tuere +
                '}';
    }
}
