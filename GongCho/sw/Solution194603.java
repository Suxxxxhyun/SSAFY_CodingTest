package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.GongCho.sw
 * fileName       : Solution194603
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-06        qkrtn_ulqpbq2       최초 생성
 */
public class Solution194603 {

    static int t, n;
    static int Test = 1;
    static class Node{
        String str;
        int cnt;
        public Node(String str, int cnt){
            this.str = str;
            this.cnt = cnt;
        }
    }
    static List<Node> list = new ArrayList<Node>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            System.out.println("#" + Test);
            n = Integer.parseInt(br.readLine());
            for(int i=0; i<n; i++){
                StringTokenizer st = new StringTokenizer(br.readLine(), " ");
                String alpha = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                list.add(new Node(alpha,num));
            }

            StringBuilder sb = new StringBuilder();
            while(true){
                for(int i=0; i<10; i++){
                    sb.append(list.get(0).str);
                    list.get(0).cnt--;

                    if(list.get(0).cnt == 0){
                        list.remove(0);
                    }

                    if(list.size() == 0){
                        System.out.print(sb.toString());
                        sb.delete(0,sb.length());
                        break;
                    }
                }
                System.out.println(sb.toString());
                sb.delete(0,sb.length());
                if(list.size() == 0){
                    break;
                }
            }
            Test++;
        }
    }
}
