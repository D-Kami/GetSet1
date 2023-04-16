public class Sprzedawca {

    private String id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;

    public Sprzedawca() {}

    public Sprzedawca(String id, String imie, String nazwisko, String miejscowosc) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sprzedawca{" +
                "id='" + id + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
