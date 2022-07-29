import java.util.*;

public class Main2 {
    /* 
    // # 1330
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a,b;
        a = scan.nextInt();
        b = scan.nextInt();

        if(a>b){
            System.out.println(">");
        }else if(a<b){
            System.out.println("<");
        }else System.out.println("==");
    }*/
    /* 
    // # 9498
    public static void main(String[] args) {
        int score;
        Scanner scan = new Scanner(System.in);
        score = scan.nextInt();

        if(score >= 90){
            System.out.println("A");
        }else if(score >= 80){
            System.out.println("B");
        }else if(score >= 70){
            System.out.println("C");
        }else if(score >= 60){
            System.out.println("D");
        }else System.out.println("F");
    }*/
    /* 
    // # 2753
    public static void main(String[] args) {
        int year;
        Scanner scan = new Scanner(System.in);
        year = scan.nextInt();

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println("1");
        }else System.out.println("0");
    }*/
    /* 
    // # 14681
    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextInt();

        if(x > 0 && y > 0){
            System.out.println("1");
        }else if(x < 0 && y > 0){
            System.out.println("2");
        }else if(x < 0 && y < 0){
            System.out.println("3");
        }else System.out.println("4");
    }*/
    /* 
    // # 2884
    public static void main(String[] args) {
        int H, M;
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        M = scan.nextInt();

        if(M < 45){
            H = H - 1;
            M = M + 60 - 45; 
        }else{
            M = M - 45;
        }
        if(H == -1){
            H = 23;
        }
        
        System.out.println(H + " " +  M);
        
    }*/
    /* 
    // # 2525
    public static void main(String[] args) {
        int H, M, C;
        Scanner scan = new Scanner(System.in);
        H = scan.nextInt();
        M = scan.nextInt();
        C = scan.nextInt();
        
        M = M + C;
        while(M >= 60){
            M = M - 60;
            H = H + 1;
            if(H == 24){
                H = 0;
            }
        }

        System.out.println(H + " " + M);
    }*/
    /* 
    // # 2480
    public static void main(String[] args) {
        int a, b, c;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        if(a == b && b == c){
            System.out.println(10000 + a*1000);
        }else if(a == b || a == c){
            System.out.println(1000 + a*100);
        }else if(b == c){
            System.out.println(1000 + b*100);
        }else{
            if(a > b && a > c){
                System.out.println(a*100);
            }else if(b > a && b > c){
                System.out.println(b*100);
            }else if(c > a && c > b){
                System.out.println(c*100);
            }
        }
    }*/
}
