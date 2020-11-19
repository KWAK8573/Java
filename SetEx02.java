import java.util.*;


public class SetEx02 {
    class Student{
        String name;
        String addr;
        public Student(String name, String addr) {
            super();
            this.name = name;
            this.addr = addr;
        }
        
        @Override
        public String toString() {
            return "Student [addr=" + addr + ", name=" + name + "]";
        }

    }
    class Human{
        String nation;
        String name;
        public Human(String nation, String name) {
            super();
                this.nation = nation;
                this.name = name;
                }

        @Override
        public String toString() {
            return "Human [name=" + name + ", nation=" + nation + "]";
        }
        // 이름과 국적이 같다면 같은 객체로 보겠다.

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getEnclosingInstance().hashCode();
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            result = prime * result + ((nation == null) ? 0 : nation.hashCode());
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Human other = (Human) obj;
            if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            if (nation == null) {
                if (other.nation != null)
                    return false;
            } else if (!nation.equals(other.nation))
                return false;
            return true;
        }

        private SetEx02 getEnclosingInstance() {
            return SetEx02.this;
        }

   

       
    }


    public static void main(String[] args) {
        new SetEx02().test();
    }
    public void test(){
        Set<Student> set = new HashSet<>();
        Student a = new Student("홍길동", "공주");
        Student b = new Student("홍길동", "공주");
        set.add(a);
        set.add(b);
        System.out.println(set); // 중복이 안되는구조가 Set인데
        //ab 는 서로다른객체
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        // 같은 객체가 되려면 hashCode() 같고 equals() 결과가 true
        // 같은 객체로본다
        Set<Human> set2 = new HashSet<>();
        Human aa = new Human("USA", "HolyKing");
        Human bb = new Human("USA", "HolyKing");
        set2.add(aa);
        set2.add(bb);
        System.out.println(set2);
        System.out.println(aa.hashCode());
        System.out.println(bb.hashCode());
        System.out.println(aa.equals(bb));
        


    }
}
