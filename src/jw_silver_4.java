import java.sql.Array;
import java.util.*;
import java.io.*;

public class jw_silver_4 {

    //10773 제로
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        List<Integer> arr = new ArrayList<Integer>();
//        int count = 0;
//
//        for (int i = 0; i < num; i ++){
//            int a = sc.nextInt();
//            if (a == 0){
//                arr.remove(count-1);
//                count --;
//            }
//            else {
//                arr.add(a);
//                count ++;
//            }
//        }
//        int sum = arr.stream().mapToInt(Integer::intValue).sum(); //리스트 원소의 합 구하는 방법
//        System.out.print(sum);
//    }


//    11866 요세푸스 문제 0

//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            Queue<Integer> q = new LinkedList<>(); //큐 선언
//            int num = sc.nextInt();
//            int d = sc.nextInt();
//
//            for (int i = 0; i < num; i++) {
//                q.add(i+1);
//            }
//
//            StringBuilder sb = new StringBuilder();
//            sb.append('<');
//
//            while(q.size() > 1){
//                for (int i = 0; i < d - 1; i ++) {
//                    int arr = q.poll(); // 맨 앞의 값 삭제 / remove -> 큐가 빈 경우 에러
//                    q.offer(arr); // 큐 맨 뒤에 값 삽입  / add -> 큐가 꽉찬 경우 에러
//                }
//                sb.append(q.poll()).append(", ");
//            }
//            sb.append(q.poll()).append('>');
//            System.out.println(sb);
//        }

//    Queue -> FIFO, index unavailable,


//    2960 에라토스테네스의 체


//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int count = 0;
//        int[] arr = new int[n-1];
//
//        for (int i = 2; i <= n; i ++){
//            arr[i-2] = i;
//        }
//
//        for (int i = 2; i <= n; i ++){
//            for (int j = i; j <= n; j += i ){
//                if (arr[j-2] > 0){
//                    count ++;
//                    if (count == k){
//                        System.out.print(arr[j-2]);
//                        break;
//                    }
//                    arr[j-2] = 0;
//                }
//                else continue;
//            }
//        }
//    }
//

//2491 수열
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] list = new int[n];
//
//        for (int i = 0; i < n; i ++){
//            int a = sc.nextInt();
//            list[i] = a;
//        }
//
//        int ascCount = 1;
//        int descCount = 1;
//        int ascMax = 1;
//        int descMax = 1;
//        int max;
//
//        for (int i = 0; i < n-1; i ++){
//            if (list[i] <= list[i+1]){
//                    ascCount ++;
//                }
//            else {
//               ascCount = 1;
//            }
//            ascMax = Math.max(ascMax, ascCount); // Math.max => 두 인자 사이 최댓값 찾기
//        }
//
//        for (int i = 0; i < n-1; i ++){
//            if (list[i] >= list[i+1]){
//                descCount ++;
//            }
//            else {
//                descCount = 1;
//            }
//            descMax = Math.max(descMax, descCount);
//        }
//
//        max = Math.max(ascMax, descMax);
//        System.out.print(max);
//    }

//    Math.random() => [0.0, 1.0) 임이의 double형 값 반환
//    Math.abs() => 절댓값 반환
//    Math.floor() => 가우스 값 반환
//    Math.ceil() => 크거나 같은 가장 작은 정수 반환
//    Math.round() => 소수점 첫째자리에서 반올림
//
//    Math.pow() => 제곱연산
//    Math.sqrt() => 제곱근연산
//
//    Math.sin() / Math.cos() / Math.tan() => 삼각함수


}
