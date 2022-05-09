package gangcoding;
//import java.util.Scanner;
//public class bronze1_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//    }
//}

//1977 완전제곱수//
//import java.util.Scanner;
//import java.util.ArrayList;
//public class bronze1_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//        int sum = 0;
//
//        ArrayList<Integer> arr = new ArrayList<>();
//
//        for(int i = 1; i < 101; i++){
//            if (i*i>=n && i*i<=m){
//                arr.add(i*i);
//                sum += i*i;
//            }
//        }
//        if (sum == 0){
//            System.out.println(-1);
//        } else {
//            System.out.println(sum);
//            System.out.println(arr.get(0));
//        }
//    }
//}


//1259 팰린드롬수//
//import java.util.Scanner;
//public class bronze1_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        while(true){
//            String num = sc.nextLine();
//            if(num.equals("0")){
//                break;
//            }
//            int l = num.length();
//            int cnt = 0;
//            for(int i = 0; i < l ; i++){
//                if(num.substring(i, i+1).equals(num.substring(l-i-1,l-i))) {
//                    cnt++;
//                }
//            }
//            if(cnt == l){
//                System.out.println("yes");
//            } else {
//                System.out.println("no");
//            }
//        }
//    }
//}


//2775 부녀회장이 될테야//
//import java.util.Scanner;
//import java.util.Arrays;
//public class bronze1_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int N = sc.nextInt();
//        for (int i = 0; i < N ; i++){
//            int k = sc.nextInt();
//            int n = sc.nextInt();
//
//            int[] floor = new int[n];
//            for (int j = 0; j < n ; j++){
//                floor[j] = j+1;
//            }
//
//            int[] newfloor = new int[n];
//
//            for(int j = 0 ; j < k ; j++){
//                for(int t = 0; t < n; t++){
//                    for(int s = 0; s <= t; s++){
//                        System.out.println(floor[s]);
//                        newfloor[t] += floor[s];
//                    }
//                }
//                System.out.println(Arrays.toString(newfloor));
//                floor = newfloor;
//            }
//            System.out.println(floor[n-1]);
//        }
//    }
//}

//1193 분수찾기//
//import java.util.Scanner;
//public class bronze1_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int cnt = 0;
//        int i = 1;
//
//        while(n>0){
//            n -= i;
//            cnt++;
//            i++;
//        }
//        int sum = cnt+1;
//        int up = 0;
//        int down = 0;
//        if(sum%2 == 1){
//            up = n+i-1;
//            down = sum-up;
//        } else{
//            down = n+i-1;
//            up = sum-down;
//        }
//
//        System.out.println(up+"/"+down);
//
//    }
//}

//11050 이항계수1//
import java.util.Scanner;
public class bronze1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int up = 1;
        int down = 1;

        for(int i = 1; i <= n; i++){
            up *= i;
        }

        for(int i = 1; i<=m ; i++){
            down *= i;
        }

        for(int i = n-m; i>=1 ; i--){
            down *= i;
        }

        int N = up/down;

        System.out.println(N);
    }
}