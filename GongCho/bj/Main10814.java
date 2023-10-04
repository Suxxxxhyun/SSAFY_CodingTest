package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main10814
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main10814 {

    static int n;
    static List<Person> list = new ArrayList<Person>();

    static class Person implements Comparable<Person>{

        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
        public int compareTo(Person other){
            return this.age - other.age;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            list.add(new Person(Integer.parseInt(st.nextToken()),st.nextToken()));
        }
        Collections.sort(list);

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(list.get(i).age + " " + list.get(i).name).append('\n');
        }
        System.out.println(sb);
    }
}
