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
    }
}