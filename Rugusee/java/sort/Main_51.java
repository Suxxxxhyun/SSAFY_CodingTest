package saffy.Rugusee.java.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        //내림차 순으로 하고 싶으면 object에서 this를 빼야 됨 -> 음수가 되야함
        //오름차 순이 되려면 음수 값을 리턴 시켜야 됨 -> this에서 object를 빼야 됨
        //x 값이 같으면 y값을 비교, 같지 않으면 x를 비교
//        if(this.x == o.x) return this.y-o.y; //오름차 순
//        else return this.x-o.x;

        if(this.x == o.x) return o.y-this.y; //내림차 순
        else return o.x-this.x;
    }
}


public class Main_51 {

    public static void main(String[] args) {
        Main_51 main = new Main_51();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y));
        }
        //comparable 정렬 기준에 의해 정렬시켜줌
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " " + o.y);
    }
}
