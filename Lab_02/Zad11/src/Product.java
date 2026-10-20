public class Product {
    String name;
    double price;

    //konstruktor nie ma voida, konstruktor nic nie zwraca
    //nie bylo this, jest po to by odroznic pola klasy od parametrow
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void show() {
        System.out.println(name + ": " + price);
    }
}