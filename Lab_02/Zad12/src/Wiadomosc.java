public class Wiadomosc {
    Uzytkownik nadawca;
    String tresc;

    public Wiadomosc(Uzytkownik nadawca, String tresc) {
        this.nadawca = nadawca;
        this.tresc = tresc;
    }

    public void wyswietl() {
        System.out.println(nadawca.nazwa + ": " + tresc);
    }
}