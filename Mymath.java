
// 클래스의 용도중 유틸리티
// 매소드의 오버로딩 - 하나의 클래스 내에 같은 이름의 메소드를 여러개 두는것
public class Mymath{
    //전형적으로 상수를 정의하는방법 (final static, 대문자)
    private final static double PI = 3.141592;
    // 원주계산 2*PI*(radius*2)
    
    // 면적을 계산하여 주는 메소드
    // 정사각형 , 원 의 면적
    public static
    double area(double widthOrRadius,boolean isCircle){ // 정사각형용 면적계산 메소드
        if (!isCircle)
            return widthOrRadius*widthOrRadius; // 정사각형
        else
            return PI * widthOrRadius*widthOrRadius; // d원
    }
    public static
    double area(double width,double height,boolean isRect) { // 직사각형 ot 삼각형
        if(isRect) // 사각형
            return width*height;
            else // 삼각형
                return width*height/2;
    }
  
    public static double power(double num,double n){
        double res = 1.0;
        for(int i=0;i<n;i++) {
            res *= num;
        }
        return res;

    }
   
}