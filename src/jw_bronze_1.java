import java.io.*;
import java.util.*;

//1157 단어공부
//public class jw_bronze_1 {
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        String A = a.toUpperCase();
//        int[] C = new int[26];
//        for (int i=0; i<A.length(); i++){
//            char b = A.charAt(i);
//            for (int j=65; j<=90; j++){
//                if ((int)b == j){
//                    C[j-65] += 1;
//                }
//            }
//        }
//
//        int max = C[0];
//        int maxnum = 65;
//        int count = 0;
//        for (int k=1; k<C.length; k++){
//            if (C[k]>max){
//                max = C[k];
//                maxnum = k + 65;
//                count = 0;
//            }
//            else if (C[k]==max){
//                count = 1;
//            }
//            else{
//                continue;
//            }
//        }
//
//        char M = (char)maxnum;
//
//        if (count == 1){
//            System.out.print("?");
//        }
//        else{
//            System.out.print(M);
//        }
//    }
//}

//10988 팰린드롬인지 확인하기
//public class jw_bronze_1 {
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        int count = 0;
//        for (int i=0; i<a.length(); i++){
//            if(a.charAt(i)==a.charAt(a.length()-i-1)){
//                count = 1;
//            } else {
//                count = 0;
//                break;
//            }
//        }
//        System.out.print(count);
//    }
//}

//
//1110 더하기 사이클
//public class jw_bronze_1 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int newNum = 0;
//        int count = 0;
//
//        while(newNum != n){
//            int num1;
//            int num2;
//            if (count == 0){
//                num1 = n / 10;
//                num2 = n % 10;
//
//                int sum = num1 + num2;
//                newNum = sum % 10 + num2*10;
//            }
//            else {
//                num1 = newNum / 10;
//                num2 = newNum % 10;
//
//                int sum = num1 + num2;
//                newNum = sum % 10 + num2*10;
//            }
//            count ++;
//        }
//        if (n==0){
//            System.out.print("1");
//        }else {
//            System.out.print(count);
//        }
//    }
//}

//
//    11655 ROT13
//public class jw_bronze_1 {
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        String A = "";
//        int c;
//        for (int i=0; i<a.length(); i++){
//            char b = a.charAt(i);
//            if ((int)b >=65 && (int)b <= 77){
//                 c = (int)b + 13;
//            }
//            else if ((int)b >=78 && (int)b <= 90){
//                c = (int)b - 13;
//            }
//            else if ((int)b >= 97 && (int)b <= 109 ){
//                c = (int)b + 13;
//            }
//            else if ((int)b >= 110 && (int)b <= 122){
//                c = (int)b - 13;
//            }
//            else {
//                c = (int)b;
//            }
//                A += (char)c;
//
//        }
//
//        System.out.print(A);
//
//    }
//}


//    2161 카드1 *****
public class jw_bronze_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String A = "";
        if (n==1){
            System.out.print("1");
        }
        else {
            for (int i = 1; i <= n; i++) {
                A += i;
            }
            System.out.print(A.charAt(0));
            while (A.length() > 2) {
                String c = A.substring(1,2);
                A = A.substring(2);
                A += c;
                System.out.print(" " + A.charAt(0));
            }
            System.out.print(" " +
                    A.charAt(1));
        }
    }
}

// string 이라 10이상의 수를 넣으면 한 자리만 받아오는 오류

//  2750 수 정렬하기
//public class jw_bronze_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] list = new int[n];
//        for (int i=0; i<n; i++){
//            list[i] = sc.nextInt();
//        }
//        for (int l=0; l<n-1; l++){
//            for (int j=0; j<n-l-1; j++){
//                if (list[j]>list[j+1]){
//                    int temp;
//                    temp = list[j];
//                    list[j] = list[j+1];
//                    list[j+1] = temp;
//                }
//            }
//        }
//        for (int k=0; k<n; k++){
//            System.out.println(list[k]);
//        }
//    }
//}


////  10871 x보다 작은 수
//public class jw_bronze_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        String s = "";
//        for (int i=0; i<n; i++){
//            int a = sc.nextInt();
//            if (a<k){
//                s += a;
//                s += " ";
//            }
//        }
//        String result = s.trim();
//        System.out.print(result);
//    }
//}


//1977 완전제곱수

//public class jw_bronze_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        ArrayList min = new ArrayList();
//        int sum = 0;
//        for (int i = 0; i < k; i++) {
//            if (i * i >= n && i * i <= k) {
//                sum += i * i;
//                min.add(i*i);
//            }
//        }
//        if (sum == 0) {
//            System.out.print("-1");
//        } else {
//            System.out.println(sum);
//            System.out.print(min.get(0));
//        }
//    }
//}

//
//17293 맥주 99병

//public class jw_bronze_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n>=2){
//            for (int k=n; k>=0; k--){
//                if (k>1){
//                    System.out.println(String.format("%d bottles of beer on the wall, %d bottles of beer.\n" +
//                            "Take one down and pass it around, %d bottles of beer on the wall.\n", k, k, k-1));
//                }
//                else if (k==1) {
//                    System.out.println(String.format("%d bottle of beer on the wall, %d bottle of beer.\n" +
//                            "Take one down and pass it around, no more bottle of beer on the wall.\n", k, k));
//                }
//                else {
//                    System.out.print(String.format("No more bottles of beer on the wall, no more bottles of beer.\n" +
//                            "Go to the store and buy some more, %d bottles of beer on the wall.", n));
//                }
//            }
//        }
//        else {
//            for (int k=n; k>=0; k--){
//                if (k==1) {
//                    System.out.println(String.format("%d bottle of beer on the wall, %d bottle of beer.\n" +
//                            "Take one down and pass it around, no more bottle of beer on the wall.\n", k, k));
//                }
//                else {
//                    System.out.print(String.format("No more bottle of beer on the wall, no more bottle of beer.\n" +
//                            "Go to the store and buy some more, %d bottle of beer on the wall.", n));
//                }
//            }
//        }
//
//    }
//}


