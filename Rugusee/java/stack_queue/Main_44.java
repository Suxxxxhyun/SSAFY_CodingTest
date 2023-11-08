package saffy.Rugusee.java.stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id; //번호
        this.priority = priority; //위험도
    }
}


public class Main_44 {
    public int solution (int n, int m, int[] arr) {
        int answer = 0;
        //(0, 60), (1, 50), (2, 70), (3, 80), (4, 90)
        // 마지막 한개가 남을 때까지 offer 한 후 마지막 위험도의 번호가 m번째인지 비교
        // m번째와 다르면 poll
        Queue<Person> Q = new LinkedList<>();
        for (int i=0; i<n; i++) Q.offer(new Person(i, arr[i]));

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            //tmp가 진료를 받을 수 있는지 여부
            //Q에 있는 대기목록 모두 확인
            for(Person x : Q) {
                //진료 받으면 안되는 경우
                //자기보다 위험도가 높은 환자가 대기 목록에 존재할 때
                //꺼낸 위험도가 찾아야 될 위험도보다 작을 때
                if(x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            //자기보다 위험도가 높은 환자가 대기 목록에 존재하지 않을 때
            if(tmp != null) {
                answer++;
                if(tmp.id == m) return answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main_44 main = new Main_44();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.println(main.solution(n, m, arr));
    }
}
