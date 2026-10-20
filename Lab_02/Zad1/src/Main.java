public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Kundel", 2);
        Dog dog2 = new Dog("Fuks", "Owczarek Niemiecki", 3);

        dog1.showInformation();
        dog1.bark();

        System.out.println();

        dog2.showInformation();
        dog2.bark();
    }
}