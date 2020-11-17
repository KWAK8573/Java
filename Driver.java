public class Driver {
    // Bus객체 , Taxi 객체 모두가 올 수 있다.
    // Polymorphism
    public void drive(Vehicle vehicle) {
        vehicle.run();
    }
    public static void main(String[] args) {
        Driver driver = new Driver();
        driver.drive(new Bus());
        driver.drive(new Taxi());
    }
}
