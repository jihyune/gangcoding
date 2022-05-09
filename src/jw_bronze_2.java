import java.util.*;
import java.io.*;

public class jw_bronze_2 {
//
//    1152 *****

//        public static void main(String[] args){
//            Scanner sc = new Scanner(System.in);
//            String n = sc.nextLine();
//            String t = n.trim();
//            String[] num = t.split(" ");
//            int a = num.length;
//            if (t.length() == 0){
//                System.out.print("0");
//            } else{
//                System.out.print(a);
//            }
//        }



//    2562 *****

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
                int max = 0;
                int num = 0;

                for (int i=1; i<arr.length; i++){
                    if (arr[i-1] >= arr[i]){
                        max = arr[i-1];
                        num = i;
                    }
                    else {
                        max = arr[i];
                        num = i+1;
                    }
            }
            System.out.println(max);
            System.out.print(num);
        }



    /* 8958
        import java.util.Scanner;

    public class bj_bronze_2_3 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            int point = 0;
            for (int i=0; i<n; i++){
                String arr = sc.nextLine();
                for (int j=0; j<arr.length(); j++){
                    String a = arr.substring(j,j+1);
                    if (a.equals("O")){
                        count ++;
                    }
                    else{
                        count = 0;
                    }
                    point += count;
                }
                System.out.println(point);
            }
        }
    }
     */

    /* 2577
        import java.util.Scanner;

    public class bj_bronze_2_4 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int mul = a*b*c;
            String num = "" + mul;
            for (int i=0; i<10; i++){
                int count = 0;
                for (int j=0; j<num.length(); j++){
                    if ((num.charAt(j)-'0')==i){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
     */

    /* 10870
        import java.util.Scanner;

    public class bj_bronze_2_6 {
        public static int fib(int n){
            if(n == 0) {
                return 0;
            }
            else if(n == 1) {
                return 1;
            }
            else {
                return fib(n-2)+fib(n-1);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            for (i = 0; i < n; i++){
            }
            System.out.print(fib(i)+" ");
        }
    }
     */

//    10808 알파벳 개수
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        int[] C = new int[26];
//        for (int i=0; i<a.length(); i++){
//            char b = a.charAt(i);
//            for (int j=97; j<=122; j++){
//                if ((int)b == j){
//                    C[j-97] += 1;
//                }
//            }
//        }
//        String str = Arrays.toString(C).replaceAll(",", "");
//        String str2 = str.substring(1,str.length()-1);
//        String A = str2.replaceAll("[^0-9]"," ");
//        System.out.print(A);
//    }


//    2743 단어 길이 재기
//    public static void main(String[] args) throws IOException{
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//
//        System.out.print(a.length());
//    }


//    2902 KMP는 왜 KMP일까?
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        String[] A = new String[a.length()];
//        for (int j = 0; j < a.length(); j++) {
//            A[j] = String.valueOf(a.charAt(j));
//        }
//        System.out.print(A[0]);
//        for (int i = 0; i < a.length(); i++) {
//            if (A[i].equals("-")) {
//                System.out.print(A[i + 1]);
//            }
//        }
//    }


//    10987 모음의 개수
//    public static void main(String[] args) throws IOException {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        String a = br.readLine();
//        String[] A = new String[a.length()];
//        for (int j = 0; j < a.length(); j++) {
//            A[j] = String.valueOf(a.charAt(j));
//        }
//
//        int count = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if (A[i].equals("a")) {
//                count++;
//            }
//            else if (A[i].equals("e")){
//                count++;
//            }
//            else if (A[i].equals("i")){
//                count++;
//            }
//            else if (A[i].equals("o")){
//                count++;
//            }
//            else if (A[i].equals("u")){
//                count++;
//            }
//            else{
//                continue;
//            }
//
//        }
//        System.out.print(count);
//    }

//    1673 치킨 쿠폰 *****
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//         while (sc.hasNextInt()){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            count = a;
//            if (a==0 && b==0) {
//                break;
//            }
//            else {
//                while (a >= b) {
//                count += (a/b);
//                a = (a/b) + (a%b);
//            }
//            System.out.println(count);
//            }
//        }
//    }
}
