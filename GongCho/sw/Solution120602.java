package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//~ 10:00까지 고민하기
public class Solution120602 {

    static int n;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int t=1; t<=10; t++) {
            n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
            }

            int cnt = 0;
            for(int j=2; j<n-2; j++) {
                int current = arr[j];
                int max = Math.max(arr[j-2], Math.max(Math.max(arr[j-1], arr[j+1]), arr[j+2]));
                if(current > max) {
                    cnt += (current - max);
                }
            }
            System.out.println("#" + t + " " + cnt);
        }
    }

}

