public class Score11 {
    public static void main(String[] args) {
        Score1 myScore = new Score1("내꺼");
        Score1 niScore = new Score1();
        niScore.name = "니꺼";
        niScore.math = 47;
        Score1 x = new Score1("정여창", 45,67,89);

        System.out.println("국어점수:"+myScore.kor);
        System.out.println("국어점수:"+niScore.kor);
        System.out.println("국어점수:"+x.kor);

        System.out.println(myScore);
        System.out.println(niScore);
        System.out.println(x);
    }
}
