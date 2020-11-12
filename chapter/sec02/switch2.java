package chapter.sec02;

import javax.swing.JOptionPane;

public class switch2 {

public static void main(String args[]){
    // 스위치로 문자열을 사용한 예(red, green, yellow)
    String signal = JOptionPane.showInputDialog("지금 신호등 불빛의 색깔?");
    String next="";
    switch(signal){
        case "red":
            next = "green";
            break;
        case "green":
            next = "Yellow";
            break;
        case "Yellow":
            next = "red";
            break;
        default:
        next = "신호 입력이 잘못됨!";
    }
    System.out.println("다음 신호는 "+next+ "입니다.");

    }
}