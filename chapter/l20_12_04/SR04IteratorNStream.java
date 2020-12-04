package chapter.l20_12_04;
// 배열로 스트림 만들기

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream
// IntStream, LongStream, DoubleStream
public class SR04IteratorNStream {
    static class Member {
        String id;
        String name;
        
        public Member(String id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Member [id=" + id + ", name=" + name + "]";
        }

    public static void main(String[] args) {
        Member[] members = new Member[]{
            new Member("sy", "선예"),
            new Member("ye", "예은"),
            new Member("sh", "소희")
        };
        Stream<Member> s = Stream.of(members);
        int[] ints = new int[] {1,2,3,4,5,6,7,8,9};
        // Stream<int[]> intStream = Stream.of(ints);
        IntStream intStream = IntStream.of(ints);

        List<Member> list = Arrays.asList(members);
        Stream<Member> stream = list.stream();
        

        }
    
}
}