import java.util.*;

public class ListEx03 {
    // Inner class
    // vo(dto) 클래스
    class Student{
        private String no;
        private String name;
        private String phone;
    public Student() {}
            
        public String getNo() {
                    return no;
                }
            
        public void setNo(String no) {
                    this.no = no;
                }
            
        public String getName() {
                    return name;
                }
            
        public void setName(String name) {
                    this.name = name;
                }
            
        public String getPhone() {
                    return phone;
                }
            
        public void setPhone(String phone) {
                    this.phone = phone;
                }
            
            
                @Override
                public String toString() {
                        return "Student [name=" + name + ", no=" + no + ", phone=" + phone + "]";
                        }
            
    }

    public static void main(String[] args) {
        new ListEx03().test();
        
    }
    public void test(){
        List<Student> studentsList = new ArrayList<>();
        Student a = new Student();
        a.setNo("1298772");
        a.setName("민영은");
        a.setPhone("010-111-1111");
        Student b = new Student();
        b.setNo("1298772");
        b.setName("asdsa");
        b.setPhone("010-513-4541");
        studentsList.add(a);
        studentsList.add(b);
        System.out.println(studentsList); // 간이 (편)출력
        for(int i=0;i<studentsList.size();i++) {
            System.out.println(studentsList.get(i));
        }
        for(Student x:studentsList) {
            System.out.println(x);
        }

        

    }
}
