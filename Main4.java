import java.io.*;
import java.util.*;

class Main4{
	/*
	// # 10818 
	// https://www.acmicpc.net/problem/10818
	// Arrays.sort
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		StringTokenizer st;
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		sc.close();
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[n-1]);
	}
	// StringTokenizer + BufferedReader
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int i=0;
		int[] arr = new int[n];
		while(st.hasMoreTokens()) {
			arr[i] = Integer.parseInt(st.nextToken());
			i++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[n-1]);
	} */
    /*
    // # 2562
    // https://www.acmicpc.net/problem/2562
	public static void main(String args[]) {
		final int max = 9;
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[max]; 
		
		for(int i=0; i<max; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		int count=0;
		int maxNum=0;
		int where=0;
		for(int value : arr) {
			count++;
			
			if(value > maxNum) {
				maxNum = value;
				where = count;
			}
		}
		System.out.print(maxNum + "\n" + where);
	} */
    // # 2577
    // https://www.acmicpc.net/problem/2577
    // Using Scanner -> Took 212 ms
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ans = (sc.nextInt() * sc.nextInt() * sc.nextInt());
        sc.close();
        int[] counts = new int[10];
		while (ans > 0) {
			counts[ans % 10]++;
			ans /= 10;
		}
		
		for (int i = 0; i < counts.length; ++i) {
			System.out.println(counts[i]);
		}
    }
    // Using BufferedReader -> Took 124 ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int value = Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) *Integer.parseInt(br.readLine());
        int[] arr = new int[10];
        
        while(value != 0){
            arr[value%10]++; // 1의 자리 숫자에 따라 array의 인덱스에 +1
            value /= 10; // 숫자의 1의 자리를 지움 
                         // 150 -> 15 -> 1
                         // 그럼 위의 operation 으로 +1 을 함
        }
        for(int result : arr){
            System.out.println(result);
        }
    } */
    /*
    // # 3052
    // https://www.acmicpc.net/problem/3052
    // Using BufferedReader + boolean array
    // Took 128 ms
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];

        for(int i=0; i<10; i++){
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count=0;

        for(boolean value : arr){
            if(value){
                count++;
            }
        }
        System.out.println(count);
    }
    // Using HashSet -> A java Collection that derived in Set class
    // HashSet allows ONE element only in the collection
    // It does NOT allow the same element & no order 
    // Therefore has to be converted into a List 
    // to use Collections.sort()
    // Took 212 ms
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            h.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(h.size());
    }*/
    /*
    // # 1546
    // https://www.acmicpc.net/problem/1546
    // Double arr 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double arr[] = new double[Integer.parseInt(br.readLine())];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        double score=0;
        for(int i=0; i<arr.length; i++){
			arr[i] = Double.parseDouble(st.nextToken());
        }
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++){
            score += ((arr[i] / arr[arr.length-1] * 100));
        }
        System.out.println(score / arr.length);
    } */
    /*
    // # 8958 *******************
    // https://www.acmicpc.net/problem/8958
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String arr[] = new String[sc.nextInt()];

        for(int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        sc.close();
        
        for(int i=0; i<arr.length; i++){
            // arr.length = given length 
            int count=0;
            int total=0;

            for(int j=0; j<arr[i].length(); j++){
                // arr[i].length = length of each string element
                if(arr[i].charAt(j) == 'O'){
                    count++;
                }else count=0;
                total += count;
            }
            System.out.println(total);
        }
    } */
    // # 4344 *************************
    // https://www.acmicpc.net/problem/4344
    // Using Scanner
    // Took 400 ms
    /*
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
            // printf 에서 "%" 라는 문자를 출력하려면 %% 로 적어줘야함
            System.out.printf("%.3f%%\n", (count/N)*100);
        }
        sc.close();
                
    } */
    /*
    // Using BuffereadReader + StringTokenizer
    // Took 180 ms
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
	} */
}
