public class MustClose implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 잘 닫았습니다.(자원해제 완료)");

    }
    
    
}
