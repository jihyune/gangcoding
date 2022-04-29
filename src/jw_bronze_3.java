public class jw_bronze_3 {

    /* 2739
        import java.util.Scanner;

    public class bj_bronze_3_1 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            for (int i = 1; i < 10 ; i++){
                System.out.println(String.format("%d * %d = ", a,i) + (a * i));
            }
        }
    }
     */

    /* 10951
        import java.util.Scanner;

    public class bj_bronze_3_2 {
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int result = a + b;
                System.out.println(result);
            }
            sc.close();
        }
    }
     */

    /* 2741
        import java.util.Scanner;

    public class bj_bronze_3_3 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = n-1; i >= 0; i-- ){
                System.out.println(n - i);
            }
        }
    }
    */

    /* 10818
        import java.util.Scanner;
    import java.util.Arrays;

    public class bj_bronze_3_4 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.print(arr[0]+" "+arr[n-1]);
        }
    }
     */

    /* 2438
    import java.util.Scanner;

    public class bj_bronze_3_5 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            StringBuffer a = new StringBuffer();
            for (int i=0; i<n; i++){
                a.append("*");
                System.out.println(a);
            }
        }
    }
     */
}
