package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1961 {

    static int t, n;
    static StringTokenizer st;
    static int[][] a;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            n = Integer.parseInt(br.readLine());
            a = new int[n][n];
            for(int k=0; k<n; k++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int j=0; j<n; j++) {
                    a[k][j] = Integer.parseInt(st.nextToken());
                }
            }
            int[][] result_90 = Rotation(a);
            int[][] result_180 = Rotation(result_90);
            int[][] result_270 = Rotation(result_180);
            sb.append("#" + (i)).append('\n');
            for(int k=0; k<n; k++) {
                for(int j=0; j<n; j++) {
                    sb.append(result_90[k][j]);
                }
                sb.append(" ");

                for(int j=0; j<n; j++) {
                    sb.append(result_180[k][j]);
                }
                sb.append(" ");

                for(int j=0; j<n; j++) {
                    sb.append(result_270[k][j]);
                }
                sb.append('\n');
            }
        }
        System.out.println(sb);

    }

    static int[][] Rotation(int[][] arr){
        int[][] result = new int[arr.length][arr.length];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                result[i][j] = arr[arr.length - j - 1][i];
            }
        }
        return result;
    }

}

