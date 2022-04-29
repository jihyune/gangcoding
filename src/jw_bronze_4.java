import java.util.Scanner;

public class jw_bronze_4 {

    /* 1008
    import java.util.Scanner;

    public class bj_bronze_4_1 {
        public static void main (String[] args){
            Scanner sc1 = new Scanner(System.in);
            int a = sc1.nextInt();
            int b = sc1.nextInt();
            double result = (double) a / b;
            System.out.println(result);
        }
    }
    */

    /* 1330
    import java.util.Scanner;

    public class bj_bronze_4_2 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a > b){
                System.out.print(">");
            } else if (a < b) {
                System.out.print("<");
            }
            else {
                System.out.print("==");
            }
        }
    }
    */

    /* 9498
    import java.util.Scanner;

    public class bj_bronze_4_3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if (a >= 90) {
                System.out.print("A");
            }
            else if (a >=80 && a < 90){
                System.out.print("B");
            }
            else if (a >=70 && a < 80){
                System.out.print("C");
            }
            else if (a >=60 && a < 70){
                System.out.print("D");
            }
            else {
                System.out.print("F");
            }
        }
    }
    */

    /* 2753
    import java.util.Scanner;

    public class bj_bronze_4_4 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if ((a % 4 == 0) && (a % 100 != 0)){
                System.out.print(1);
            }
            else if (a % 400 == 0){
                System.out.print(1);
            }
            else {
                System.out.print(0);
            }
        }
    }

     */


    /* 2420
    import java.util.Scanner;

    public class bj_bronze_4_5 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a >= b){
                int c = a - b;
                if (c < 0){
                    System.out.print(-c);
                }
                else {
                    System.out.print(a - b);
                }
            }
            else{
                int d = b - a;
                if (d < 0) {
                    System.out.print(-d);
                }
                else {
                    System.out.print(b - a);
                }
            }
        }
    }
     */
}
