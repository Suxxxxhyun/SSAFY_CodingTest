package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1860 {

    static int t, n, m, k;
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<Integer>();
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                int arrive_time = Integer.parseInt(st.nextToken());
                list.add(arrive_time);
            }
            Collections.sort(list);

            int current_time = 0, make_cnt = 0, make_time = m, give_cnt = 0, mod_cnt = 0;
            boolean ans = true;
            for(int j=0; j<list.size(); j++) {

                current_time = list.get(j); //현재시각 2초
                //아직 만들어지지 않은경우
                if(current_time < make_time) {
                    if(make_cnt >= mod_cnt && make_cnt != 0) {
                        give_cnt = 1;
                        mod_cnt = make_cnt - give_cnt;
                        make_cnt -= give_cnt;
                    } else {
                        ans = false;
                        break;
                    }
                } else {
                    make_cnt += k;
                    make_time = make_time + m;
                    give_cnt = 1;
                    mod_cnt = make_cnt - give_cnt;
                    make_cnt -= give_cnt;
                }
            }

            String str = "";
            if(ans) {
                str = "Possible";
            } else {
                str = "Impossible";
            }
            sb.append("#" + i + " " + str).append('\n');
        }
        System.out.println(sb);

    }

}

