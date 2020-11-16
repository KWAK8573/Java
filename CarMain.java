public class CarMain {
    public static void main(String[] args) {
        Car1 myCar = new Car1();
        myCar.color = "BLUE";
        myCar.cc = 1800;
        Car1 niCar = new Car1("Red",2000);
        System.out.println(myCar.color +":"+myCar.cc);
        System.out.println(niCar.color +":"+niCar.cc);

        

    }
    
}
