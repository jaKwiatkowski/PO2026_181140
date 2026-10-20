public class Main {
    public static void main(String[] args) {
        Counter counter1 = new Counter(21);
        Counter counter2 = new Counter(37);
        counter1.increaseOther(counter2);
        System.out.println("counter1 value: " + counter1.value);
        System.out.println("counter2 value: " + counter2.value);

        //Metoda może zmienić obiekt utworzony poza nią,
        //dlatego że do metody przekazywana jest kopia wskaźnika adresu
        //Prowadzi ona dokładnie do tego samego obiektu
    }
}