public class FinalStatic {
    static final double E_RADIUS = 6400;
    final static double E_SURFACE_AREA ;
    // 초기화 블럭
    static{
        E_SURFACE_AREA = 4 *Math.PI *E_RADIUS *E_RADIUS;

    }



    public static void main(String[] args) {
        System.out.println("지구의 반지름은 "+E_RADIUS+"kM 이다.");
        System.out.println("지구의 표면적은 "+E_SURFACE_AREA+" KM제곱 이다.");
    }
}