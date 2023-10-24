package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1018 {

    static StringTokenizer st;
    static int n, m, ans;
    static char[][] map;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<m; j++) {
                map[i][j] = str.charAt(j);
            }
        }
        ans = n * m;

        pro();
        System.out.println(ans);
    }

    static void pro() {

        for(int j=0; j<=n-8; j++) {
            for(int k=0; k<=m-8; k++) {
//				int change = 0;
//				char s = map[j][k]; //W
//				char b = ' ';
//				if(s == 'W') {
//					b = 'B'; //B
//				} else {
//					b = 'W';
//				}
//				System.out.println("j = " + j + ", k = " + k + ", map의 처음값 = " + map[j][k]);
                for(int t=1; t<=2; t++) {
                    int change;
                    char s, b;
                    if(t == 1) {
                        change = 0;
                        s = map[j][k]; //W
                        b = ' ';
                        if(s == 'W') {
                            b = 'B'; //B
                        } else {
                            b = 'W';
                        }
                    } else {
                        change = 0;
                        b = map[j][k]; //W
                        s = ' ';
                        if(b == 'W') {
                            s = 'B'; //B
                        } else {
                            s = 'W';
                        }
                    }
                    for(int row=j; row<j+8; row++) {
                        for(int col=k; col<k+8; col++) {
                            if(k % 2 == 0) {
                                if(col % 2 == 0) {
                                    if(map[row][col] != s) {
                                        change += 1;
                                    }
                                } else {
                                    if(map[row][col] != b) {
                                        change += 1;
                                    }
                                }
                            } else {
                                if(col % 2 == 1) {
                                    if(map[row][col] != s) {
                                        change += 1;
                                    }
                                } else {
                                    if(map[row][col] != b) {
                                        change += 1;
                                    }
                                }
                            }
                        }
                        char temp = s; //W
                        s = b; //B
                        b = temp;
                    }
                    //System.out.println("j = " + j + ", k = " + k + ", change = " + change + ", s = " + s + ", b = " + b);
                    ans = Math.min(ans, change);
                }
            }
        }
    }

}
