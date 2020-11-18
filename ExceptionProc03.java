// public class ExceptionProc03 {

//     public static void main(final String[] args) {
//         new ExceptionProc03().test();
//         new ExceptionProc03().test2();
//         try{
//         new ExceptionProc03().test3();
//         }catch (ArithmeticException e){
//             System.out.println(" 예외밠생3");
//         }
//     }

//     class A {
//         String name;
//     }

//     public void test() {
//         try {
//             final String data = null;
//             System.out.println(data);
//             final A a = null;
//             System.out.println(a.name);
//         } catch (final Exception e) {
//             System.out.println("예외 발생1~~~");
//         } finally {
//             System.out.println("이부분은 예외발생유무와관계없이");
//         }

//     }

//     public void test2(){
//         // 예외를 발생시킴
//         try{
//         throw new ArithmeticException();
//         } catch (Exception e){
//             System.out.println("예외발생");
//         }
//     }
//     public void test3() throws ArithmeticException {
//         // 예외를 발생시킴
//         try{
//         throw new ArithmeticException();
//         } catch (Exception e){
//             System.out.println("예외발생");

// }

//     }
// }
