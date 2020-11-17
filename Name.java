public class Name {
    
    public String getLetter(int word){
        String word1 = word+"";
        String[] array_word;
        array_word = word1.split("");
        for(int i=0;i<array_word.length;i++) {
           
        }
        return word1;
    }
    
    public static void main(String[] args) {
        Name test = new Name();
        System.out.println(test.getLetter(12));
    }  
}