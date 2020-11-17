// final 예약어는 붙는 위치에 따라 의미가 조슴씩 변형
// class 앞에 붙으면 상속불가
// method 앞에 붙이면 오버라이딩(조상의 메소드내용을 자손이 바꾸는것) 불가
// 변수 앞에 붙이면 값을 한번밖에 넣지 못하고 고치지 못한다.

public final class FinalTest {
    final String name = "홍길동";
    public final void some(){
        System.out.println("some some~");
    }
    public void anyany(final int age) {
        System.out.println(age);
        // age += 1;
        System.out.println(age+1);
    }

    public static void main(String[] args) {
        FinalTest test = new FinalTest();
        // test.name = "홍길순"; 
        test.anyany(18);
    }
}

//  final 클래스는 상속 할 수 없다.
// class FinalTest2 extends FinalTest{    
// }