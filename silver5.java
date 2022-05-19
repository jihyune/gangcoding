package gangcoding;
import java.lang.reflect.Array;
import java.util.*;

/*
class silver5_1 {
    int selfnum(int num){
        String split = "" + num;
        String[] result = split.split("");
        for (int i=0; i<result.length; i++){
            num += Integer.parseInt(result[i]);
        }
        return num;

    }


    public static void main(String[] args){
        silver5 method = new silver5();
        boolean[] numbers = new boolean[10001];

        for (int i =1; i<=10000; i++){
            if(method.selfnum(i) <= 10000){
                numbers[method.selfnum(i)] = true;
            }
        }

        for (int i=1; i<=10000; i++){
            if(numbers[i] == false){
                System.out.println(i);
            }
        }

    }
}
*/

class silver5_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        String list[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for(int i=0; i<list.length; i++){
            if(word.contains(list[i])){
                word = word.replace(list[i], "0");
            }
        }

        System.out.println(word.length());

    }
}

class silver5_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tries = sc.nextInt();

        int[][] people = new int[tries][2];

        for(int i=0; i<tries; i++){
            people[i][0] = sc.nextInt();
            people[i][1] = sc.nextInt();
        }

        for(int i=0; i<tries; i++){
            int num = 1;
            for(int j=0; j<tries; j++){
                if(i!=j){
                    if(people[i][0] < people[j][0] && people[i][1] < people[j][1]){
                        num++;
                    }
                }
            }
            System.out.println(num);
        }
    }
}
/*
class silver5_4 {
    boolean group(String wd){
        String [] split = wd.split("");
        boolean answer = true;

        for(int i=0; i< split.length-1; i++){
            ArrayList<Integer> indexs = new ArrayList<>();
            indexs.add(i);
            for(int j=i+1; j< split.length; j++){

                if(split[i].equals(split[j])){
                    indexs.add(j);
                }
            }
            if(indexs.size() >= 2){
                int result = indexs.get(indexs.size()-1) - indexs.get(0) + 1;
                if(indexs.size() != result){
                    answer = false;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        silver5 method = new silver5();

        int count = 0;

        for(int i=0; i<num; i++){
            String word = sc.next();
            if(method.group(word) == true){
                count++;
            }
        }

        System.out.print(count);

    }

}
*/

class silver5_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String k = sc.nextLine();
        int num = Integer.parseInt(k);
        ArrayList<Integer> S = new ArrayList<>();

        for(int i=0; i<num; i++){
            String cal = sc.nextLine();
            String[] all = cal.split(" ");

            if(all[0].equals("empty")){
                S.clear();
            } else if (all[0].equals("all")){
                S.clear();
                for(int j=1; j<=20; j++){
                    S.add(j);
                }

            } else if(all[0].equals("add")) {
                int x = Integer.parseInt(all[1]);
                if (S.contains(x) == false) {
                    S.add(x);
                }
            } else if(all[0].equals("remove")) {
                int y = Integer.parseInt(all[1]);
                if (S.contains(y)) {
                    S.remove(Integer.valueOf(y));
                }
            } else if(all[0].equals("check")) {
                int z = Integer.parseInt(all[1]);
                if (S.contains(z)) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else if(all[0].equals("toggle")) {
                int a = Integer.parseInt(all[1]);
                if(S.contains(a)){
                    S.remove(Integer.valueOf(a));
                } else {
                    S.add(a);
                }
            }
        }
    }
}

class silver5_6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        String[] split = num.split("");
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count7 = 0;
        int count8 = 0;
        int count69 = 0;

        for (int i=0; i< split.length; i++){
            switch (split[i]) {
                case "0":
                    count0 ++;
                    break;

                case "1":
                    count1 ++;
                    break;

                case "2":
                    count2 ++;
                    break;

                case "3":
                    count3 ++;
                    break;

                case "4":
                    count4 ++;
                    break;

                case "5":
                    count5 ++;
                    break;

                case "7":
                    count7 ++;
                    break;

                case "8":
                    count8 ++;
                    break;

                case "6":
                case "9":
                    count69 ++;
                    break;
            }

        }
        double count96 = count69 / 2.0;
        count69 = (int) Math.ceil(count96);

        int[] countarr = new int[] {count0, count1, count2, count3, count4, count5, count7, count8, count69};
        int max = countarr[0];
        for(int j=1; j<countarr.length; j++){
            if(countarr[j] > max){
                max = countarr[j];
            }
        }

        System.out.print(max);

    }
}

class silver5_7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        int a = Integer.parseInt(numbers[0]);
        int b = Integer.parseInt(numbers[1]);

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                list.add(i);
            }
        }

        int result = 0;

        for(int i=a-1; i<b; i++){
            result += list.get(i);
        }

        System.out.print(result);
    }
}

class silver5_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");

        String start = "";

        for(int i=0; i<n; i++){
            System.out.println(start + "\"재귀함수가 뭔가요?\"");
            System.out.println(start + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println(start + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println(start + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            start += "____";
        }

        System.out.println(start + "\"재귀함수가 뭔가요?\"");
        System.out.println(start + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        System.out.println(start + "라고 답변하였지.");

        for(int i=n-1; i>=0; i--){
            start = start.substring(0, 4*i);
            System.out.println(start + "라고 답변하였지.");
        }
    }
}

class silver5_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split(" ");
        int n = Integer.parseInt(b[0]);
        int c = Integer.parseInt(b[1]);

        int [][] country = new int[n][3];

        for(int i=0; i<n; i++){
            String all = sc.nextLine();
            String[] split = all.split(" ");
            int num = Integer.parseInt(split[0]);
            int [] result = new int[3];
            for(int j=1; j<=3; j++){
                result[j-1] = Integer.parseInt(split[j]);
            }
            country[num-1] = result;
        }

        int count = 1;
        for(int i=0; i<n; i++){
            if(country[c-1][0] < country[i][0]){
                count++;
            } else if (country[c-1][0] == country[i][0]) {
                if(country[c-1][1] < country[i][1]){
                    count++;
                } else if (country[c-1][1] == country[i][1]) {
                    if(country[c-1][2] < country[i][2]){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

    }
}