import java.util.*;
import java.io.*;

public class Main7 {
    /*
    // # 1712
    // https://www.acmicpc.net/problem/1712
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();  
        sc.close();

        if(C <= B){
            System.out.println("-1");
        }else{
            System.out.println((A/(C-B))+1);
        }
    } */
    /* 
    // # 2292
    // https://www.acmicpc.net/problem/2292
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 1; // shortest route
        int range = 2;
        
        if(N == 1){
            System.out.println(1);
        }else{
            while(range <= N){
                range = range + (6 * count);
                count++;
            }
            System.out.println(count);
        }
    }*/
}
