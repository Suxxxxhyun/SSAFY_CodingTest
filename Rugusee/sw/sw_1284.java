package saffy.Rugusee.sw;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sw_1284 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int cost = 0;

        // 한 달간 사용하는 수도의 양이 W리터라고 할 때, 요금이 더 저렴한 회사를 골라 그 요금을 출력
        // A사 : 1리터당 P원의 돈을 내야 한다.
        // B사 : 기본 요금이 Q원이고, 월간 사용량이 R리터 이하인 경우 요금은 기본 요금만 청구된다.
        // 하지만 R 리터보다 많은 양을 사용한 경우 초과량에 대해 1리터당 S원의 요금을 더 내야 한다.
        //	W의 R리터 초과여부
        //	A사 요금: W(10, 250) * P(9, 8) = 90(V), 2000
        //	B사 요금: 1. (R리터 이하) Q = 100
        //			2. (R리터 이상) Q + (W-R) * S = 300 + (250-100) * 10
        //				= 300 + 1500 = 1800(V)

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine(), " ");
            int P = Integer.parseInt(st.nextToken()); // A사 요금
            int Q = Integer.parseInt(st.nextToken()); // B사 기본 요금
            int R = Integer.parseInt(st.nextToken()); // B사 기본 사용량
            int S = Integer.parseInt(st.nextToken()); // B사 추가 요금
            int W = Integer.parseInt(st.nextToken()); // 한 달간 사용하는 수도의 양

            int A = W * P;
            int B1 = Q;
            int B2 = Q + ((W - R) * S);

            if (W < R) {
                // R리터 이하
                cost = Math.min(A, B1);
            } else if (W >= R) {
                // R리터 이상
                cost = Math.min(A, B2);
            }

            System.out.println("#" + test_case + " " + cost);
        }

    }
}
