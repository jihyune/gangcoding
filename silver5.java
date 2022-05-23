package gangcoding;

//4673 셀프넘버//
//import java.util.ArrayList;
//public class silver5 {
//
//    static int d(int n) {
//        int sum = n;
//        while(n>=1){
//            int r = n%10;
//            sum += r;
//            n = n/10;
//        }
//        return sum;
//    }
//
//    public static void main(String[] args){
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i = 1; i <= 10000 ; i++){
//            arr.add(i);
//        }
//        int i = 0;
//        while(i<=10000){
//            i++;
//            while(arr.contains(d(i))){
//                int k = i;
//                int j = arr.indexOf(d(k));
//                arr.remove(j);
//                k=d(k);
//            }
//        }
//        for(int j = 0; j < arr.size(); j++){
//            System.out.println(arr.get(j));
//        }
//    }
//}


//7568 덩치//
//import java.util.Scanner;
//import java.util.ArrayList;
//public class silver5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        ArrayList<Integer> weight = new ArrayList<>();
//        ArrayList<Integer> height = new ArrayList<>();
//        ArrayList<Integer> rank = new ArrayList<>();
//
//        for(int i=0 ; i < n ; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            weight.add(a);
//            height.add(b);
//        }
//        for(int i=0; i<n ; i++){
//            int count = 0;
//            for(int j=0; j<n ; j++){
//                if(weight.get(i) < weight.get(j) && height.get(i) < height.get(j)){
//                    count++;
//                }
//            }
//            rank.add(count+1);
//        }
//        for(int i=0;i<n;i++){
//            System.out.print(rank.get(i)+" ");
//        }
//    }
//}


//1316 그룹 단어 체커//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class silver5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int count=0;
//        for (int i=0;i<n;i++){
//            String word = sc.nextLine();
//            int len = word.length();
//            boolean answer = true;
//            for(int j=0;j<len;j++){
//                ArrayList<Integer> arr=new ArrayList<>();
//                String x = word.substring(j,j+1);
//                for(int k=0;k<len;k++){
//                    if(x.equals(word.substring(k,k+1))){
//                        arr.add(k);
//                    }
//                }
//                int len1 = arr.size();
//                if((arr.get(len1-1)-arr.get(0))!=(len1-1)){
//                        answer = false;
//                    }
//                }
//            if(answer) {
//                count++;
//            } else{
//                break;
//            }
//        }
//    System.out.print(count);
//    }
//}

//1292 쉽게 푸는 문제//
//import java.util.Scanner;
//
//public class silver5 {
//    static int index(int n){
//        int i = 0;
//        while(n>0){
//            i++;
//            n -=i;
//        }
//        return i-1;
//    }
//    static int getSum(int n, int m){
//        int sum = 0;
//        int i = 0;
//        for(int j = 1 ;j <= n ;j++){
//            sum += j*j;
//            i += j;
//        }
//        sum += (m-i)*(n+1);
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt() -1 ;
//        int m = sc.nextInt();
//
//        System.out.println(getSum(index(m), m)-getSum(index(n), n));
//    }
//}

//1475 방번호//
//import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//public class silver5 {
//
//    static int count(int x, ArrayList<Integer> y){
//        int cnt =0;
//        for(int i=0;i<y.size();i++){
//            if(x == y.get(i)){
//                cnt++;
//            }
//        }
//        return cnt;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        ArrayList<Integer> number = new ArrayList<>();
//
//        while(n>=1){
//            number.add(n%10);
//            n /= 10;
//        }
//
//        ArrayList<Integer> newNumber = new ArrayList<>(Arrays.asList(
//                count(0, number), count(1, number), count(2, number), count(3, number),
//                count(4, number), count(5, number), count(7, number), count(8, number)));
//
//        int max=0;
//        for(int j=0;j<newNumber.size();j++){
//            if(max<=newNumber.get(j)){
//                max = newNumber.get(j);
//            }
//        }
//
//        int c = 0;
//        if((count(6, number)+count(9,number))%2 ==0){
//            c = (count(6, number)+count(9,number))/2;
//        } else{
//            c = (count(6, number)+count(9,number)+1)/2;
//        }
//
//        if(c>=max){
//            max = c;
//        }
//        System.out.println(max);
//
//    }
//}

//2941 크로아티아 알파벳//
//import java.util.Scanner;
//
//public class silver5 {
//
////    static int count(String x, String y) {
////        int cnt =0;
////        if (x.equals(y)) {
////            cnt++;
////        }
////
////        return cnt;
////    }
//
//    static String replace(String word, String s){
//        word = word.replaceAll(s, "11");
//        return word;
//    }
//
//    static Integer count(int c, String word) {
//        for (int i = 0; i < word.length(); i++) {
//            if (word.substring(i, i + 1).equals("1")) {
//                c++;
//            }
//            c /= 2;
//        }
//        return c;
//    }
//
//
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//
//
//       int cnt = 0;
//       word = word.replaceAll("dz=", "111");
//        for (int i = 0; i < word.length(); i++) {
//            if (word.substring(i, i + 1).equals("1")) {
//                cnt++;
//            }
//            cnt /= 3;
//        }
//
//       replace(word, "c=");
//       count(cnt, word);
//       replace(word, "c-");
//       count(cnt, word);
//       replace(word, "lj");
//       count(cnt, word);
//            System.out.println(word);
//
////        replace(cnt, word, "c-");
////        replace(cnt, word, "d-");
////        replace(cnt, word, "lj");
////        System.out.println(word);
////        replace(cnt, word, "nj");
////        replace(cnt, word, "s=");
////        replace(cnt, word, "z=");
////        replace(cnt, word, "c=");
//
//        word.replace("1", "");
//
//        cnt = cnt+word.length();
//
////       word = word.replaceAll("c=", "11");
////        for(int i=0;i<len;i++){
////            count("1", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////       word = word.replaceAll("c-", "22");
////        for(int i=0;i<len;i++){
////            count("2", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////       word = word.replaceAll("d-", "33");
////        for(int i=0;i<len;i++){
////            count("3", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////       word = word.replaceAll("lj", "44");
////        for(int i=0;i<len;i++){
////            count("4", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////       word = word.replaceAll("nj", "55");
////        for(int i=0;i<len;i++){
////            count("5", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////       word = word.replaceAll("s=", "66");
////        for(int i=0;i<len;i++){
////            count("6", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////        word = word.replaceAll("z=", "77");
////        for(int i=0;i<len;i++){
////            count("7", word.substring(i,i+1));
////        }
////        cnt /= 2;
////
////        word = word.replaceAll("c=", "88");
////        for(int i=0;i<len;i++){
////            count("8", word.substring(i,i+1));
////        }
////        cnt /= 2;
//
//
//
//        System.out.println(cnt);
//
//
//    }
//}


//8979 올림픽//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//
//public class silver5 {
//
//    static Integer getResult(String result, int i){
//        int x = Integer.parseInt(result.substring(i,i+1));
//        return x;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        sc.nextLine();
//
//        ArrayList<Integer> gold = new ArrayList<>();
//        ArrayList<Integer> silver = new ArrayList<>();
//        ArrayList<Integer> bronze = new ArrayList<>();
//        ArrayList<Integer> getNation = new ArrayList<>();
//
//        for(int i = 0; i < n; i++){
//            String result = sc.nextLine();
//
//            getNation.add(getResult(result, 0));
//            gold.add(getResult(result, 2));
//            silver.add(getResult(result, 4));
//            bronze.add(getResult(result, 6));
//        }
//
////        System.out.println(gold);
////        System.out.println(silver);
////        System.out.println(bronze);
//
//
//        for ( int i = 0 ; i < n ; i++){
//            if(getNation.get(i) == m){
//                m = i;
//            }
//        }
//         int count = 1;
//         for(int i = 0 ; i < n ; i++){
//
//             if(gold.get(i) > gold.get(m)){
//                 count++;
//             } else if(gold.get(i) == gold.get(m)){
//                 if(silver.get(i) > silver.get(m)){
//                     count++;
//                 } else if(silver.get(i) == silver.get(m)){
//                     if(bronze.get(i) > bronze.get(m)){
//                         count++;
//                     }
//                 }
//             }
//         }
//
//         System.out.println(count);
//
//    }
//}

//11723 집합//
//import java.util.HashSet;
//import java.io.*;
//
//
//public class silver5 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//
//        HashSet<Integer> S = new HashSet<>();
//        HashSet<Integer> S0 = new HashSet<>();
//
//        for(int i = 0; i < n ; i++){
//            String cmd = br.readLine();
//            String[] command = cmd.split(" ");
//            int x = Integer.parseInt(command[1]);
//
//            if(cmd.contains("add")){
//                S.add(x);
//            } else if(cmd.contains("check")){
//                if(S.contains(x)){
//                    bw.write("1");
//                } else{
//                    bw.write("0");
//                }
//            } else if(cmd.contains("remove")){
//                if(S.contains(x)){
//                    S.remove(x);
//                }
//            } else if(cmd.contains("toggle")){
//                if(S.contains(x)){
//                    S.remove(x);
//                } else {
//                    S.add(x);
//                }
//            } else if(cmd.contains("all")){
//                for(int j = 1; j <= 20; j++){
//                    S.add(j);
//                }
//            } else if(cmd.contains("empty")){
//                S = S0;
//            }
//            bw.newLine();
//        }
//        bw.close();
//    }
//}

//17478 재귀함수//
import java.util.HashSet;
import java.io.*;


public class silver5 {

    static String wornl(){
        String a = "\"재귀함수가 뭔가요?\"\n" +
                "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n" +
                "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n" +
                "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";

        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String a = "어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.";

        }
    }
}



