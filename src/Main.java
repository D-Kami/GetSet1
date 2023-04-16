public class Main {
    public static void main(String[] args) {

//klasa klient
        System.out.println();
        System.out.println("Klasa Klient:");

        Klient klient = new Klient("Klient", "Kamil", "Duch", "Boleslawiec");
        System.out.println(klient.toString());

//klasa car
        System.out.println();
        System.out.println("Samochod:");

        Car car = new Car("Samochod", "Opel", "Insignia", 2012, 1999, 215222, "Diesel", "Polska", "Czarny", 30000 );
        System.out.println(car.toString());

//klasa sprzedawca
        System.out.println();
        System.out.println("Klasa Sprzedawca:");

        Sprzedawca sprzedawca = new Sprzedawca("Sprzedawca", "Jan", "Kowalski", "Wroclaw");
        System.out.println(sprzedawca.toString());

//klasa sklep
        System.out.println();
        System.out.println("Klasa Sklep:");

        Sklep sklep = new Sklep("Sklep", "Komis samochowody", "Wroclaw");
        System.out.println(sklep.toString());



    }
}