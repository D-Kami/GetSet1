public class Sklep {

    private String id;
    private String nazwa;
    private String miejscowosc;

    public Sklep() {}

    public Sklep(String id, String nazwa, String miejscowosc) {
        this.id = id;
        this.nazwa = nazwa;
        this.miejscowosc = miejscowosc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return "Sklep{" +
                "id='" + id + '\'' +
                ", nazwa='" + nazwa + '\'' +
                ", miejscowosc='" + miejscowosc + '\'' +
                '}';
    }
}
