package chapter;

public class Animal {
    // 맴버필드로 전역변수
    int age;
    String addr;
    String name;
    String tel;
    //묵시적 생성메소드 (기본 생성자)
    public Animal(){}
 
        //일반생성자
        public Animal(int age,String addr, String name, String tel){
            // 매개변수에 전달되는 값은 지역변수로 전달됨
            this.age = age;
            this.addr = addr;
            this.name = name;
            this.tel = tel;
        }
        // 객체표현 방식(양식)
        // 생성자를 제외한 모든 메소드는 리턴타입을 표기해야한다.
        // 리턴값이 없는 메소드는 void 라고 표기한다.
        public String toString() {
            return "Animal[age="+age+",addr="+addr+",name="+name+",tel="+tel+"]";
        }    

}
    

	
