import java.io.*;
import java.util.*;

public class Main6 {
    /*
    // # 11654
    // https://www.acmicpc.net/problem/11654
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int ascii = a.charAt(0);
        System.out.println(ascii);
    } */
    /*
    // Using System.in NOT Scanner
    // System.in reads by byte
    // Way faster than Scanner *****
    public static void main(String[] args) throws Exception {
 
		int a = System.in.read();
		System.out.print(a);
 
	} */
    /*
    // # 11720
    // https://www.acmicpc.net/problem/11720
    public static void main(String[] args) throws IOException{
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int result = 0;
        // int n = Integer.parseInt(br.readLine());
        // // This doenst work without space I guess
        // StringTokenizer st = new StringTokenizer(br.readLine(), "");
        // while(st.hasMoreTokens()){
        //     result += Integer.parseInt(st.nextToken());
        // }
        // System.out.println(result); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;
        br.readLine(); // No need because I will add all elements

        // getBytes() converts a String to byte 
        // Therefore, the String that have read is converted to byte[]
        // Now I can use for-each loop to read one by one
        for(byte val : br.readLine().getBytes()){
            result += (val - '0');
        }
        System.out.println(result);
    } */
    /*
    // # 10809
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Or 
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String S = br.readLine();

        String S = sc.nextLine(); // or next()
        
        char[] arr = {  'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 
                        'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
                        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 
                        'y', 'z'};
        int[] result = new int[26];

        for(int i=0; i<result.length; i++){
            result[i] = -1;
        }
        
        // My algorithm 
        // It compares the given String to all of the letters
        // If it matches, updates result[] with the index where they match
        // For instance, the letter 'e' in "baekjoon," it is 5th letter (0,1,2,3,4)
        // But 3rd letter in the given String (0,1,2) 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j < S.length(); j++){
                if(arr[i] == S.charAt(j)){
                    result[i] = j;
                    break;
                }
            }
        }

        // Calculation without alphabet arr
        /*
        for(int i=0; i<S.length(); i++){
            char ch = S.charAt(i);

            // if 'b' is in ch, b - 'a' (or b - 97) equals 1
            // arr[1] = the place where the 'b' is
            // result[ch - 'a'] = i;
            
            // However, if there is a "same" letter, like baekjoon, double o's
            // It will represent the first place where it appears.
            // Therefore, it needs to be resetted.
            if(result[ch - 'a'] == -1){
                result[ch - 'a'] = i;
            }

        }

        for(int val : result){
            System.out.print(val + " ");
        }
    } */
    // # 2675
    /*
    // Using Scanner 
    // Took 232 ms
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        
        int testcase = sc.nextInt();
        int R=0;
        String S="";

        for(int i=0; i<testcase; i++){
            R = sc.nextInt();
            S = sc.next(); // MUST be next() NOT nextLine() bc it would read the spaces too
            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }        
    } */
    /*
    // Using BufferedReader
    // Took 140 ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcase = Integer.parseInt(br.readLine());

        for(int i=0; i<testcase; i++){
            String[] str = br.readLine().split(" "); // split by space
            
            int R = Integer.parseInt(str[0]); // First is the "R" String -> int
            String S = str[1]; // S, the given String

            for(int j=0; j<S.length(); j++){
                for(int k=0; k<R; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }
    } */
    /*
    // Using BufferedReader + StringBuilder + getByte()
    // Took 120 ms
    public static void main(String[] args) throws IOException {
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
        
		int T = Integer.parseInt(br.readLine());        
 
		for (int i = 0; i < T; i++) {
 
			String[] str = br.readLine().split(" ");
 
			int R = Integer.parseInt(str[0]);
 
			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char)val);
				}
			}
			sb.append('\n');
		}
		System.out.print(sb);
	} */
    /*
    // # 1157
    // https://www.acmicpc.net/problem/1157
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 여기서 .toUppercase() 부르고 - 'A' 만 해도됨
        String S = sc.next();

        int[] cnt = new int[26];

        for(int i=0; i<S.length(); i++){
            // 대문자의 범위는 65 ~ 90
            // 소문자의 범위는 97 ~ 122
            // 인덱스를 도출하려면 ->
            // 'C' 를 입력받았을때는 67 - 65 를 하면 된다
            // 'e' 는 101 - 97. 
            if(S.charAt(i) >= 65 && S.charAt(i)<= 90){
                cnt[S.charAt(i)- 'A']++; // or - 65
            }else{
                cnt[S.charAt(i)-97]++; // or - 'a'
            }
        }

        int max = -1;
        char c = '?';

        for(int i=0; i<26; i++){
            if(cnt[i] > max){
                max = cnt[i];
                c = (char)(i+65); // 대문자로 출력해야하기 때문에
            }else if(cnt[i] == max){
                c = '?';
            }
        }
        System.out.println(c);
    } */
    /*
    // # 1152
    // https://www.acmicpc.net/problem/1152
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        System.out.println(st.countTokens());
    } */
    /*
    // # 2908
    // https://www.acmicpc.net/problem/2908
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        int reversedNum1 = 0;
        int reversedNum2 = 0;

        // *******************************************
        while(num1 != 0 && num2 != 0){
            int digit1 = num1 % 10;
            reversedNum1 = reversedNum1 * 10 + digit1;
            num1 /= 10;

            int digit2 = num2 % 10;
            reversedNum2 = reversedNum2 * 10 + digit2;
            num2 /= 10;
        }

        // int reversedNum1 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		// int reversedNum2 = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
		
        // sysout(A > B ? A:B);
        System.out.println(reversedNum1 > reversedNum2 ? reversedNum1:reversedNum2);
        // if(reversedNum1 > reversedNum2){
        //     System.out.println(reversedNum1);
        // }else System.out.println(reversedNum2);
    } */
    // # 5622
    // https://www.acmicpc.net/problem/5622
    // Using Scanner + if-statements
    // Took 200 ms
    /* public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] ch = new char[s.length()];

        for(int i=0; i<s.length(); i++){
            ch[i] = s.charAt(i);
        }
        int ans = 0;

        for(int i=0; i<ch.length; i++){
            if(ch[i] == 'A' || ch[i] == 'B' || ch[i] == 'C'){
                ans += 3;
            }else if(ch[i] == 'D' || ch[i] == 'E' || ch[i] == 'F'){
                ans += 4;
            }else if(ch[i] == 'G' || ch[i] == 'H' || ch[i] == 'I'){
                ans += 5;
            }else if(ch[i] == 'J' || ch[i] == 'K' || ch[i] == 'L'){
                ans += 6;
            }else if(ch[i] == 'M' || ch[i] == 'N' || ch[i] == 'O'){
                ans += 7;
            }else if(ch[i] == 'P' || ch[i] == 'Q' || ch[i] == 'R' || ch[i] == 'S'){
                ans += 8;
            }else if(ch[i] == 'T' || ch[i] == 'U' || ch[i] == 'V'){
                ans += 9;
            }else if(ch[i] == 'W' || ch[i] == 'X' || ch[i] == 'Y' || ch[i] == 'Z'){
                ans += 10;
            }else if(ch[i] == '+' || ch[i] == '-'){
                ans += 11;
            }
        }
        System.out.println(ans);
    }*/
    /* 
    // Using BufferedReader + switch - case
    // Took 120 ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int ans = 0;
        
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case 'A' : case 'B' : case 'C':
                    ans += 3;
                    break;
                case 'D' : case 'E' : case 'F':
                    ans += 4;
                    break;
                case 'G' : case 'H' : case 'I':
                    ans += 5;
                    break;
                case 'J' : case 'K' : case 'L':
                    ans += 6;
                    break;
                case 'M' : case 'N' : case 'O':
                    ans += 7;
                    break;
                case 'P' : case 'Q' : case 'R' : case 'S':
                    ans += 8;
                    break;
                case 'T' : case 'U' : case 'V':
                    ans += 9;
                    break;
                case 'W' : case 'X' : case 'Y': case 'Z':
                    ans += 10;
                    break;
            }
        }
        System.out.println(ans);
    }*/
    /*
    // # 2941
    // https://www.acmicpc.net/problem/2941
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int len = s.length();
        int cnt = 0;

        for(int i=0; i < len; i++){

            if(s.charAt(i) == 'c' && i < len - 1){
                if(s.charAt(i+1) == '=' || s.charAt(i+1) == '-'){ // c= || c-
                    // i + 1 까지가 하나의 문자이므로 다음 문자를 건너 뛰기 위함
                    i++;
                }
            }
            
            else if(s.charAt(i) == 'd' && i < len - 1){
                if(s.charAt(i+1) == '-'){ // d-
                    i++;
                }else if(s.charAt(i+1) == 'z' && i < len - 2){ 
                    if(s.charAt(i+2) == '='){ // dz=
                        i += 2;
                    }
                }   
            }
            
            else if((s.charAt(i)== 'l' || s.charAt(i) == 'n') && i < len -1){
                if(s.charAt(i+1) == 'j'){ // lj || nj
                    i++;
                }
            }

            else if((s.charAt(i)== 's' || s.charAt(i) == 'z') && i < len - 1){
                if(s.charAt(i+1) == '='){ // s= || z=
                    i++;
                }
            }

            cnt++;
            
        }
        System.out.println(cnt);
    } */
    /*
    // # 1316 ************************************
    // https://www.acmicpc.net/problem/1316
    
    // Needs to call throws IOException for any methods that needs B.R.
    // static to use in the methods
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            if(check()){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
    static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev = 0;
        String s = br.readLine();

        for(int i=0; i<s.length(); i++){
            int now = s.charAt(i);

            // 앞선 문자와 i 번째 문자가 같지 않다면 
            if(prev != now){
                if(check[now - 'a'] == false){ // 해당 문자가 처음 나오는 경우
                    check[now - 'a'] = true;
                    prev = now;
                }else { // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어 X)
                    return false; // End 
                }   
            }            
        }
        return true;
    } */
}
