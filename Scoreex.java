public class Scoreex {
    public static void main(String[] args) {
        Score[] scores = {
            new Score("김기동", 67 , 78, 90),
            new Score("박소윤", 88, 15, 37),
            new Score("윤시네", 45, 55, 25),
            new Score("박창준", 100, 22, 44),
            new Score("편두봉", 20, 87, 99)
        };
        for(Score x:scores){
            System.out.println(x);
        }
    }
}