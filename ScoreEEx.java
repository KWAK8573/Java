import java.util.*;

// score 클래스 이름 국어 영어 수학 
// 총점 으로 정렬 
// 총점이 같다면 수학성적이높은사람이 먼저나오게
// 정렬정책은 외부파일로


public class ScoreEEx {
    public static void main(String[] args) {
        
    
    List<ScoreEEEx> scoreEEExs = new ArrayList<ScoreEEEx>();
    scoreEEExs.add(new ScoreEEEx("소방차",56,51,78));
    scoreEEExs.add(new ScoreEEEx("기러기",88,44,58));
    scoreEEExs.add(new ScoreEEEx("초",55,88,68));
    scoreEEExs.add(new ScoreEEEx("갈",88,44,78));
    scoreEEExs.add(new ScoreEEEx("나무꾼",84,54,35));
    System.out.println(scoreEEExs);
    Collections.sort(scoreEEExs);
    System.out.println(scoreEEExs);


    }
}
