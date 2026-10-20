public class Main {
    public static void main(String[] args) {
        Uzytkownik stefan = new Uzytkownik("Stefan");
        Uzytkownik brajan = new Uzytkownik("Brajan");
        stefan.zmienStatus(true);
        brajan.zmienStatus(true);
        Konwersacja czat = new Konwersacja(stefan, brajan);
        czat.wyslijWiadomosc(stefan, "Siema Brajan");
        czat.wyslijWiadomosc(brajan, "Jak tam Stefan");
    }
}