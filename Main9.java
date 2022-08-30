import java.io.*;
import java.util.*;

public class Main9 {
    /*
    // # 10872
    // https://www.acmicpc.net/problem/10872
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n == 0){
            return 1;
        }else{
            return (n* (factorial(n-1)));
        }
    } */
    /*
    // # 10870
    // https://www.acmicpc.net/problem/10870
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(10));
    }
    static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if( n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n-2);
    }  */
    // # 17478  *****************
    // https://www.acmicpc.net/problem/17478
    /*
    static String underbar = "";
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        // int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        sc.close();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        ans(n);
    }
    static void ans(int n){
        String tap = underbar;
        if(n == 0){
            System.out.println(tap + "\"재귀함수가 뭔가요\"");
            System.out.println(tap + "\"재귀함수는 자기 자신을 호출하는 함수라네\"");
            System.out.println(tap + "라고 답변하였지.");
            return;
        }

        System.out.println(tap + "\"재귀함수가 뭔가요\"");
        System.out.println(tap + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
        System.out.println(tap + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
        System.out.println(tap + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
        underbar+="____";
        ans(n-1);
        System.out.println(tap + "라고 답변을하였지.");    
    } */
    /*
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
		int count = Integer.parseInt(br.readLine());

		chatBot(bw, count, 0);
		
		bw.flush();
		bw.close();
	}
	
	public static void chatBot(BufferedWriter bw, int n, int count) throws IOException {
		if (count > n) return;
		
		String hyphen = "_".repeat(count * 4);
		if (count == 0) bw.write("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.\n");
		
		bw.write(hyphen + "\"재귀함수가 뭔가요?\"\n");
		
		if (count == n) {
			bw.write(hyphen + "\"재귀함수는 자기 자신을 호출하는 함수라네\"\n");
		} else {
			bw.write(hyphen + "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
			bw.write(hyphen + "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
			bw.write(hyphen + "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"\n");
		}
		
		chatBot(bw, n, count+1);
		
		bw.write(hyphen + "라고 답변하였지.\n");
	} */
    /*
    // # 2447
    // https://www.acmicpc.net/problem/2447
    static char[][] arr;
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        arr = new char[n][n];

        star(0,0,n,false);

        for(int i=0; i<n; i++){
            bw.write(arr[i]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

    static void star(int x, int y, int n, boolean blank){
        if(blank){
            for(int i=x; i<x+n; i++){
                for(int j=y; j<y+n; j++){
                    arr[i][j] = ' ';
                }
            }
            return;
        }

        // base case
        if(n == 1){
            arr[x][y] = '*';
            return;
        }

        //
        //  if n = 27 then the block size is 9
        //  if n = 9 then size is 3
        //   
        //  count = total * 
        //  

         int size = n/3;
         int cnt = 0;

         for(int i=x; i<x+n; i+=size){
            for(int j=y; j<y+n; j+=size){
                cnt++;
                if(cnt == 5){
                    star(i,j,size,true);
                }else{
                    star(i, j, size, false);
                }
            }
         }
    } */
    /*
    // # 11729 ****** Hanoi
    // The key is we are NOT actaully moving any thing here.
    // Pretend we moving something by printing. 
    // 1. 가장 큰 원판을 C 로 옮기기 위해서는 n-1 개의 원판이 A -> B
    // 2. the biggest at A -> C
    // 3. (n-1) at B -> C
    // DONE
    // https://www.acmicpc.net/problem/11729
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        sb.append((int) (Math.pow(2, n)-1)).append('\n');
        
        // stage numbers
        Hanoi(n, 1, 2, 3);
        System.out.println(sb);
    }
    static void Hanoi(int n, int start, int mid, int to){
        if (n==1){
            sb.append(start + " " + to + "\n");
            return;
        }
        // 1. n-1 from A to B
        Hanoi(n-1, start, to, mid);

        // 2. The biggest (A) from A to C
        sb.append(start + " " + to + "\n");

        // 3. n-1 from B to C
        Hanoi(n-1, mid, start, to);
    } */
}
