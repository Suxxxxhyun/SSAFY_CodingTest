package saffy.Rugusee.sw;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_1206 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int test_case=1; test_case<=10; test_case++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            int cnt = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i=2; i<n-2; i++){
                int max = Math.max(arr[i-2], Math.max(arr[i-1], Math.max(arr[i+1], arr[i+2])));

                //1칸에 1세대
                if(arr[i] - max > 0) cnt += arr[i] - max;
            }

            System.out.println("#" + test_case + " " + cnt);
        }

    }
}

