//2562 최댓값//

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int max = 0;
//        int index = 0;
//        int count = 0;
//
//        for (int i = 0; i < 9; i++) {
//            int n = sc.nextInt();
//            index++;
//
//            if (n >= max) {
//                max = n;
//                count = index;
//            }
//        }
//        System.out.println(max);
//        System.out.println(count);
//    }
//}

//2577 숫자의개수//

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        String N = String.valueOf(a*b*c);
//
//        for (int j = 0 ; j < 10 ; j++) {
//            int count = 0;
//            for (int i = 0; i < N.length(); i++) {
//               if (j == Integer.parseInt(N.substring(i, i+1))){
//                   count++;
//               }
//            }
//            System.out.println(count);
//        }
//    }
//}


//1152 단어의 갯수//

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] sentence = sc.nextLine().split(" ");
//
//        if (sentence.length == 0) {
//            System.out.println(0);
//        } else {
//            if (sentence[0].equals("")) {
//                System.out.println(sentence.length - 1);
//            } else {
//                System.out.println(sentence.length);
//            }
//        }
//    }
//}

//8958 OX퀴즈//
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for (int k = 0; k < n; k++) {
//            String[] quiz = sc.nextLine().split("X");
//
//            int sum = 0;
//
//            for (int i = 0; i < quiz.length; i++) {
//                int len = quiz[i].length();
//
//                for (int j = 0; j < len; j++) {
//                    sum += j + 1;
//                }
//            }
//            System.out.println(sum);
//        }
//    }
//}

//10809 알파벳 찾기//

import java.util.Scanner;

public class bronze2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(str);

        for (int i = 0; i < 26; i++) {

            int asc = 97 + i;
            char ch = (char) asc;
            String s = Character.toString(ch);
            System.out.println(s);

            for (int j = 0; j < str.length(); j++) {
                if (s.equals(str.substring(j, j + 1))) {
                    System.out.print(j + " ");
                } else {
                    System.out.print(-1 + " ");
                }
            }

        }
    }
}