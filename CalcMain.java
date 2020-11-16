public class CalcMain {
    public static void main(String[] args) {
        Calculator casio = new Calculator();
        System.out.println(casio.add(100, 200));
        casio.powerOn();
        System.out.println(casio.add(100, 200));

        int[] scores = new int[] {78,99,45,67,88,33,24,99,100};
       System.out.println( casio.sumA(scores));

       int total = casio.sumB(78,99,45,67,88,33,24,99,100);
       System.out.println(total);
    }
    
}
