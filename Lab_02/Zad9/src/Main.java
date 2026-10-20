public class Main {
    public static void main(String[] args) {
        Car car = null;
        //spowoduje wyrzucenie NullPointerException, zmienna nie wskazuje na żaden obiekt

        if (car != null) {
            car.showInformation();
        } else {
            System.out.println("Referencja nie istnieje");
        }
    }
}