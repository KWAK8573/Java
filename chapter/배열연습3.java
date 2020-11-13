package chapter;

public class 배열연습3 {
    public static void main(String[] args) {
        //5명 학생성적 3과목을 처리하려면
        int[][] scores = new int[][]{
            {34,67,89},
            {45,78,88},
            {67,88,99,89},
            {90,45,89},
            {78,77,90},
        };
        String[] students = new String[]{
            "갑돌이","을순이","병진이","정숙이","무자"
        };
            //총점과 평균을내어서 학생이름을 표기한 리스트 출력
            for(int i=0;i<scores.length;i++){
                int total = 0;
                System.out.printf("%s\t",students[i]);
                for(int j=0;j<scores[i].length;j++){
                    System.out.printf("%d\t",scores[i][j]);
                    total += scores[i][j];
                }
                System.out.printf("%3d\t%6.2f\n",total,(double)total/scores[i].length);
            }
    }
    
}
