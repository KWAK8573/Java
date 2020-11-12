package chapter.sec02;

import javax.swing.JOptionPane;

public class ifelse {

    public static void main(String args[]){
        int score =
        Integer.parseInt(JOptionPane.showInputDialog("성적입력"));
        String grade = "";
        if (score>=90)
            grade = "A";
        else if (score>=80)
            grade = "B";
        else 
            grade = "D";
        System.out.println("당신의 성적은 "+grade+"입니다.");
        }
    }
    

