package gangcoding;
import java.util.*;


// 10773번 제로
class silver4_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            if(a == 0){
                int length = numbers.size();
                numbers.remove(length-1);
            } else{
                numbers.add(a);
            }
        }
        int result = 0;
        for(int i=0; i<numbers.size(); i++){
            result += numbers.get(i);
        }
        System.out.println(result);
    }
}

// 11866번 요세푸스 문제 0
class silver4_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=a; i++){
            numbers.add(i);
        }

        for(int i=0; i<a; i++){
            for(int j=0; j<b-1; j++){
                int k = numbers.get(0);
                numbers.remove(0);
                numbers.add(k);
            }
            result.add(numbers.get(0));
            numbers.remove(0);

        }
        System.out.print("<");
        for(int i=0; i< result.size()-1; i++){
            System.out.print(result.get(i) + ", ");
        }
        System.out.print(result.get(result.size()-1));
        System.out.print(">");
    }
}

//
class silver4_3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=2; i<=a; i++){
            numbers.add(i);
        }

        ArrayList<Integer> result = new ArrayList<>();

        while(numbers.size() > 0){
            for(int j=2; j<=a; j++){
                for(int i=1; i<=a/j; i++){
                    if(numbers.contains(j*i)){
                        result.add(j*i);
                        numbers.remove(Integer.valueOf(j*i));
                    }
                }
            }
        }
        System.out.println(result.get(b-1));

    }
}

// 2491번 수열
public class silver4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            numbers.add(m);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<n-1; i++){
            int count = 1;
            if(numbers.get(i) < numbers.get(i+1)){
                for(int j=i; j<n-1; j++){
                    if(numbers.get(j) <= numbers.get(j+1)){
                        count++;
                        continue;
                    } else{
                        break;
                    }
                }
                result.add(count);
            } else if (numbers.get(i) > numbers.get(i+1)) {
                for(int j=i; j<n-1; j++){
                    if(numbers.get(j) >= numbers.get(j+1)){
                        count++;
                        continue;
                    } else{
                        break;
                    }
                }
                result.add(count);
            } else if(numbers.get(i) == numbers.get(i+1)){
                for(int j=i; j<n-1; j++){
                    if(numbers.get(j) == numbers.get(j+1)){
                        count++;
                        continue;
                    } else if (numbers.get(j) < numbers.get(j+1)) {
                        for(int m=j; m<n-1; m++){
                            if(numbers.get(m) <= numbers.get(m+1)){
                                count++;
                                continue;
                            } else{
                                break;
                            }
                        }
                        break;
                    } else if (numbers.get(j) > numbers.get(j+1)) {
                        for(int m=j; m<n-1; m++){
                            if(numbers.get(m) >= numbers.get(m+1)){
                                count++;
                                continue;
                            } else{
                                break;
                            }
                        }
                        break;
                    }
                } result.add(count);
            }
        }
        result.sort(Comparator.reverseOrder());
        System.out.print(result.get(0));
    }
}