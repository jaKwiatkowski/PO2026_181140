public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("Lalka", "Ktos Napewno");
        Book book3 = new Book("Harry Potter", "J.K.Rowling", 2137);

        book1.showInformation();
        book2.showInformation();
        book3.showInformation();
    }
}