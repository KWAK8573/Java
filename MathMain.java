public class MathMain {
    public static void main(String[] args) {
        Mymath tool = new Mymath();
        //
        System.out.println("길이가 5정사각형 면적 :"+tool.area(5, false));
        System.out.println("빈지름이 5인 원의면적 :"+tool.area(5, true));
        System.out.println("밑변이 5이고 높이가 7인 삼각형의면적:");
        System.out.println(tool.area(5, 7, false));
        //
        System.out.println("직사각형면적의 가로세로7,8:");
        System.out.println(Mymath.area(7, 8, true));
        
        // 16의 3승은
        System.out.println(Mymath.power(16, 3));
        System.out.println(Math.pow(16, 3));

        System.out.println(1); // ;int
        System.out.println("삼육구"); //String
        System.out.println(3.14); // double
    }
    
}
