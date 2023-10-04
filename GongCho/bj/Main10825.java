package saffy.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main10825
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main10825 {

    static int n;
    static List<Student> list = new ArrayList<Student>();
    static class Student implements Comparable<Student>{

        String name;
        int kor, math, eng;

        public Student(String name, int kor, int math, int eng){
            this.name = name;
            this.kor = kor;
            this.math = math;
            this.eng = eng;
        }
        public int compareTo(Student other){
            if(this.kor == other.kor){
                if(this.eng == other.eng){
                    if(this.math == other.math){
                        return name.compareTo(other.name);
                    }
                    return other.math - this.math;
                }
                return this.eng - other.eng;
            }
            return other.kor - this.kor;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String name = st.nextToken();
            int kor = Integer.parseInt(st.nextToken());
            int eng = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());
            list.add(new Student(name, kor, math, eng));
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++){
            sb.append(list.get(i).name).append('\n');
        }
        System.out.println(sb);
    }
}
