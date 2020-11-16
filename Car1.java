// 자동차를 흉내( 모델링, 추상화)
// 용도에따라 고려할것이 달라짐 - vo클래스로 사용할 것인지
// GUI 클래스로 사용할 건지

public class Car1 {
    public String color;  //null
    public int cc; // 0
    // 접근제한자 public은 어디서근지 참조가능하게 해준다/
    // 생략하면 (default 제한자) 이 패키지
    // private 을 붙이면 이 클래스 내에서만 사용가능
    // protected 를 붙이면 이 클래스의 자손들만사용가능

    // 기본생성자 - 매개변수 무
    public Car1(){}
    // 일반 생성자 - 기본생성자 이외의 생성자
    

    public Car1(String color, int cc) {
        // 전역변수 = 지역변수(매개변수는 모두 지역변수이다)
        this.color = color;
        this.cc = cc;
    }
    

    
}
