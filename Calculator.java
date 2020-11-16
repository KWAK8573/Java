public class Calculator {
    // 생성메소드를 명시적으로 코딩하지않으면  기본생성자가 생김
    // 일반 생성메소드(자)를 만들면 묵시적인 기본생성자는 없어짐.
    // 리턴값이 없는 메소드인경우 'return' 생략가능
    // 메소드 선언시 'void'를 붙여 주어야함

    boolean useStatus = false;

    void powerOn() {
        System.out.println("전원ON, 초기값 0");
        useStatus = true;
        // return; 
    }
    void powerOff(){
        System.out.println("전원OFF, 값 NULL");
        useStatus = false;
    }

    double add (double a, double b){
        if(useStatus){
            System.out.println("전원켜고 사용");
            return 0;
        }else{
        // double c = a+b;
        return a+b; //c;
        }
    }
    double sub (double a, double b){
        // double c = a+b;
        return a-b; //c;
    }
    double mul (double a, double b){
        // double c = a+b;
        return a*b; //c;
    }
    double div (double a, double b){
        // double c = a+b;
        return a/b; //c;
    }
    int sumA(int[] ints){
        int sum = 0;
        for(int x:ints) {
            sum += x;
        }
        return sum;
    }
    int sumB (int...ints){  // int 타입의 인수를 0~n개 까지 사용가능
        int sum = 0;
        for(int x:ints){
            sum += x;
        }
        return sum;
    }
    
}
