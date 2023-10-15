package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1215 {

    static char[][] map;
    static int ans = 0;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int n = Integer.parseInt(br.readLine());

            map = new char[8][8];
            ans = 0;

            if(n == 1) {
                System.out.println("#" + i + " " + 64);
                continue;
            }

            for(int j=0; j<8; j++) {
                String str = br.readLine();
                for(int k=0; k<8; k++) {
                    map[j][k] = str.charAt(k);
                }
            }

            //가로
            //int ga = 0;
            for(int j=0; j<8; j++) {
                for(int k=0; k<8-n+1; k++) {
                    StringBuilder sb = new StringBuilder();
                    for(int l=k; l<n+k; l++) {
                        sb.append(map[j][l]);
                    }
                    //ga += 1;
                    //System.out.println("가로로 생성한 문자 : " + sb.toString());
                    if(sb.toString().equals(sb.reverse().toString())) {
                        ans += 1;
                        //System.out.println("회문 : " + sb.toString());
                    }
                }
            }
            //System.out.println("가로로 총 " + ga);
            //세로
            int se = 0;
            for(int col=0; col<8; col++) {
                for(int row=0; row<8-n+1; row++) {
                    StringBuilder sb = new StringBuilder();
                    for(int l=row; l<n+row; l++) {
                        sb.append(map[l][col]);
                    }
                    //se += 1;
                    //System.out.println("세로로 생성한 문자 : " + sb.toString());
                    if(sb.toString().equals(sb.reverse().toString())) {
                        ans += 1;
                        //System.out.println("회문 : " + sb.toString());
                    }
                }
            }
            //System.out.println("세로로 총 " + se);
            System.out.println("#" + i + " " + ans);
        }

    }

}
