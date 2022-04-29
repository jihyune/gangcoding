import java.util.*;

class bronze4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = a / b;

        System.out.println(c);
    }
}

class bronze4_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a < b){
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");
            
        } else {
            System.out.println(">");
        }
    }
}

class bronze4_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 90){
            System.out.println("A");
        } else if (a >= 80) {
            System.out.println("B");

        } else if (a >= 70) {
            System.out.println("C");

        } else if (a >= 60) {
            System.out.println("D");

        } else {
            System.out.println("F");
        }
    }
}

class bronze4_4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a % 4 == 0 && a % 100 != 0){
            System.out.println(1);
        } else if (a % 400 == 0) {
            System.out.println(1);

        } else {
            System.out.println(0);
        }
    }
}


public class bronze4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>0 && b>0){
            System.out.println(1);
        } else if (a>0 && b<0) {
            System.out.println(4);

        } else if (a<0 && b>0) {
            System.out.println(3);

        } else {
            System.out.println(2);
        }
    }
}