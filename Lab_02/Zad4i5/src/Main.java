public class Main {
    public static void main(String[] args) {
        //Zad4
        Car car1 = new Car("BMW", "Jakis", 2010, 50000);
        car1.drive(123.4);
        car1.showInformation();
        System.out.println();

        //Zad5
        Car original = new Car("Ford", "Focus", 2016, 3000);
        Car copy = new Car(original);
        copy.mileage = 90000;
        System.out.print("Original: ");
        original.showInformation();
        System.out.print("Copy: ");
        copy.showInformation();
    }
}