package chapter.l20_12_04;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import chapter.l20_12_04.SR05PipelinesOP.Member.Gender;

public class SR05PipelinesOP {
    static class Member{
        public enum Gender{MALE,FEMALE}
        private String name;
        private Gender gender;
        private int score;

        public Member(String name, Gender gender, int score) {
            super();
            this.name = name;
            this.gender = gender;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Gender getGender() {
            return gender;
        }

        public void setGender(Gender gender) {
            this.gender = gender;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "Member [gender=" + gender + ", name=" + name + ", score=" + score + "]";
        }
        

    }
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
            new Member("홍길동", Member.Gender.MALE, 75),
            new Member("유관순", Member.Gender.FEMALE, 88),
            new Member("계월향", Member.Gender.FEMALE, 23)
        );

        Stream<Member> allStream = list.stream();
        Stream<Member> femaleStream = allStream.filter(m->m.getGender()== Member.Gender.FEMALE);
        // 
        list.stream().filter(m->m.getGender()== Member.Gender.FEMALE).forEach(x->System.out.println(x));

        // 여자의 성적
        IntStream scoreStream = femaleStream.mapToInt(Member::getScore);
        OptionalDouble optionalDouble = scoreStream.average();
        double scoreAvg = optionalDouble.getAsDouble();
        System.out.println("여자평균"+scoreAvg+"점");

        System.out.println("여자평균: "+ list.stream().filter(m->m.getGender()== Member.Gender.FEMALE).mapToInt(Member::getScore).average().getAsDouble()
        +"점점");


        
    }
}
