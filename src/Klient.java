public class Klient {

    private String id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;

    public Klient() {}

    public Klient(String id, String imie, String nazwisko, String miejscowosc) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    public String getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Klient{" +
                "id='" + id + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
