//9498 점수//

import java.util.Scanner;
//public class Sample {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int grade = sc.nextInt();
//
//        if (90 <= grade && grade <= 100) {
//            System.out.println("A");
//        } else if (80 <= grade && grade <= 89) {
//            System.out.println("B");
//        } else if (70 <= grade && grade <= 79) {
//            System.out.println("C");
//        } else if (60 <= grade && grade <= 69) {
//            System.out.println("D");
//        } else {
//            System.out.println("F");
//        }
//    }
//}

//2753 윤년//

//public class Sample {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int year = sc.nextInt();
//
//        if(year%4 == 0 && (year %100 != 0 || year%400==0)){
//            System.out.println("1");
//        } else {
//            System.out.println("0");
//        }
//    }
//}

//10162 전자레인지// 60점인데,,왱,,
//public class Sample{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        int sec = sc.nextInt();
//
//        int a = sec / 300;
//        int b = (sec % 300) / 60;
//        int c = ((sec % 300) % 60) / 10;
//        int d = sec % 10 ;
//
//        if ( d != 0){
//            System.out.println("-1");
//        } else {
//            System.out.println(a + " " +b+" "+c);
//        }
//    }
//}


//14681 사분면고르기

//public class Sample{
//    public static void main(String[] args){
//
//            Scanner sc = new Scanner(System.in);
//            int x = sc.nextInt();
//            int y = sc.nextInt();
//
//            if(x>0 && y>0){
//                System.out.println("1");
//            } else if (x<0 && y>0){
//                System.out.println("2");
//            } else if (x<0 && y<0) {
//                System.out.println("3");
//            } else {
//                System.out.println("4");
//            }
//    }
//}

//10797 10부제


public class bronze4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String[] cars = sc.nextLine().split(" ");

//        ArrayList<String> cars = Arrays.toString(cars);

        int count = 0;
        for(int i = 0; i < cars.length; i++){
            if (day.equals(cars[i])){
                count++;
            }
        }

        System.out.println(count);

    }
}