package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Solution3499 {

    static int t;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=t; i++) {
            sb.append("#"+i+" ");
            int n = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split(" ");
            Deque<String> dq_1 = new LinkedList<String>();
            Deque<String> dq_2 = new LinkedList<String>();
            if(n % 2 == 0) {
                int b = n / 2;
                for(int j=0; j<b; j++) {
                    dq_1.offerLast(str[j] + "");
                }
                for(int j=b; j<str.length; j++) {
                    dq_2.offerLast(str[j] + "");
                }
            } else {
                int b = n / 2;
                for(int j=0; j<b+1; j++) {
                    dq_1.offerLast(str[j] + "");
                }
                for(int j=b+1; j<str.length; j++) {
                    dq_2.offerLast(str[j] + "");
                }
            }
            while(dq_1.size() > 0 || dq_2.size() > 0) {
                if(!dq_1.isEmpty()) {
                    sb.append(dq_1.pollFirst() + " ");
                }
                if(!dq_2.isEmpty()) {
                    sb.append(dq_2.pollFirst() + " ");
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);

    }

}

