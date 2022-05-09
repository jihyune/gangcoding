package gangcoding;
import java.util.*;

//1110번 더하기사이클
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


// 1193번 분수찾기
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

class bronze1_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String words = word.toUpperCase();
        ArrayList<Character> alphabets = new ArrayList<>();
        for (int i=0; i<words.length(); i++){
            alphabets.add(words.charAt(i));
        }

        ArrayList<Integer> totalnum = new ArrayList<>();

        for (int j=65; j<=90; j++){
            int count = 0;
            for (int k=0; k< alphabets.size(); k++){
                int n = alphabets.get(k);
                if (j == n){
                    count += 1;
                }
            }
            totalnum.add(count);

        }

        ArrayList<Integer> sorting = (ArrayList<Integer>) totalnum.clone();
        sorting.sort(Comparator.reverseOrder());

        if(sorting.get(0).equals(sorting.get(1))){
            System.out.println("?");
        } else {
            int result = sorting.get(0);
            int index = 1;
            for (int p=0; p< totalnum.size(); p++){
                if (result == totalnum.get(p)){
                    break;
                } else {
                    index += 1;
                }
            }
            int r = index + 64;
            char answer = (char) r;
            System.out.println(answer);
        }



    }
}


// 2750번 수 정렬하기
class bronze1_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lists = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int j=0; j<lists; j++){
            int num = sc.nextInt();
            numbers.add(num);
        }
        numbers.sort(Comparator.naturalOrder());

        for (int k=0; k< numbers.size(); k++){
            System.out.println(numbers.get(k));
        }
    }
}

// 2775번 부녀회장이 될테야
class bronze1_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tries = sc.nextInt();

        for (int i=0; i<tries; i++){
            int line = sc.nextInt();
            int room = sc.nextInt();
            int[] people = new int[room];

            for (int j=1; j<=room; j++){
                people[j-1] = j;
            }

            ArrayList<int[]> array = new ArrayList<>();
            array.add(people);

            for (int k=0; k<line-1; k++){
                int[] upstair = new int[room];
                for (int p=0; p<room; p++){
                    upstair[p] = 0;
                    for (int q=0; q<=p; q++){
                        upstair[p] += array.get(k)[q];
                    }
                }
                array.add(upstair);

            }
            int result = 0;
            for (int q=0; q<room; q++){
                result += array.get(line-1)[q];
            }

            System.out.println(result);
        }
    }
}

// 11719번 그대로 출력하기 2
class bronze1_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();
        while(sc.hasNextLine()){
            result.add(sc.nextLine());
        }

        for (int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }

    }
}

// 11050번 이항 계수 1
class bronze1_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(m == 0){
            System.out.print(1);
        } else {
            int up = n;
            int down = 1;
            for (int i=1; i<m; i++){
                up *= (n-i);
            }
            for (int j=1; j<=m; j++){
                down *= (j);
            }

            System.out.print(up/down);
        }
    }
}

// 1977번 완전 제곱수
public class bronze1 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<Integer> num = new ArrayList<>();

        for (int i=1; i<=100; i++){
            for (int j=n; j<=m; j++){
                if (j == i*i){
                    num.add(j);
                }
            }
        }

        if (num.size() == 0){
            System.out.print(-1);
        } else {
            int result = 0;
            for (int k=0; k<num.size(); k++){
                result += num.get(k);
            }

            System.out.println(result);
            System.out.println(num.get(0));
        }

    }
}