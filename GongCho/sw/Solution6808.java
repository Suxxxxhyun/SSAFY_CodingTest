package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

//중복을 허용하지 않는 순서를 고려해서 나열하는 문제이니, visited를 사용해야할듯?
//완탐 nm유형 2번째 인것같은데 이따 확인하기! -> 맞음!
public class Solution6808 {

    static int t, win, lose;
    static int[] a, b, selected;
    static boolean[] visited;

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            String[] str = br.readLine().split(" ");
            Set<Integer> a_nums = new HashSet<Integer>();

            a = new int[9];
            b = new int[9];
            selected = new int[9];
            visited = new boolean[9];
            win = 0;
            lose = 0;
            for(int j=0; j<str.length; j++) {
                a[j] = Integer.parseInt(str[j]);
                a_nums.add(a[j]);
            }

            int idx = 0;
            for(int j=1; j<=18; j++) {
                if(a_nums.contains(j)) {
                    continue;
                }
                b[idx++] = j;
            }

            pro(0);
            System.out.println("#" + i + " " + win + " " + lose);
        }
    }

    static void pro(int idx) {
        if(idx == 9) {
            confirm();
            return;
        }
        for(int i=0; i<9; i++) {
            if(!visited[i]) {
                selected[idx] = b[i];
                visited[i] = true;
                pro(idx + 1);
                visited[i] = false;
            }
        }
    }

    static void confirm() {
        int a_grade = 0, b_grade = 0;
        for(int i=0; i<9; i++) {
            if(a[i] > selected[i]) {
                a_grade += a[i] + selected[i];
            } else if(a[i] < selected[i]) {
                b_grade += a[i] + selected[i];
            }
        }

        if(a_grade > b_grade) {
            win++;
        } else if(a_grade < b_grade) {
            lose++;
        }
    }

}

