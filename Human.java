public class Human {
    // 클래스에 할당(메모리 1군데) ==> 클래스변수
    public static int eyes = 2;
    // 객체에 할당(객체마다 메모리 할당) ==> 인스턴스변수
    public String name;
    
    public Human() {}
    public Human(String name){
        this.name = name;
    }
    public String toString() {
        return name + ",눈이" +eyes+"개 입니다.";
    }
    
    
}
