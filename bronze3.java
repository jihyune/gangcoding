import java.util.*;

class bronze3_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < 10; i++){
            int j = n * i;
            String results = String.format("%s * %s = %s", n, i, j);
            System.out.println(results);
        }

    }

}

class bronze3_2 {
    public static void main(String[] args) {
        for (int k = 0; k < 5; k++) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            int j = sc.nextInt();
            System.out.println(i + j);
        }
    }
}

class bronze3_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 1; j <= i; j++){
            System.out.println(j);
        }
    }
}

class bronze3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j = 0; j < i; j++){
            int m = sc.nextInt();
            numbers.add(m);

        }
        numbers.sort(Comparator.naturalOrder());
        int n = numbers.size() - 1;
        System.out.println(numbers.get(0) + " " + numbers.get(n));
    }
}

class bronze3_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int k = 0; k < i; k++){
            int m = sc.nextInt();
            if (m < j){
                numbers.add(m);
            }
        }

        for (int n = 0; n < numbers.size(); n++){
            System.out.print(numbers.get(n) + " ");
        }

    }
}

public class bronze3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        for (int j = 0; j < i; j++){
            for (int n = 0; n <= i-j-2; n++){
                System.out.print(" ");
            }

            for (int m = 0; m <= j; m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}