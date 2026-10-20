public class Konwersacja {
    Uzytkownik uzytkownik1;
    Uzytkownik uzytkownik2;

    public Konwersacja(Uzytkownik u1, Uzytkownik u2) {
        this.uzytkownik1 = u1;
        this.uzytkownik2 = u2;
    }

    public void wyslijWiadomosc(Uzytkownik nadawca, String tresc) {
        Wiadomosc msg = new Wiadomosc(nadawca, tresc);
        msg.wyswietl();
    }
}