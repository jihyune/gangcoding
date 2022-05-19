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
import java.util.Scanner;

public class silver5 {
//
//    static int count(String word, String x, int n) {
//        int len = word.length();
//        int cnt = 0;
//        if (word.contains(x)) {
//            word.replaceAll(x, "");
//            int c = word.length();
//            cnt += (len - c) / n;
//        }
//
//        return cnt;
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

//       int c = count(word, "dz=", 3)+count(word, "c=", 2)+count(word, "c-", 2)
//               +count(word, "d-", 2)+count(word, "lj", 2)+count(word, "nj", 2)
//               +count(word, "s=", 2)+count(word, "z=", 2);

       int len = word.length();
       int count = 0;
       word = word.replaceAll("dz=", "");
       count += (len-word.length())/3;
       len = word.length();

       word = word.replaceAll("c=", "");
       count += (len-word.length())/2;
        len = word.length();

       word = word.replaceAll("c-", "");
        count += (len-word.length())/2;
        len = word.length();

       word = word.replaceAll("d-", "");
        count += (len-word.length())/2;
        len = word.length();

       word = word.replaceAll("lj", "");
        count += (len-word.length())/2;
        len = word.length();
        System.out.println(count);

       word = word.replaceAll("nj", "");
        count += (len-word.length())/2;
        len = word.length();

       word = word.replaceAll("s=", "");
        count += (len-word.length())/2;
        len = word.length();

        word = word.replaceAll("z=", "");
        count += (len-word.length())/2;
        len = word.length();

        word = word.replaceAll("c=", "");
        count += (len-word.length())/2;

        count += word.length();

//       int sum = word.length()+c;


        System.out.println(count);

    }
}