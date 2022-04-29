import java.util.*;

class bronze1_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        int n = num / 10;
        int m = num % 10;
        ArrayList<Integer> morenum = new ArrayList<>();
        morenum.add(n);
        morenum.add(m);
        int result = 0;
        int a = 0;

        while(true){
            int c = (morenum.get(a) + morenum.get(a+1))%10;
            morenum.add(c);
            int outputnum = 10 * morenum.get(a+1) + c;
            a += 1;
            result += 1;
            if (num == outputnum){
                break;
            }
        }

        System.out.print(result);

    }
}

class bronze1_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 1;
        while(true){
            n += 1;
            if((n-2)*(n-1)/2 < num && num <= (n-1)*n/2){
                break;
            }
        }

        int order = num - (n-2)*(n-1)/2;

        if (n % 2 == 0){
            System.out.printf("%s/%s", n-order, order);
        } else {
            System.out.printf("%s/%s", order, n-order);
        }

    }
}

public class bronze1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        word.toUppercase();


    }
}