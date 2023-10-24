package saffy.GongCho.sw;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//어제 답지가 linkedlist로 풀었는데, linkedlist로 되는거 확인후,
//arraylist로도 접근해볼것! -> 둘다 되네!
public class Solution1230 {

    static int n, k;

    public static void main(String[] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10; i++) {
            n = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            for(int j=0; j<n; j++) {
                list.add(sc.nextInt());
            }
            k = sc.nextInt();
            for(int j=0; j<k; j++) {
                String s = sc.next();
                if(s.equals("I")) {
                    int start = sc.nextInt();
                    int idx = sc.nextInt();
                    for(int r=start; r<start+idx; r++) {
                        list.add(r, sc.nextInt());
                    }
                } else if(s.equals("A")) {
                    int repeat = sc.nextInt();
                    for(int r=0; r<repeat; r++) {
                        list.add(sc.nextInt());
                    }
                } else if(s.equals("D")){
                    int start = sc.nextInt();
                    int idx = sc.nextInt();
                    for(int r=start; r<start+idx; r++) {
                        list.remove(r);
                    }
                }
            }

            sb.append("#" + i + " ");
            for(int j=0; j<10; j++) {
                sb.append(list.get(j) + " ");
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

}

