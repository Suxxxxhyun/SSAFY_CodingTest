package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * packageName    : saffy.bj
 * fileName       : Main2751
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main2751 {

    static int n;
    static List<Integer> list = new ArrayList<Integer>();
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            list.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i)).append('\n');
        }
        System.out.println(sb);
    }
}
