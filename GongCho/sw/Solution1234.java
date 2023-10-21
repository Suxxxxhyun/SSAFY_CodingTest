package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1234 {

    static int n;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            while(true) {
                boolean change = false;
                for(int j=1; j<str.length(); j++) {
                    char next = str.charAt(j);
                    char prev = str.charAt(j-1);
                    if(prev == next) {
                        change = true;
//						System.out.println("그때의 인덱스 = " + j);
//						System.out.println("prev = " + prev + ", next = " + next);
                        String front = str.substring(0,j-1);
//						System.out.println("front = " + front);
                        String back = str.substring(j+1,str.length());
//						System.out.println("back = " + back);
                        str = front + back;
//						System.out.println(str);
//						System.out.println("===========");
                    } else {
                        prev = str.charAt(j);
                    }
                }

                if(!change) {
                    break;
                }
            }
            System.out.print("#"+i+" "+str);
            System.out.println();
        }
    }

}

