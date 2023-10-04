package saffy.GongCho.bj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * packageName    : saffy.bj
 * fileName       : Main1081402
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-27        qkrtn_ulqpbq2       최초 생성
 */
public class Main1081402 {

    static class Person{
        int age;
        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Person[] p = new Person[n];
        for(int i=0; i<n; i++){
            String[] st = br.readLine().split(" ");
            p[i] = new Person(Integer.parseInt(st[0]), st[1]);
        }

        Arrays.sort(p, new Comparator<Person>(){
           public int compare(Person p1, Person p2){
               return p1.age - p2.age;
           }
        });

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(p[i].age + " " + p[i].name).append('\n');
        }
        System.out.println(sb);
    }
}
