import java.util.Scanner;

class Main5{
    
    // # 15596
    // https://www.acmicpc.net/problem/15596
    static long sum(int[] a){
        long result=0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(sum(arr));
    } 
    /*
    // # 4673
    // https://www.acmicpc.net/problem/4673
    public static void main(String[] args){

        boolean[] check = new boolean[10001];

        for(int i=1; i<10001; i++){
            int n = d(i);
            
            if(n < 10001){
                check[n] = true;
            }
        }
        
        StringBuilder sb = new StringBuilder();
    
        for(int i=1; i<10001; i++){
            if(!check[i]) {
                sb.append(i).append('\n');
            }
        }
        System.out.println(sb);
    }    
    static int d(int number){
        int sum = number;
    
        while(number != 0){
            sum = sum + (number % 10);
            number = number/10;
        }
        return sum;
    } */
    /* 
    // # 1065
    // https://www.acmicpc.net/problem/1065
    // https://www.acmicpc.net/board/view/25689#:~:text=%EC%96%B4%EB%96%A4%20%EC%96%91%EC%9D%98%20%EC%A0%95%EC%88%98%20X,%EA%B0%80%20%EC%9D%BC%EC%A0%95%ED%95%9C%20%EC%88%98%EC%97%B4%EC%9D%84%20%EB%A7%90%ED%95%9C%EB%8B%A4.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(arit_seq(sc.nextInt()));

        sc.close();
    }
    static int arit_seq(int num){
        int count = 0;

        if(num < 100){
            return num;
        }else{
            count = 99;
            
            for(int i=100; i <= num; i++){
                int hun = i / 100; // 백의 자릿수
                int ten = (i / 10)  % 10; // 십의 자릿수
                int one = i % 10; // 일의 자릿ㅅ

                // Also I can do (one- ten) == (ten - hun)
                if((hun - ten) == (ten - one)){
                    count++;
                }
            }
        }

        return count;
    }*/
}
    
