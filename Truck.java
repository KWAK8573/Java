public class Truck {
    Tire[] tires = new Tire[] {
        new Tire(6,"FL"),
        new Tire(2, "FR"),
        new Tire(3,"BL"),
        new Tire(4, "BR")
    };
    public int run(){
        System.out.println("트럭이 달립니다.");
        for(int i=0;i<tires.length;i++) {
            if(tires[i].roll() == false) {
                stop();
                return i+1;
            }
        }
        return 0;
    }
    public void stop() {
        System.out.println(" 트럭 멈춤");
    }
}
