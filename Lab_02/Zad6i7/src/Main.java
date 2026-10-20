public class Main {
    public static void main(String[] args) {
        //Zad6
        Person first = new Person("Lena");
        Person secound = first;
        secound.name = "Zosia";
        first.introduceYourself();
        secound.introduceYourself();

        //powstał tylko jeden obiekt Person
        //istnieją dwie referencje
        //zmiana jest widoczna przez obie referencje, ponieważ kopiujemy adres w pamięci, a nie obiekt

        //Zad7
        Person originalPerson = new Person("Anna");
        Person copiedPerson = new Person(originalPerson);
        copiedPerson.name = "Marta";
        originalPerson.introduceYourself();
        copiedPerson.introduceYourself();

        //Person secound = first;   przypisuje ten sam adres do nowej zmiennej
        //Person secound = new Person(first);   tworzy nowy obiekt
    }
}