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
}
