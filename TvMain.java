public class TvMain {
    public static void main(String[] args) {
        Tv mytv = new Tv();
        System.out.println(mytv);
        Tv nitv = new Tv();
        System.out.println(nitv);

        Tv[] tvs = {mytv,nitv,new Tv(),new Tv(),new Tv(),new Tv(),new Tv()};
        for(Tv x:tvs) {
            System.out.println(x);
        }
        System.out.println(Tv.maker);
    }
    
}
