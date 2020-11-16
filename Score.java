// 실행 클래스(Context)
public class Score{
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;
    // 기본 생성자(default constructor)

    // 클래스명과 동일한 이름의 메소드 - 생성메소드 
    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
        avg = this.total/3.0;
    }
    // 일반 메소드 ~ 다향한형태(크게 4종류) 반환값유뮤 , 매매변수유무 getters,setters
    public String toString() {
        return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg;
    }
}