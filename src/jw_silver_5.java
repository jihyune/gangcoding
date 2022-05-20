import java.lang.reflect.Array;
import java.util.*;
import java.io.*;

public class jw_silver_5 {


    //    int num(int a){
//        int n = 0;
//        while (a > 0){
//            n += a % 10;
//            a = a/10;
//        }
//        return a + n;
//    }
//
//    public static void main(String[] args){
//        jw_silver_5 sample = new jw_silver_5();
//        int c = 0;
//        int k = 1;
//        while (c<=10){
//            c = sample.num(k);
//            k = c;
//            System.out.println(c);
//        }
//    }


//    1292 쉽게 푸는 문제
//    public static ArrayList jw_silver_5(int a) {
//        ArrayList arr = new ArrayList();
//        for (int i=1; i <= a; i++){
//            for (int j=1; j <= i; j++){
//                arr.add(i);
//            }
//        }
//        return arr;
//    }
//
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int e = sc.nextInt();
//        int sum1 = 0;
//        int sum2 = 0;
//        ArrayList A = jw_silver_5(e);
//        for (int i = 0; i < s-1; i++){
//            sum1 += (int)A.get(i);
//        }
//        for (int j = 0; j < e; j++){
//            sum2 += (int)A.get(j);
//        }
//        System.out.print(sum2-sum1);
//    }

//    1475 방번호

//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int[] num = new int[9];
//        for (int i=0; i < s.length(); i++){
//            switch (s.charAt(i)){
//                case '0': num[0] += 1;
//                    break;
//                case '1': num[1] += 1;
//                    break;
//                case '2': num[2] += 1;
//                    break;
//                case '3': num[3] += 1;
//                    break;
//                case '4': num[4] += 1;
//                    break;
//                case '5': num[5] += 1;
//                    break;
//                case '7': num[7] += 1;
//                    break;
//                case '8': num[8] += 1;
//                    break;
//                default: num[6] += 1;
//                    break;
//            }
//        }
//
//        if (num[6]%2==0){
//            num[6] /= 2;
//        }
//        else {
//            num[6] = (num[6]/2) + 1;
//        }
//
//        int max = 1;
//        for (int j=0; j<9; j++){
//            if (num[j]>max){
//                max = num[j];
//            }
//        }
//        if (s.length()==0){
//            System.out.print(0);
//        }
//        else {
//            System.out.print(max);
//        }
//    }

//    17478 재귀함수가 뭔가요?
//static String under = "";
//    public static void rec (int a) {
//        String line = under;
//
//        if (a == 0) {
//            System.out.println(line + "\"재귀함수가 뭔가요?\"");
//            System.out.println(line + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
//            System.out.println(line + "라고 답변하였지.");
//            return;
//        }
//
//            System.out.println(line + "\"재귀함수가 뭔가요?\"");
//            System.out.println(line + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
//            System.out.println(line + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
//            System.out.println(line + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
//            under += "____";
//            rec(a-1);
//
//        System.out.println(line + "라고 답변하였지.");
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
//        rec(s);
//    }
//

//그룹단어체커
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        String a = "";
//        int c = 0;
//
//        for (int i = 0; i <= s; i++) {
//            a = sc.nextLine();
//            int count = 0;
//                for (int j=0; j<a.length(); j++){
//                    ArrayList arr = new ArrayList();
//                    arr.add(j); //첫 문자 인덱스 저장
//                    for(int k=j+1; k<a.length(); k++){
//                        if (a.charAt(j)==a.charAt(k)){
//                            arr.add(k);
//                        }
//                    }
//                    System.out.println(arr.indexOf(arr.size()-1));
//                    System.out.println(arr.indexOf(j));
//                    System.out.println(arr.size());
//                    if (arr.indexOf(arr.size()-1)-arr.indexOf(j)+1 != arr.size()){
//                       count ++;
//                    }
//                }
//                if (count != 0){ //그룹 숫자면 카운트
//                    c++;
//                }
//            }
//        System.out.print(c);
//    }
//}

//2941번 크로아티아 알파벳

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        int count = 0;
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == 'c') {
//                if ((s.charAt(i + 1) == '=') || (s.charAt(i + 1) == '-')) {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else {
//                    count++;
//                }
//            } else if (s.charAt(i) == 'd') {
//                if (s.charAt(i + 1) == '-') {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else if ((s.charAt(i + 1) == 'z') && (s.charAt(i + 2) == '=')) {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 2);
//                } else {
//                    count++;
//                }
//            } else if (s.charAt(i) == 'l') {
//                if (s.charAt(i + 1) == 'j') {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else {
//                    count++;
//                }
//            } else if (s.charAt(i) == 'n') {
//                if (s.charAt(i + 1) == 'j') {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else {
//                    count++;
//                }
//            } else if (s.charAt(i) == 's') {
//                if (s.charAt(i + 1) == '=') {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else {
//                    count++;
//                }
//            } else if (s.charAt(i) == 'z') {
//                if (s.charAt(i + 1) == '=') {
//                    count++;
//                    s = s.substring(0,i) + s.substring(i + 1);
//                } else {
//                    count++;
//                }
//            } else {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }
//}


//7568번 덩치
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int s = sc.nextInt();
//        int a;
//        int b;
//        ArrayList arr1 = new ArrayList();
//        ArrayList arr2 = new ArrayList();
//        int[] arr3 = new int[s];
//
//        for (int i = 0; i < s; i++) {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            arr1.add(a);
//            arr2.add(b);
//        }
//    }
//
//
//    int max(ArrayList arr1, ArrayList arr2, int s){
//        for (int j = 0; j < s-1; j++) {
//            for (int k = j+1; k < s; k++){
//                if ((arr1.indexOf(j) > arr1.indexOf(k)) && (arr2.indexOf(j) > arr2.indexOf(k))){
//                    arr3[0] = j;
//                }
//                else {
//                    continue;
//                }
//            }
//        }
//        max (arr1)
//    }
//}

