public class MustCloseMain {

    public static void main(String[] args) {
        MustClose closeable = new MustClose();
        System.out.println("활용코드 ~~~~ 진행");
        System.out.println(closeable);
        System.out.println("마지막에 닫아 주어야 한다");
        try {
            closeable.close(); // 혹 까먹을 수 있다
        } catch (Exception e) {
           
            e.printStackTrace();
        }

        // 아래와 같이 사용하면 굳이 닫지 않아도 된다.
        try(MustClose closeable2 = new MustClose()){
            System.out.println("활용코드 ~~~~ 진행");
            System.out.println(closeable2);
            System.out.println("마지막에 닫아 주어야 한다");

        }catch(Exception e){
            System.out.println("예외발생~~~~");
        }

       

        
    }
    
}
