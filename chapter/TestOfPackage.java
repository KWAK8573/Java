package chapter;
import chapter.sec02.MethodTest;

public class TestOfPackage{


    public static void main(String[] args) {
        MethodTest.displaySijak();
        MethodTest test = new MethodTest();
        test.run();
        System.out.println(test.getDate());
    }
}