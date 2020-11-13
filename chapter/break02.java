package chapter;

public class break02 {
    public static void main(String[] args) {
        ytogiyo: // label
      for(char i='A';i<='Z';i++){
          for(char j='a';j<='z';j++){
              System.out.println(i+"/"+j);{
                  System.out.println(i+"/"+j);
                  if(i=='F' && j=='f'){
                      break ytogiyo;
                  }
              }
          }
      }
    
    }
}
