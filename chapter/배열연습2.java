// package chapter;
// //동일한타입의 자료를 동일한 변수명으로
// //일렬로 인접된 힙메모리 공간에 할당


// public class 배열연습2 {
//     public static void main(String[] args) {
        
        
//         int[] scores1 = new int[3]; // 4바이트크기의 연속된 3개의 메모리를 힙영역에 할당
//                                     //이떄 초기값으로  int 타입의 기본값이 0을할당
//         scores1[0] = 100;
//         scores1[1] = 79;
//         scores1[2] = 88;
        
//         int[] scores2 = {100, 79, 88};
//         int[] scores3 = new int [] {100,79,88};

//         int[] scores4 = null; // [] 위치 상관없음
//         scores4 = new int[] {100, 79, 88};


        
//         // 합하여 평균내기
//         for (int i=0; i<scores1.length;i++){
            
//             sum += scores1[i];
//             System.out.println("합: "+sum+"평균"+sum/3.0);
//         }

//     }
// }
