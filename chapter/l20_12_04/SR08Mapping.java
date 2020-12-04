package chapter.l20_12_04;

import java.util.Arrays;
import java.util.List;

public class SR08Mapping {
    // 매핑은 스트림의 중간 처리 기능으로 
    // 스트림의 요소를 다른 요소로 대체 시키는 작업 
    // 스트림에서 제공하는 메소드로
    // flatMapXXXX(), mapXXX(), asXXXstream(), boxed() 등이있음
    static int total;

    public static class Student{
        String id;
        String name;
        int score;

        public Student(String id, String name, int score) {
            this.id = id;
            this.name = name;
            this.score = score;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Student [id=" + id + ", name=" + name + ", score=" + score + "]";
        }
        
    }
    public static void main(String[] args) {
    // 빅데이터 스트링 분석 예
    List<String> list1 = Arrays.asList("청산리 벽개수야 수이감을 자랑마라","나보기가 역겨워 가실때에는");
    int cnt = 0;
    list1.stream().flatMap(str->Arrays.stream(str.split(" "))).forEach(System.out::println);

    List<String> list2 = Arrays.asList("1,2,3,4,5,6,7,8,9,10,11,12","45,56,77,34,21,78,15,88");
    list2.stream().flatMapToInt( x->{
        String[] strArr = x.split(",");
        int[] intArr = new int[strArr.length];
        for(int i = 0;i<strArr.length;i++){
            intArr[i] = Integer.parseInt(strArr[i].trim());
        }    
        return Arrays.stream(intArr);
    }).forEach(System.out::println);

    //
    List<Student> list = Arrays.asList(
        new Student("hdg", "홍길동", 89),
        new Student("kjj", "김좌진", 77),
        new Student("lsm", "이승만", 99),
        new Student("ygs", "유관순", 79)
    );
    list.stream().mapToInt(e->{
        total += e.getScore();
        return e.getScore();
    })
    .forEach(s->{System.out.println(s);});
    System.out.println("합계:"+total);
   }
    
}
