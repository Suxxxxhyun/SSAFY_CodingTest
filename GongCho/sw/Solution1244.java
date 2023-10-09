package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//https://m.blog.naver.com/hoons_612/221920673698 참조
//4:09 ~ 4:30
public class Solution1244 {

    static int c, k, answer = 0;
    static StringBuilder sb = new StringBuilder();
    static String[] target;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        c = Integer.parseInt(br.readLine());
        for(int i=1; i<=c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            k = Integer.parseInt(st.nextToken());
            target = str.split("");

            // 시간초과 최적화
            if(target.length < k) {	// swap 횟수가 자릿수보다 클 때
                k = target.length;	// 자릿수만큼만 옮겨도 전부 옮길 수 있음
            }

            dfs(0,0);
            sb.append("#" + i + " " + answer).append('\n');
            answer = 0;
        }
        System.out.println(sb);

    }

    static void dfs(int idx, int count) {
        if(count == k) {
            String str = "";
            for(String temp : target) {
                str += temp;
            }
            answer = Math.max(answer, Integer.valueOf(str));
            return;
        }

        for(int i = idx; i<target.length; i++) {
            for(int j= i+1; j<target.length; j++) {
                String temp = target[i];
                target[i] = target[j];
                target[j] = temp;

                dfs(i, count + 1);	// 깊이 +1
                // 다시 swap 해서 되돌림
                temp = target[i];
                target[i] = target[j];
                target[j] = temp;
            }
        }

    }

}
