public class Zoo {
    public static void main(String[] args) {
        // Animal ani = new Animal();
        // 추상클래스 매커니즘도 폴리모피즘을 이용할 수 있다.
        Animal[] animals = new Animal[]{
            new Dog(),
            new Cat(),
            new Bird()
        
        };
        for(Animal x:animals){
            x.breathe();
            x.sound();
        }
    }
    
}
