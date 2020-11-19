public class ScoreEEEx implements Comparable<ScoreEEEx> {

    String name;
    int kor;
    int eng;
    int math;
    

    public ScoreEEEx(){
        super();
    }
    



    public ScoreEEEx(String name, int kor, int eng, int math) {
        super();
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    @Override
    public String toString() {
        
        return "Score [name=" + name + ", eng=" + eng + ", kor=" + kor + ", math= "+math+"]";

    }
    @Override
    public int compareTo(ScoreEEEx m) {
        int total1 = this.kor+this.eng+this.math;
        int total2 = m.kor+m.eng+ m.math;
       
        return total1-total2;

    }

    
}
