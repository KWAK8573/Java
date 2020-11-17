//추상 클래스는 객체를 만들 수 없다. 상속을 위해 존재한다.
// 클래스 내에  추상메소드가 1개라도 있으면 추상클래스로 선언해야 한다.
public abstract class Animal {
    // 추상 메소드
    public abstract void sound();
    // 구상 메소드(내용이 없어도 {} 만 있으면 된다)
    public void breathe(){
        System.out.println("호 흡 !");
    }
    
}
