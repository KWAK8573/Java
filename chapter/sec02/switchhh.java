package chapter.sec02;

import javax.swing.JOptionPane;

public class switchhh {
    public static void main(String args[]){
        int score =
            Integer.parseInt(JOptionPane.showInputDialog("성적입력"));
        int sw = score /10; // 정수 나누기 정수는 결과도 
        if(score<0 || score >100 ){
            sw = 11;
        }
        String grade = " ";
        switch(sw) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                grade = "F";
                break;
            case 6:
                grade = "D";
                break;
            case 7:
                grade = "c";
                break;
            case 8:
                grade = "B";
                break;
            case 9:    
            case 10:
                grade = "A";
                break;
            default:
                grade = "등급 판정불가";
        }
        System.out.println(grade);
    }
}
