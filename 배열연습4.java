public class 배열연습4 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        arr[0] = "JAVA";
        arr[1] = "JAVA";
        arr[2] = new String("JAVA");
        System.out.println(arr[0] == arr[1]);
    }
}
