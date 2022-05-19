package gangcoding;
import java.util.*;
import java.io.*;

class silver5_answer_5 {

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = null;

            int n = Integer.parseInt(br.readLine());
            int S = 0;
            while(n-- > 0) {
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int num = 0;

                switch(str) {
                    case "add" :
                        num = Integer.parseInt(st.nextToken()) - 1;
                        S = S | (1 << num);
                        break;
                    case "remove" :
                        num = Integer.parseInt(st.nextToken()) - 1;
                        S = S & ~(1 << num);
                        break;
                    case "check" :
                        num = Integer.parseInt(st.nextToken()) - 1;
                        int temp = S & (1 << num);
                        sb.append(((temp == 0) ? 0 : 1) + "\n");
                        break;
                    case "toggle" :
                        num = Integer.parseInt(st.nextToken()) - 1 ;
                        S = S ^ (1 << num);
                        break;
                    case "all" :
                        S = (1 << 21) - 1;
                        break;
                    case "empty" :
                        S = 0;
                        break;
                }
            }
            System.out.println(sb.toString());
        }
    }
}

class silver5_answer_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] arr = new int[9];

        s = s.replace('9', '6');
        for(int i=0; i<s.length(); i++){
            int num = Character.getNumericValue(s.charAt(i));
            arr[num] ++; // array 자체에 추가가능..
        }

        int max=0;
        arr[6] = (arr[6] + 1) / 2; // 1 더해서 몫 구하면 알아서 반올림됨

        for(int i=0; i<9; i++){
            max = Math.max(max,arr[i]);
        }

        System.out.print(max);

    }
}

class silver5_answer_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum=0;

        for(int i=0; i<1000; i++) {
            for(int j=0; j<=i; j++) {
                list.add(i + 1);
            }
        }

        for(int i=a-1; i<=b-1; i++) {
            sum += list.get(i);
        }

        System.out.println(sum);

    }
}

class silver5_answer_8 {
    // 탭을 미리 전역변수로 선언
    static String recurTap = "";
    public static void recursive(int n) {
        String tap = recurTap;
        // 0이 되면 출력하고 재귀 종료
        if(n == 0) {
            System.out.println(tap + "\"재귀함수가 뭔가요?\"");
            System.out.println(tap +"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(tap + "라고 답변하였지.");
            return;
        }
        // 0이 되기 전까지는 재귀 반복
        System.out.println(tap + "\"재귀함수가 뭔가요?\"");
        System.out.println(tap + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(tap + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(tap + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");

        recurTap += "____";
        recursive(n - 1);
        System.out.println(tap + "라고 답변하였지.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursive(n);
    }
}

public class silver5_answer {
    public static void main(String[] args){

    }
}


