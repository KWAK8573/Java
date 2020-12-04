package chapter.l20_12_04;

import java.util.Arrays;
import java.util.List;

public class SR02IteratorNStream {
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
    
    }
    public static void main(String[] args) {
        List<Member> list = Arrays.asList(
          new Member("swj", "성주원"),  
          new Member("swj", "성주원"),  
          new Member("ygs", "유관순")
        );

        list.stream().forEach(x->System.out.println(x));


    }
}
