package chapter.sec02;

import javax.swing.JOptionPane;

public class switchEE {
    public static void main(String args[]){
        String score =
            JOptionPane.showInputDialog("직급입력");
            int pay = 0;
            switch(score){
            case "평사원":
                pay = 1500000;
            break;
             case "주임":
                pay = 2500000;
            break; 
            case "과장": 
                pay = 3500000;
             break;
              case "차장":
                pay = 4500000;
            break;
            default:
             pay = 0;
            }
            System.out.println("당신의 월급은"+pay+"입니다.");
    }
}
