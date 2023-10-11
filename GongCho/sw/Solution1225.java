package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution1225 {

    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int n = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new LinkedList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<8; j++) {
                dq.offerLast(Integer.parseInt(st.nextToken()));
            }
            while(true) {
                int x = 0;
                boolean stop = false;
                for(int j=1; j<=5; j++) {

                    x = dq.pollFirst();

                    if(j == 1) {
                        x -= j;
                    } else if(j == 2) {
                        x -= j;
                    } else if(j == 3) {
                        x -= j;
                    } else if(j == 4) {
                        x -= j;
                    } else if(j == 5) {
                        x -= j;
                    }

                    if(x <= 0) {
                        dq.offerLast(0);
                        stop = true;
                        break;
                    }

                    dq.offerLast(x);
                }

                if(stop) {
                    break;
                }
            }
            System.out.print("#" + i + " ");
            while(dq.size() > 0) {
                System.out.print(dq.poll() + " ");
            }
            System.out.println();
        }


    }

}

