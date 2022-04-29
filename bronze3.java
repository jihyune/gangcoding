//2739 구구단//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = 1 ; i < 10 ; i++){
//            System.out.println(n+" * "+i+" = "+n*i);
//        }
//
//    }
//}


//2438 별찍기-1//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i < n+1; i++){
//            for(int j = 0 ; j < i ; j++){
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }
//    }
//}


//2439 별찍기-2//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for(int i = 1; i < n+1; i++){
//            for(int j = 0 ; j < n - i ; j++){
//                System.out.printf(" ");
//            }
//            for(int k = 0 ; k < i ; k++){
//                System.out.printf("*");
//            }
//            System.out.println("");
//        }
//    }
//}


//10818 최소,최대//


//so1//
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        sc.nextLine();
//        String[] numbers = sc.nextLine().split(" ");
//
//        int max = 0;
//        int min = 0;
//
//        for (int i = 0; i < n; i++) {
//            int count = 0;
//            for (int j = 0; j < n; j++) {
//                if (Integer.parseInt(numbers[i]) >= Integer.parseInt(numbers[j])) {
//                    count++;
//                }
//            }
//            if (count == n) {
//                max = Integer.parseInt(numbers[i]);
//            } else if (count == 1) {
//                min = Integer.parseInt(numbers[i]);
//            } continue;
//        }
//
//        System.out.println(min + " " + max);
//    }
//}

//sol2//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        sc.nextLine();
//        String[] numbers = sc.nextLine().split(" ");
//
//        int max = Integer.parseInt(numbers[0]);
//        int min = Integer.parseInt(numbers[0]);
//
//        for (int i = 0; i < n; i++) {
//            if (Integer.parseInt(numbers[i]) >= max) {
//                max = Integer.parseInt(numbers[i]);
//            }
//            if (min >= Integer.parseInt(numbers[i])) {
//                min = Integer.parseInt(numbers[i]);
//            }
//        }
//
//        System.out.println(min + " " + max);
//    }
//}

//10952 A+B-5//

import java.util.Scanner;

public class bronze3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            String[] numbers = sc.nextLine().split(" ");

            int a = Integer.parseInt(numbers[0]);
            int b = Integer.parseInt(numbers[1]);

            if(a == 0 && b==0){
                break;
            }  System.out.println(a+b);
        }
    }
}