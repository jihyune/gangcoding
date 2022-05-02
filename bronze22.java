package gangcoding;
import java.util.*;


// 10809번  알파벳 찾기
class bronze22_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();
        ArrayList<Character> alphabets = new ArrayList<>();
        for (int i=0; i<words.length(); i++){
            alphabets.add(words.charAt(i));
        }

        ArrayList<Integer> totalnum = new ArrayList<>();

        for (int j=97; j<=122; j++){
            int count = -1;
            for (int k=0; k< alphabets.size(); k++){
                int n = alphabets.get(k);
                if (j == n){
                    count = words.indexOf(j);
                    break;
                }

            }
            totalnum.add(count);

        }

        for (int p=0; p< totalnum.size(); p++){
            System.out.print(totalnum.get(p) + " ");
        }
    }
}

// 2675번 문자열 반복
class bronze22_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int times = sc.nextInt();


        for (int i = 0; i<times; i++){
            ArrayList<String> wordlist = new ArrayList<>();
            int num = sc.nextInt();
            String word = sc.next();

            for(int k = 0; k<word.length(); k++){
                for (int j = 0; j<num; j++){
                    System.out.print(word.charAt(k));
                }
            }
            System.out.println();

        }

    }
}

// 2908번 상수
class bronze22_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        String aa = String.valueOf(a);
        String aaa = "";
        for (int i = 2; i >= 0; i--){
            aaa += aa.charAt(i);
        }

        int reala = Integer.parseInt(aaa);

        String bb = String.valueOf(b);
        String bbb = "";
        for (int j = 2; j >= 0; j--){
            bbb += bb.charAt(j);
        }

        int realb = Integer.parseInt(bbb);

        if (realb > reala){
            System.out.println(realb);
        } else {
            System.out.println(reala);
        }

    }
}

// 5622번 다이얼
class bronze22_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String words = sc.next();
        ArrayList<Character> alphabets = new ArrayList<>();
        for (int i=0; i<words.length(); i++){
            alphabets.add(words.charAt(i));
        }
        int sum = 0;

        for (int j=0; j< alphabets.size(); j++){
            int n = alphabets.get(j);
            if (n<68){
                sum += 3;
            } else if (n<71) {
                sum += 4;
            } else if (n<74) {
                sum += 5;
            } else if (n<77) {
                sum += 6;
            } else if (n<80) {
                sum += 7;
            } else if (n<84) {
                sum += 8;
            } else if (n<87) {
                sum += 9;
            } else if (n<91) {
                sum += 10;
            }
        }

        System.out.println(sum);

    }
}

// 11721번 열개씩 끊어 출력하기
public class bronze22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        for (int i = 0; i < words.length(); ++i) {
            System.out.print(words.charAt(i));
            if (i % 10 == 9) {
                System.out.println();
            }

        }
    }
}