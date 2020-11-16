public class StaticTest {
    static int age = 60;
    static void some() {
        System.out.println("썸타지~~~");
    }
    int 연령 = 100;
    void 얼래리(){
        System.out.println("얼래리 꼴래리~~");
    }
    public static void main(String[] args) {
        System.out.println("나이:"+age);
        some();
        // 인스턴스 메소드나 인스턴스 변수를 static 메소드내에서
        // 사용하고자 한다면 , 객체를 만들어 접근할것 
        StaticTest obj = new StaticTest();
        System.out.println(obj.연령);
        obj.얼래리();
        
    }
      
}
