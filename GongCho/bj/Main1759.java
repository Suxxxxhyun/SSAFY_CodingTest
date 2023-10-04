package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main1759
 * author         : qkrtn_ulqpbq2
 * date           : 2023-10-04
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-10-04        qkrtn_ulqpbq2       최초 생성
 */
// 11:20 ~ 12:00
public class Main1759 {

    static StringTokenizer st;
    static int l,c;
    static char[] alpha;
    static Character[] selected;
    static StringBuilder sb = new StringBuilder();

    static class Character implements Comparable<Character>{
        int idx;
        char alpha;

        public Character(int idx, char alpha){
            this.idx = idx;
            this.alpha = alpha;
        }

        public int compareTo(Character other){
            return this.alpha - other.alpha;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine(), " ");
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        alpha = new char[c];
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<c; i++){
            alpha[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(alpha);
        selected = new Character[l];
        pro(0);
        System.out.println(sb);
    }

    static void pro(int idx){
        if(idx == l){
            if(confirm()){
                for(int i=0; i<l; i++){
                    sb.append(selected[i].alpha);
                }
                sb.append('\n');
            };
            return;
        }

        int start;
        if(idx == 0){
            start = 0;
        } else {
            start = selected[idx - 1].idx + 1;
        }

        for(int i=start; i<c; i++){
            selected[idx] = new Character(i,alpha[i]);
            pro(idx + 1);
        }
    }

    static boolean confirm(){
        int mo = 0, za = 0;
        for(int i=0; i<l; i++){
            char p = selected[i].alpha;
            if(p == 'a' || p == 'e' || p == 'i' || p == 'o' || p == 'u'){
                mo += 1;
            } else {
                za += 1;
            }
            //System.out.print(selected[i].alpha + " ");
        }
        //System.out.println();
        if(mo >= 1 && za >= 2){
            return true;
        } else {
            return false;
        }
    }
}
