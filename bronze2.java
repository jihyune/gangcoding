import java.util.*;
import java.io.*;


// 단어의 개수

class bronze2_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.nextLine();
        String[] results = c.split(" ");
        ArrayList<String> result = new ArrayList<>(Arrays.asList(results));
        result.remove("");
        System.out.println(result.size());
    }
}

// 빠른 A+B

class bronze2_2 {
    public static void main(String[] args) throws IOException{
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));   //할당된 버퍼에 값 넣어주기


        String s = br.readLine();
        int i = Integer.parseInt(s);
        for (int j=0; j<i; j++){
            String c = br.readLine();
            String[] result = c.split(" ");
            int k = Integer.parseInt(result[0]);
            int m = Integer.parseInt(result[1]);
            int n = k + m;

            bw.write(n+"\n");
        }
        bw.flush();
        bw.close();

    }
}

// 최댓값
class bronze2_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> results = new ArrayList<>();
        ArrayList<Integer> finals = new ArrayList<>();
        for (int i = 0; i < 9; i++){
            results.add(sc.nextInt());
        }
        finals.add(results.get(0));
        for (int j = 1; j < 9; j++){
            if (finals.get(0) < results.get(j)){
                finals.remove(0);
                finals.add(results.get(j));

            }
            else {
                continue;
            }
        }
        System.out.println(finals.get(0));
        System.out.println(results.indexOf(finals.get(0))+1);
    }
}


//숫자의 개수
public class bronze2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int m = i * j * k;
        String num = "" + m;
        for (int o = 0; o < 10; o++){
            int n = 0;
            for (int p = 0; p < num.length(); p++){
                int c = Character.getNumericValue(num.charAt(p));
                if (c == o){
                    n += 1;
                }
            }
            System.out.println(n);
        }
    }
}