// 정렬하는 방법추가 (객체안에 만들어넣으려면)
// 이름으로 정렬할것인가, 성적으로 정렬할것인가?
// 내림차순인가? 오름차순인가?

// 성적 합계의 내림차순으로
public class Score01 implements Comparable<Score01>{
    String name;
    int kor;
    int eng;
    public Score01(){
        super();
    }
    public Score01(String name, int kor, int eng) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
    }
    @Override
    public String toString() {
        return "Score01 [eng=" + eng + ", kor=" + kor + ", name=" + name + "]";
    }
    

    @Override
    public int compareTo(Score01 o) {
        int total = this.kor+this.eng;
        int total2 = o.kor + o.eng;
        //오름차순
        return total-total2;
        //내림차순
      //  return total2-total1;

    }

  
    
}
