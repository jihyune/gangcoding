package gangcoding;

//10809 알파벳 찾기//

//import java.util.Scanner;
//
//public class bronze2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        for (int i = 0; i < 26; i++) {
//
//            int asc = 97 + i;
//            char ch = (char) asc;
//            String s = Character.toString(ch);
//
//            int num = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//
//                if (s.equals(str.substring(j, j + 1))) {
//                    num = j;
//                    break;
//                } num = -1;
//            }
//
//            System.out.print(num + " ");
//
//        }
//    }
//}

//2675 문자열 반복//

//import java.util.Scanner;
//public class bronze2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int num = sc.nextInt();
//        sc.nextLine();
//
//        for(int i = 0 ; i < num ; i++){
//            String[] array = sc.nextLine().split(" ");
//
//            int n = Integer.valueOf(array[0]);
//
//            for(int j = 0; j < array[1].length(); j++) {
//                for (int k = 0; k < n; k++) {
//                    System.out.print(array[1].substring(j, j + 1));
//                }
//            }
//            System.out.println();
//        }
//    }
//}

//2908 상수//
//so1//

//import java.util.Scanner;
//public class bronze2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Integer[] numbers = {sc.nextInt(), sc.nextInt()};
//
//        int a = numbers[0]; //734
//        int b = numbers[1];
//
//        int x = (a%10)*100 + a/100; //407
//        int c = a-(a%10)-(a/100)*100+x; //734-700-4+407
//        int y = (b%10)*100 + b/100;
//        int d = b-(b%10)-(b/100)*100+y;
//
//        if(c>d){
//            System.out.print(c);
//        } else {
//            System.out.print(d);
//        }
//
//    }
//}

//sol2//
//import java.util.Scanner;

//public class bronze2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Integer[] numbers = {sc.nextInt(), sc.nextInt()};
//
//        for(int i = 0 ; i < 2 ; i++){
//            int one = numbers[i];
//            one = one-(one%10)-(one/100)*100+(one%10)*100 + one/100;
//            numbers[i] = one;
//        }
//
//        if(numbers[0]>numbers[1]){
//            System.out.print(numbers[0]);
//        } else {
//            System.out.print(numbers[1]);
//        }
//    }
//}

//5622 다이얼//

//import java.util.Scanner;
//public class bronze2_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        int sum = 0;
//
//        for (int i = 0; i < str.length(); i++) {
//
//            char s = str.charAt(i);
//            int ch = (int) s;
//
//            int num = 0;
//
//            if (ch >= 65 && ch <= 67) {
//                num = 3;
//            } else if (ch >= 68 && ch <= 70) {
//                num = 4;
//            } else if (ch >= 71 && ch <= 73) {
//                num = 5;
//            } else if (ch >= 74 && ch <= 76) {
//                num = 6;
//            } else if (ch >= 77 && ch <= 79) {
//                num = 7;
//            } else if (ch >= 80 && ch <= 83) {
//                num = 8;
//            } else if (ch >= 84 && ch <= 86) {
//                num = 9;
//            } else if (ch >= 87 && ch <= 90) {
//                num = 10;
//            }
//            sum += num;
//        }
//        System.out.print(sum);
//    }
//}


//10870 피보나치수5//

import java.util.Scanner;

public class bronze2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int num1 = 0;
        int num2 = 1;
        int num = 0;

        if (n >= 2) {
            for (int i = 0; i < n - 1; i++) {
                num = num1 + num2;
                num1 = num2;
                num2 = num;
            }
        } else if(n == 1){
            num = 1;
        }
        System.out.print(num);
    }
}