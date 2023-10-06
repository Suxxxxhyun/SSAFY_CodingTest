package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Solution1983 {

    static int t, n, k;
    static StringBuilder sb = new StringBuilder();
    static class Student implements Comparable<Student>{
        int mid, fin, prac, sum, th;
        String gra;

        public Student(int mid, int fin, int prac, int sum, int th) {
            this.mid = mid;
            this.fin = fin;
            this.prac = prac;
            this.sum = sum;
            this.th = th;

        }

        public int compareTo(Student other) {
            return other.sum - this.sum;
        }
    }
    static Student[] s;
    static String[] hakjum = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        for(int i=1; i<=t; i++) {
            sb.append("#" + i + " ");
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            n = Integer.parseInt(st.nextToken());
            k = Integer.parseInt(st.nextToken());
            s = new Student[n + 1];
            //학점은 중복이 절대로 되지 않음.
            s[0] = new Student(0,0,0,0,0);
            for(int j=1; j<=n; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                int c = Integer.parseInt(st.nextToken());
                int sum = a * 35 + b * 45 + c * 20;
                s[j] = new Student(a, b, c, sum, j);
            }
            Arrays.sort(s, 1, n+1);
////			for(int m=1; m<=n; m++) {
////				System.out.println(s[m].sum + " " + s[m].th + "번째 학생");
////			}
//			System.out.println();
            int per = n / 10;
            int next  = 0, v = 1;
            while(next < 10) {
                while(per-- > 0) {
                    s[v++].gra = hakjum[next];
                }
                next += 1;
                per = n / 10;
            }

            Arrays.sort(s, 1, n+1, new Comparator<Student>() {
                public int compare(Student s1, Student s2) {
                    return s1.th - s2.th;
                }
            });

//			for(int m=1; m<=n; m++) {
//				System.out.println(s[m].sum + " " + s[m].th + "번째 학생" + ", 학점은 " + s[m].gra);
//			}

            for(int l=1; l<=n; l++) {
                if(s[l].th == k) {
                    sb.append(s[l].gra).append('\n');
                }
            }
        }
        System.out.println(sb);
    }

}

