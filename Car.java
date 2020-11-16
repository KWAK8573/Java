public class Car {
    //접근제한자 private 외부클래스에 접근불가
    private int gas; // =100;
    Car() {
    gas = 100;
    }
    // getter
   public int getGas(){
        return gas;
    }
    // setter
   public void setGas(int gas) {
        this.gas += gas;
        // 비지니스 로직
        if(this.gas>200){
            this.gas = 200;
            System.out.println("경고 : 가스가 만탱크 이어서 더이상 주유할 수 없습니다.");
        }
        // this.gas = gas;
    }
    void run(int h) {
        gas -= (h*20);
        if(getGas()<0) {
            stop();
            return;
        }
        System.out.println("Gas차량이 잘 운행되고 있습니다.");

    }
    void stop() {
        System.out.println("차량운행이 멈췄습니다.");
    }

}
