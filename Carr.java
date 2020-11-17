public class Carr{
    public String maker;
    public String color="BLACK";
    public String model;
    public Carr(){} // 기본(디폴트 생성자)
    public Carr(String model,String maker) {
        this.maker = maker;
        this.model = model;
    } 
    public Carr(String maker,String color,String model){
        this.maker = maker;
        this.color = color;
        this.model = model;
    }
    // 자동차 객체 표현 양식

    public String toString() {
        return maker+","+color+","+model;
    }
    
    // 모든 차의 공통기능 - 메소드
    // 옵라이딩불가
    public final String toStart(){
        return model+"이(가) 자동차가 시동이 뿌아앙 걸립니다. 부르릉~";
    }
    //
    public void toStop(){
        System.out.println(model + "자동차가 정지합니다");
    }
}