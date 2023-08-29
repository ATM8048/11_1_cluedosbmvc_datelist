package ch.bbw.ma.cluedosbmvc.cluedosbmvc.model;

public class Weapon {

    private String Bezeichnung;
    private String Material;
    private int Laenge;


    public Weapon(String bezeichnung, String material, int laenge) {
        Bezeichnung = bezeichnung;
        Material = material;
        Laenge = laenge;
    }


    public String getBezeichnung() {
        return Bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        Bezeichnung = bezeichnung;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String material) {
        Material = material;
    }

    public int getLaenge() {
        return Laenge;
    }

    public void setLaenge(int laenge) {
        Laenge = laenge;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "Bezeichnung='" + Bezeichnung + '\'' +
                ", Material='" + Material + '\'' +
                ", Laenge=" + Laenge +
                '}';
    }
}
