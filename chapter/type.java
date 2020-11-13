package chapter;

public class type {
    public static void main(String[] args) {
       // String의 특수성
       String name1 = "성주원";
       String name2 = new String("성주원");
       String name3 = "성주원";
       System.out.println("name1주소: "+name1.hashCode());
       System.out.println("name2주소: "+name2.hashCode());
       System.out.println("name3주소: "+name3.hashCode());
       System.out.println(name1==name2); // false
       System.out.println(name1==name3); // true 저장된 주소가 같다

       //일반 객체의 비교
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println(obj1.hashCode());
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj2.hashCode());
        System.out.println(obj1==obj2); // false
        System.out.println(obj1.equals(obj2)); // false
        System.out.println(name1.equals(name2)); 
        
    }
    
}
