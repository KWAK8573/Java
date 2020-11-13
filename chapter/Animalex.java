package chapter;
public class Animalex {
    public static void main(String[] args) {
        // 기본생성자를 호출하여 객체 만듬
        // 매개변수가 없는 생성자 ==> 기본생성자(디폴트생성자)
        Animal a = new Animal();
        a.name = "홍길동"; a.age = 19; a.addr="부산";
        Animal b = new Animal(18,"김해","김알지", "010-000-0611");
        Animal c = new Animal(21,"대전","박팽년","010-3434-2222");
        
        System.out.printf("%s의 나이는 %d살, 주소는 %s\n",a.name,a.age,a.addr,a.tel);
       
        System.out.printf("%s의 나이는 %d살, 주소는 %s%s\n",b.name,b.age,b.addr,b.tel);
        System.out.println(c);




    }
    
}
