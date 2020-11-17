public class TruckMain {
    public static void main(String[] args) {
        Truck truck = new Truck();
        // 0,1,2,3,4
        for(int i=1;i<=5;i++){
        int punkLoaction = truck.run();
        switch(punkLoaction) {
            case 1:
                System.out.println("앞/왼쪽 한국타이어로 교체");
                // 폴리모피즘
                truck.tires[0] = new HanKookTire(15,"앞왼쪽");
                break; 
            case 2:
                System.out.println("앞/왼쪽 금호타이어로 교체");
                truck.tires[1] = new KumhoTire(15,"앞오른쪽");
                break; 
            case 3:
                System.out.println("뒤/왼쪽 한국타이어로 교체");
                truck.tires[2] = new HanKookTire(14,"뒤왼쪽");
                break;
            case 4:
                System.out.println("뒤/왼쪽 금타이어로 교체");
                truck.tires[3] = new KumhoTire(17,"뒤오른쪽");
                break; 
               
        }
        System.out.println("------------------------------------");
    }
    }

}
