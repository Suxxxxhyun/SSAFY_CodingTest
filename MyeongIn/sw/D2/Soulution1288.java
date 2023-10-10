package D2;

// SWEA 1288. 새로운 불면증 치료법

// 호석이는 불면증에 걸렸다. 그래서 잠이 안 올 때의 민간요법 중 하나인 양 세기를 하려고 한다.
// 호석이는 1번 양부터 순서대로 세는 것이 재미없을 것 같아서 N의 배수 번호인 양을 세기로 하였다.
// 즉, 첫 번째에는 N번 양을 세고, 두 번째에는 2N번 양, … , k번째에는 kN번 양을 센다.
// 이렇게 숫자를 세던 호석이에게 잠은 더 오지 않고 다음과 같은 궁금증이 생겼다.
// 이전에 셌던 번호들의 각 자리수에서 0에서 9까지의 모든 숫자를 보는 것은 최소 몇 번 양을 센 시점일까?
// 예를 들어 N = 1295이라고 하자.
// 첫 번째로 N = 1295번 양을 센다. 현재 본 숫자는 1, 2, 5, 9이다.
// 두 번째로 2N = 2590번 양을 센다. 현재 본 숫자는 0, 2, 5, 9이다.
// 현재까지 본 숫자는 0, 1, 2, 5, 9이다.
// 세 번째로 3N = 3885번 양을 센다. 현재 본 숫자는 3, 5, 8이다.
// 현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.
// 네 번째로 4N = 5180번 양을 센다. 현재 본 숫자는 0, 1, 5, 8이다.
// 현재까지 본 숫자는 0, 1, 2, 3, 5, 8, 9이다.
// 다섯 번째로 5N = 6475번 양을 센다. 현재 본 숫자는 4, 5, 6, 7이다.
// 현재까지 본 숫자는 0, 1, 2, 3, 4, 5, 6, 7, 8, 9이다.
// 5N번 양을 세면 0에서 9까지 모든 숫자를 보게 되므로 호석이는 양 세기를 멈춘다.

// 유의사항 : 문제에서 출력해야할 값이 무엇인지 확실하게 확인하고 이에 맞는 변수를 출력하자
// 유의사항 : 타입 번환 주의. char는 int로 변할시 3 -> 3이 아닌 아스키 문자에 해당하는 숫자가 나옴. Integer.parseInt와 Integer.toString 사용해야함.
// 유의사항 : str.substring(i,j)로 부분 문자열 추출 가능, 단 범위를 초기값과 끝값을 정해줘야한다.

import java.lang.StringBuilder;
import java.io.*;

class Solution1928 {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            boolean[] choosedNum = new boolean[10];

            String n = br.readLine();
            int cnt = 0;
            String firN = n;

            String lastN = "";

            while (true) {
                cnt++;

                for (int i = 0; i < n.length(); i++) {
                    int nSub = Integer.parseInt(n.substring(i, i + 1));
                    choosedNum[nSub] = true;
                }

                boolean clear = true;
                for (int i = 0; i < 10; i++) {
                    if (!choosedNum[i]) {
                        clear = false;
                    }
                }
                if (clear) {
                    lastN = n;
                    break;
                }

                int nextN = Integer.parseInt(firN) * (cnt + 1);
                n = Integer.toString(nextN);

            }
            sb.append("#" + test_case + " " + lastN + "\n");

        }
        System.out.print(sb);
    }
}

// 숫자가 들어오면 모든 자리의 수에 해당하는 숫자 인덱스 true 처리
