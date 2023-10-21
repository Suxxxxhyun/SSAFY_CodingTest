package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution124402 {

    static int t, k, max;
    static String[] arr;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            arr = str[0].split("");
            k = Integer.parseInt(str[1]);

            if(arr.length < k) {
                k = arr.length;
            }

            max = 0;
            dfs(0,0);
            System.out.println("#"+i+" "+max);
        }
    }

    static void dfs(int idx, int count) {
        if(count == k) {
            String result = "";
            for(String s : arr) {
                result += s;
            }
            max = Math.max(max, Integer.parseInt(result));
            return;
        }

        for(int i = idx; i < arr.length; i++) {
            for(int j = i + 1; j<arr.length; j++) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                dfs(idx, count + 1);

                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }

}

