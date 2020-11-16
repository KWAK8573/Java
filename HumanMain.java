public class HumanMain {
    public static void main(String[] args) {
        Human a = new Human("홍길동");
        Human b = new Human("갑돌이");
        // a.eyes = 3;  조심 : 이미생성된 모든객체에 영향을 준다
        System.out.println(a);
        System.out.println(b);
    }
    
}
