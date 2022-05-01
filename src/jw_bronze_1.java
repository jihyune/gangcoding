import java.io.*;
import java.util.*;

//1157 단어공부
//class jw_bronze_1 {
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
