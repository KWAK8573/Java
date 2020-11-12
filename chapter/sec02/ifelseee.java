package chapter.sec02;

import javax.swing.JOptionPane;

public class ifelseee {
    public static void main(String args[]){
        int score =
        Integer.parseInt(JOptionPane.showInputDialog("성적입력"));
        String grade = " ";
        String tail = " ";

        if (score%10>=5 && score>=60)
            tail="+";
        else if(score>=60) {
            tail = "0";
        }else{
            tail = "";
        
        }
            
    
        if  (score>=90)
            grade = "A";
        else if  (score>=80)
            grade = "B";
        else if(score>=60)
            grade = "c";
        else 
            grade = "D";
    
            System.out.println("당신의 성적은 "+grade+tail+"입니다.");
        }
    
}