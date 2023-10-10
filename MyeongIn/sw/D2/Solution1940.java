package D2;

import java.util.StringTokenizer;
import java.io.*;
import java.lang.StringBuilder;

class Solution1940 {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        String str;
        StringTokenizer st;

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = Integer.parseInt(br.readLine());

            int dis = 0;
            int ms = 0;

            for (int i = 0; i < n; i++) {
                str = br.readLine();
                st = new StringTokenizer(str);
                int type = Integer.parseInt(st.nextToken());
                int speed = 0;

                if (type > 0) {
                    speed = Integer.parseInt(st.nextToken());
                }

                if (type == 1) { // 현재 속도에 더 하기
                    ms += speed;
                    dis += ms;

                }

                else if (type == 2) { // 현재 속도 붙어있었다면 현재 속도에서 뺴기 그리고 거리에 더, 음수면 0으로 초기
                    ms -= speed;
                    if (ms < 0) {
                        ms = 0;
                    }
                    dis += ms;
                }

                else { // 현재 속도 유지. 현재 속도가 붙어있었다면 1초당안 해당 속도만큼 이동
                    if (ms > 0) {
                        dis += ms;
                    }
                }
            }
            sb.append("#" + test_case + " " + dis + "\n");
        }
        System.out.print(sb);
    }
}