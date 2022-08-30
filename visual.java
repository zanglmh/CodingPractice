import java.util.*;
import java.io.*;

public class visual {
   // # 2577
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		
		int[] counts = new int[10];
		int number = A * B * C;
		while (number > 0) {
			counts[number % 10]++;
			number /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
	}*/
   /*
   // # 1546
   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double score=0;
        for(int i=0; i<arr.length; i++){
			arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);
        double M = arr[arr.length-1];

        for(int i=0; i<arr.length; i++){
            score += ((arr[i] / M * 100));
        }
        System.out.println(score / arr.length);
    }*/
    /*
    // # 8958
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        sc.close();

        for(int i=0; i<arr.length; i++){
            int count=0;
            int total=0;

            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == 'O'){
                    count++;
                }else count=0;
                total += count;
            }
            System.out.println(total);
        }

    }*/
    /* # 4344
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);

        int[] arr;
        int testcase = sc.nextInt();

        for(int i=0; i<testcase; i++){
            int N = sc.nextInt(); // number of student
            arr = new int[N];

            double sum = 0; // score

            // score calculation
            for(int j=0; j<N; j++){
                int val = sc.nextInt();
                arr[j] = val;
                sum += val; // total score of students
            }

            double mean = (sum / N);
            double count = 0; // number of students who score above average

            // calculaton of "above" studnets
            for(int j=0; j<N; j++){
                if(arr[j] > mean){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
        sc.close();
                
    }*/
    /*
    // # 4344 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr;
		
		int testcase = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i = 0 ; i < testcase ; i++) {
 
			st = new StringTokenizer(br.readLine()," "); 			
			int N = Integer.parseInt(st.nextToken());	
         arr = new int[N];
			
			double sum = 0;	
			
         for(int j = 0 ; j < N ; j++) {
				int val = Integer.parseInt(st.nextToken());	
            arr[j] = val;
				sum += val;
			}
			
			double mean = (sum / N) ;
			double count = 0; 
         
			for(int j = 0 ; j < N ; j++) {
				if(arr[j] > mean) {
					count++;
				}
			}
			
			System.out.printf("%.3f%%\n",(count/N)*100);
			
	
		}
	}*/
   /*
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();  
        sc.close();
        int temp1 = 0;
        int temp2 = 0;
        int ans = -1;

        do{
            temp1 = A + (B*ans);
            temp2 = C*ans;
            ans++;
        }while(temp2 < temp1);
        System.out.println(ans);
    }*/
    /*
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
    }*/
    /*
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
    }*/
    /*
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int size = (int)(Math.log10(n)+1);
        int start = n - (9*size);
        int result = 0;
        // (int)(Math.log10(n)+1) == length of the number
        
        for(int i = start; i < n; i++){
            int sum = i;
            int temp = i;

            while(temp>0){
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == n){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }*/
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] weight = new int[n];
        int[] hight = new int[n];
        StringTokenizer st;
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine(), " ");
            weight[i] = Integer.parseInt(st.nextToken());
            hight[i] = Integer.parseInt(st.nextToken());
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int rank = 1;

            for(int j=0; j<n; j++){
                if(i == j) continue;
                if(weight[i] < weight[j] && hight[i] < hight[j]){
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);
   }
}