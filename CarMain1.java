public class CarMain1{
    
    public static void main(String[] args) {
        Car myCar = new Car();
        // 현재 가스량 점섬
        System.out.println(myCar.getGas());
        // 가스 충진
        myCar.setGas(200);
        System.out.println(myCar.getGas());
        myCar.run(8);
        System.out.println(myCar.getGas());
        myCar.run(8);
      
    }
}