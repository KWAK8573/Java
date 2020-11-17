public class Genesis extends Carr {
    public int cc;
    // 초기화 블럭
    {
        this.cc = 3500;
    }
    public Genesis() {
        super("GENESIS","Hyundai");
        // model = "GENESIS";
        // maker = "Hyundai";
    } // 기본 생성자 
    public Genesis(int cc){
         super("GENESIS","Hyundai");
        this.cc = cc;
    }
    @Override // 점검용 어노테이션
    public String toString(){
        
        return super.model +","+maker+this.color +"cc: "+cc;

    }
    @Override 
    public void toStop(){
        System.out.println(model+ "이가 끼익거리며 정지합니다");
    }
    // @Override 
    // public String toStart(){
    //     System.out.println(model+"제트기로 변함");
    // }
}
