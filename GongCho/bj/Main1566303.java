package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.bj
 * fileName       : Main1566303
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-05        qkrtn_ulqpbq2       최초 생성
 */
//9:40 ~ 10:00 // 중복순열 (isUsed)
public class Main1566303 {

    static int n,m;
    static StringTokenizer st;
    static int[] nums, selected;
    static boolean[] isUsed;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        nums = new int[n];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        isUsed = new boolean[n];
        selected = new int[m];
        dfs(0);
        System.out.println(sb);
    }

    static void dfs(int idx){
        if(idx == m){
            for(int i=0; i<m; i++){
                sb.append(selected[i] + " ");
            }
            sb.append('\n');
            return;
        }

        int before = 0;
        for(int i=0; i<n; i++){
            if(!isUsed[i] && before != nums[i]){
                selected[idx] = nums[i];
                isUsed[i] = true;
                before = nums[i];
                dfs(idx + 1);
                isUsed[i] = false;
            }
        }
    }
}
