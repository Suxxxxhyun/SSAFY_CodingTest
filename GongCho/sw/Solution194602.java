package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution194602
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class Solution194602 {

    static int t, n;
    static StringTokenizer st;
    static class Node{
        String str;
        int cnt;

        public Node(String str, int cnt){
            this.str = str;
            this.cnt = cnt;
        }
    }

    static List<Node> list;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++){
            n = Integer.parseInt(br.readLine());
            list = new ArrayList<Node>();
            for(int j=0; j<n; j++){
                st = new StringTokenizer(br.readLine(), " ");
                String s = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                list.add(new Node(s, num));
            }

            System.out.println("#" + i);
            while(true){
                for(int j=0; j<10; j++){
                    sb.append(list.get(0).str);
                    list.get(0).cnt--;

                    if(list.get(0).cnt == 0){
                        list.remove(0);
                    }

                    if(list.size() == 0){
                        break;
                    }
                }
                System.out.println(sb.toString());
                sb.delete(0,sb.length());
                if(list.size() == 0){
                    break;
                }
            }
        }
    }
}
