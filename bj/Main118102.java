package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : saffy.bj
 * fileName       : Main118102
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main118102 {

    static int n;
    static Set<String> a = new HashSet<String>();
    static class Word {
        int len;
        String str;

        public Word(int len, String str){
            this.len = len;
            this.str = str;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            String st = br.readLine();
            a.add(st);
        }
        Word[] w = new Word[a.size()];

        int idx = 0;
        Iterator<String> iter = a.iterator();
        while(iter.hasNext()){
            String st = (String) iter.next();
            w[idx++] = new Word(st.length(), st);
        }

//        for(int i=0; i<w.length; i++){
//            System.out.println(w[i].len + " " + w[i].str);
//        }

        Arrays.sort(w, new Comparator<Word>(){
           public int compare(Word w1, Word w2){
               if(w1.len == w2.len){
                   return w1.str.compareTo(w2.str);
               }
               return w1.len - w2.len;
           }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<w.length; i++){
            sb.append(w[i].str).append('\n');
        }
        System.out.println(sb);
    }
}
