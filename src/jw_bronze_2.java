public class jw_bronze_2 {

    /* 1152 *****
        import java.util.Scanner;

    public class bj_bronze_2_1 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String n = sc.nextLine();
            String t = n.trim();
            String[] num = t.split(" ");
            int a = num.length;
                System.out.print(a);
        }
    }
     */

    /* 2562 *****
        import java.util.Scanner;

    public class bj_bronze_2_2 {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
                int max = 0;
                int num = 0;

                for (int i=1; i<arr.length; i++){
                    if (arr[i-1] >= arr[i]){
                        max = arr[i-1];
                        num = i;
                    }
                    else {
                        max = arr[i];
                        num = i+1;
                    }
            }
            System.out.println(max);
            System.out.print(num);
        }
    }
     */

    /* 8958
        import java.util.Scanner;

    public class bj_bronze_2_3 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0;
            int point = 0;
            for (int i=0; i<n; i++){
                String arr = sc.nextLine();
                for (int j=0; j<arr.length(); j++){
                    String a = arr.substring(j,j+1);
                    if (a.equals("O")){
                        count ++;
                    }
                    else{
                        count = 0;
                    }
                    point += count;
                }
                System.out.println(point);
            }
        }
    }
     */

    /* 2577
        import java.util.Scanner;

    public class bj_bronze_2_4 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int mul = a*b*c;
            String num = "" + mul;
            for (int i=0; i<10; i++){
                int count = 0;
                for (int j=0; j<num.length(); j++){
                    if ((num.charAt(j)-'0')==i){
                        count++;
                    }
                }
                System.out.println(count);
            }
        }
    }
     */

    /* 10870
        import java.util.Scanner;

    public class bj_bronze_2_6 {
        public static int fib(int n){
            if(n == 0) {
                return 0;
            }
            else if(n == 1) {
                return 1;
            }
            else {
                return fib(n-2)+fib(n-1);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i = 0;
            for (i = 0; i < n; i++){
            }
            System.out.print(fib(i)+" ");
        }
    }
     */
}
