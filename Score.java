public class Score{
    String name;
    int kor;
    int eng;
    int math;
    int total;
    double avg;

    public Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        total = kor+eng+math;
        avg = this.total/3.0;
    }

    public String toString() {
        return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg;
    }
}