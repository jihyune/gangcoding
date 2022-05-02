package gangcoding;
//import java.util.Scanner;
//public class bronze1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//    }
//}


//1152 단어의 개수//
//import java.util.Scanner;
//
//public class bronze1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String str = sc.nextLine();
//
//        Integer[] numbers = new Integer[26];
//
//        for (int j = 65; j <= 90; j++) {
//
//            int count = 0;
//
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == j || str.charAt(i) == j + 32) {
//                    count++;
//                }
//            }
//            numbers[j - 65] = count;
//        }
//
//        int max = 0;
//        char index = 0;
//        int count = 0;
//
//        for (int i = 0; i < 26; i++) {
//            if (numbers[i] > max) {
//                max = numbers[i];
//                index = (char) (i + 65);
//            }
//        }
//
//        for (int i = 0; i < 26; i++) {
//            if (numbers[i] == max) {
//                count++;
//            }
//        }
//
//        if(count == 1){
//            System.out.print(index);
//        } else {
//            System.out.print("?");
//        }
//    }
//}

//1110 더하기사이클//

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class bronze1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(n);

        while(true) {
            for (Integer num : arr) {
//                System.out.print(num);
                int num1 = num / 10;
                int num2 = num % 10;

                int sum = num1 + num2;
                int newNum = sum % 10 + num2*10;

//                System.out.print(newNum);
                if(newNum != n){
                    arr.add(newNum);
                }
            }
            System.out.println(arr);
        }
    }
}