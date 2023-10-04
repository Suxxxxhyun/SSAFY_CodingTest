package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : saffy.bj
 * fileName       : Main1181
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-26
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-26        qkrtn_ulqpbq2       최초 생성
 */
public class Main1181 {

    static int n;
    static Set<String> a = new HashSet<String>();
    static ArrayList<letter> list = new ArrayList<letter>();

    static class letter implements Comparable<letter>{

        int len;
        String st;

        public letter(int len, String st){
            this.len = len;
            this.st = st;
        }
        public int compareTo(letter other){
            if(this.len == other.len){
                return st.compareTo(other.st);
            }
            return this.len - other.len;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            a.add(br.readLine());
        }

        Iterator<String> iter = a.iterator();
        while(iter.hasNext()){
            String st = (String) iter.next();
            list.add(new letter(st.length(), st));
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i).st).append('\n');
        }
        System.out.println(sb);
    }
}
