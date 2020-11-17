public class CarMainn {
    public static void main(String[] args) {
        Genesis myCar = new Genesis();
        System.out.println("MyCar cc: "+myCar.cc);
        Genesis yourCar = new Genesis(4000);
        System.out.println("YourCar cc: "+yourCar.cc);
        //
        System.out.println(myCar);
        System.out.println(yourCar);
        // 시동걸기
        System.out.println(myCar.toStart());
        System.out.println(yourCar.toStart());
        // 정기시키기
        myCar.toStop();
        yourCar.toStop();
        // 선언은 조상클래스 객체생성은 자손클래스 할 때
        Genesis car1 = new Genesis(); // 일반적
        Carr car2 = new Genesis(); // 상위클래스 하위객체 생성 - 이유 - 폴리모피즘
        Carr car3 = new Carr();
        car3.model = "소나타 ";
        // 오버라이딩된 메소드는 자손것이 수행됨
        car2.toStop();
        car1.toStop();
        car3.toStop();




    }
    
}
