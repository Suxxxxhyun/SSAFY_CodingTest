package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution195902
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-09        qkrtn_ulqpbq2       최초 생성
 */
public class Solution195902 {

    static int t;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int m = Integer.parseInt(str[1]);
            int[] a = new int[n];
            int[] b = new int[m];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++){
                a[j] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<m; j++){
                b[j] = Integer.parseInt(st.nextToken());
            }

            int max = 0;
            if(n < m){
                for(int j=0; j<m-n+1; j++){
                    int result = 0;
                    for(int k=0; k<n; k++){
                        result += a[k] * b[j + k];
                    }
                    max = Math.max(max, result);
                }
           } else if(n > m){
                for(int j=0; j<n-m+1; j++){
                    int result = 0;
                    for(int k=0; k<m; k++){
                        result += a[j+k] * b[k];
                    }
                    max = Math.max(max, result);
                }
            } else {
                int result = 0;
                for(int l=0; l<n; l++){
                    result += a[l] * b[l];
                }
                max = Math.max(max, result);
            }
            System.out.println("#" + i + " " + max);
        }
    }
}
