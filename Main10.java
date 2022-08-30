import java.io.*;
import java.util.*;

public class Main10 {
    /*
    // # 2798
    // https://www.acmicpc.net/problem/2798
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
         
        StringTokenizer givenCards = new StringTokenizer(br.readLine(), " ");
        int[] cards = new int[n];
        int i=0;
        while(givenCards.hasMoreTokens()){
            cards[i] = Integer.parseInt(givenCards.nextToken());
            i++;
        }
        int result = search(cards, n, m);
        System.out.println(result);
    }
    static int search(int[] arr, int n, int m){
        int result = 0;
        for(int i=0; i<arr.length - 2; i++){
            int temp = 0;
            for(int j=i+1; j<arr.length - 1; j++){
                for(int k=j+1; k<arr.length; k++){
                    temp = arr[i] + arr[j] + arr[k];
                    if(m == temp){
                        return temp;
                    }
                    if(result < temp && temp < m){
                        result = temp;
                    }
                }
            }
        }
        return result;
    }*/
    /*
    // # 2231
    // https://www.acmicpc.net/problem/2231
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

        br.close();
    } */
    /*
    // # 7568
    // https://www.acmicpc.net/problem/7568
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
                if(weight[i] < weight[j] && hight[i] < hight[j]){
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);

    }
    // answer? difference? 
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        String[] str;

        for(int i=0; i<n; i++){
            str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            int rank = 1;

            for(int j=0; j<n; j++){
                if(i == j) continue;
                if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]){
                    rank++;
                }
            }
            sb.append(rank).append(' ');
        }
        System.out.println(sb);

    }*/
    // # 1018
    // https://www.acmicpc.net/problem/1018
    public static void main(String[] args) {
        
    }
}
