public class Car {

    private String id;
    private String marka;
    private String model;
    private int rok;
    private int pojemnosc;
    private int przebieg;
    private String paliwo;
    private String kraj;
    private String kolor;
    private int cena;

    public Car() {}

    public Car(String id, String marka, String model, int rok, int pojemnosc, int przebieg, String paliwo, String kraj, String kolor, int cena) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.rok = rok;
        this.pojemnosc = pojemnosc;
        this.przebieg = przebieg;
        this.paliwo = paliwo;
        this.kraj = kraj;
        this.kolor = kolor;
        this.cena = cena;
    }

    public String getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getRok() {
        return rok;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public String getPaliwo() {
        return paliwo;
    }

    public String getKraj() {
        return kraj;
    }

    public String getKolor() {
        return kolor;
    }

    public int getCena() {
        return cena;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rok=" + rok +
                ", pojemnosc=" + pojemnosc +
                ", przebieg=" + przebieg +
                ", paliwo='" + paliwo + '\'' +
                ", kraj='" + kraj + '\'' +
                ", kolor='" + kolor + '\'' +
                ", cena='" + cena + '\'' +
                '}';
    }
}
