
public class ExceptionProc01 {

public static void main(String[] args) {
    try{
        new ExceptionProc01().test2();
    }catch(ArrayIndexOutOfBoundsException e){
        System.out.println("애얄인데ㅡ범위초과");
    }
}
    public void test() {
        
        String[] names = {"이승만","윤보선","박정희","전두환","노태우"};
        int n = names.length;
        try{
        System.out.println(names[n]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("배열범위벗어남");
        }
    
        System.out.println("수고링");
    }
    
    public void test2() throws ArrayIndexOutOfBoundsException{
        String[] names = {"이승만","윤보선","박정희","전두환","노태우"};
        int n = names.length;
        System.out.println(names[n]);
        System.out.println("수고링링");   
        
    }
    // class Animal{}
    // class Dog extends Animal{}
    // class cat extends Animal{}

    // public void test3() {
    //     Dog dog = new Dog();
    //     try{
    //     // Dog dog1 = new Animal();
    //         Animal animal = dog;
    //     }catch(Exception e){
    //         System.out.println("Class Cast Exception!");
    //     }


    }

