import java.io.*;
import java.util.*;

import javax.security.sasl.SaslException;

public class Main3 {
    /*
    // # 2739
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i=1; i<=9; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
    } */
    /*
    // # 10950
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T, A, B;
        T = scan.nextInt();

        for(int i=0; i<T; i++){
            A = scan.nextInt();
            B = scan.nextInt();
            System.out.println(A+B);
        }
    }*/
    // # 8393
    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = 0;

        for(int i=1; i<=n; i++){
            a += i;
        }
        System.out.println(a);
    }*/
    /* 
    // 100만개의 데이터 정도까지는 BefferedWriter 보다 StringBuilder 가 근소하게 더 빠르다
    // 데이터의 양이 커질수록 BufferedWriter 가 더 빠르다 
    // # 15552
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        
        StringTokenizer st;

        for(int i=0; i < T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            bw.write((Integer.parseInt(st.nextToken())+ (Integer.parseInt(st.nextToken()))) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();

    }*/
    /* 
    // # 2741 2742
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++){
            System.out.println(i);
        }
        br.close();
        // bw.flush();
        // bw.close();
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i = n; i > 0; i--){
            System.out.println(i);
        }
    }*/
    /*
    // # 11021 # 11022
    // Several ways to get the output: StringBuilder, Bw, Sysout
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int a, b;
        StringTokenizer st;

        for(int i=1; i <= T; i++){
            st = new StringTokenizer(br.readLine(), " ");
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
        }
        br.close();
    }*/
    /* 
    // # 2438 2439
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // String space = "";
        // String str = "";
        // for(int i=1; i<=n; i++){
        //     st += "*";
        //     System.out.println(st);
        // }
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
    /* 
    // # 10871 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br. readLine(), " ");

        for(int i=0; i<n; i++){
            int value = Integer.parseInt(st.nextToken());

            if(value < x) sb.append(value).append(' ');
        }
        System.out.println(sb);
        
    }*/
    /*
    // # 10952 -> 0 0 # 10951 -> EOF
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;

        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            // if(a == 0 && b == 0) break;
            System.out.println(a+b);
        }
    } */ 
    /* 
    // # 1110 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        int copy = n;

        do{
            // 주어진 수의 오른쪽이자 새로운 수의 십의 자리 
            // => (n%10) * 10 
            // 곱하기 10 은 십의 자리로 만듬
            // 새로운 수(주어진 수 두개를 더한 수)
            // 새로운 수의 오른쪽이자 새로운 수의 일의 자리
            // => ((n/10) + (n%10)) % 10 
            // % 10 은 일의 자리로 만듬
            n = (n%10) * 10 + (((n/10) + (n%10)) % 10);
            // System.out.println(n);
            count++;
        }while(copy != n);

        System.out.println(count);
    }*/
}
