package saffy.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * packageName    : saffy.sw
 * fileName       : Solution2007
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Solution2007 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for(int r = 1; r <= t; r++){
            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][n];

            for(int i=0; i<n; i++){
                for(int j=0; j<=i; j++){
                    if(i==j)
                        arr[i][j]=1;
                    else if(j==0)
                        arr[i][j]=1;
                    else
                        arr[i][j] = arr[i-1][j-1] + arr[i-1][j];  //arr[i-1][j-1]은 현재 요소의 왼쪽 위 요소를, arr[i-1][j]은 현재 요소의 바로 위 요소를 나타냄.
                    //**오른쪽 요소는 파스칼의 삼각형에서 계산할 때 사용되지 않는 요소**
                }
            }
            System.out.println("#"+r);

            for(int i = 0; i < n; i++) {
                for(int j = 0; j <= i; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
