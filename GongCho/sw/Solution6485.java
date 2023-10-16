package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution6485 {

    static int t;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            int n = Integer.parseInt(br.readLine());
            arr = new int[5001];
            for(int j=0; j<n; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                for(int start = a; start <= b; start++) {
                    arr[start] += 1;
                }
            }

            sb.append("#" + i + " ");
            int p = Integer.parseInt(br.readLine());
            for(int j=0; j<p; j++) {
                int x = Integer.parseInt(br.readLine());
                sb.append(arr[x] + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

}

