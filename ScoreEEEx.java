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
        int t1 = this.kor+this.eng+this.math;
        int t2 = m.kor+m.eng+ m.math;
        int a = 0;
        if (t1 < t2) {
            a = 1;
        } else if (t1 > t2) {
            a = -1;
        } else {
        if (this.math < m.math) {
            a = 1;

        } else {

            a = -1;
            }
        }

        return a;
        }
    }
