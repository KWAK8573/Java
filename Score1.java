// 동일한 이름의 메소드가 여러 개있는경우  ( = 메소드의 오버로딩)
// 가능하다. 가만 매개변수의 개수나 타입을달리해야한다.
public class Score1{
    // 맴버 필드에 값을 정의하지 않으면 기본값이 할당된
    String name; // name = null;
    int kor = 60; // kor = 0;
    int eng = 60;
    int math = 45;
    // 기본생성자
    Score1(){}

    Score1(String name){
        this.name = name;
    }
    Score1(String name,int kor , int eng , int math){
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    // 객체의 정보를 표현하는 메소드 
    public String toString() {
        int total = kor+eng+math;
        // 소수점 이하 2자리(100 ex)1000 = 3자리)만 사용
        double avg = (int)((total/3.0)*100)/100.0;
        return name+":"+kor+","+eng+","+math+","+total+","+avg;
    }
}