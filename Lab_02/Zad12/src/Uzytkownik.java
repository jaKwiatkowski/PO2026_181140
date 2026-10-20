public class Uzytkownik {
    String nazwa;
    boolean statusOnline;

    public Uzytkownik(String nazwa) {
        this.nazwa = nazwa;
        this.statusOnline = false;
    }

    public void zmienStatus(boolean online) {
        this.statusOnline = online;
    }
}