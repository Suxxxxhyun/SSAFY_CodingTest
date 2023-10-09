package saffy.GongCho.sw;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1206 {

    static int n;
    static int[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            arr = new int[n];
            for(int j=0; j<n; j++) {
                arr[j] = Integer.parseInt(str[j]);
            }

            int cnt = 0;
            for(int j=2; j<n-2; j++) {
                int max = Math.max(arr[j - 2], Math.max(Math.max(arr[j - 1], arr[j + 1]), arr[j + 2]));
                if(arr[j] - max > 0) {
                    cnt += (arr[j] - max);
                }
            }
            System.out.println("#" + i + " " + cnt);
        }

    }

}

