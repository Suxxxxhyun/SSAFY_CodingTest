package saffy.Rugusee.java.recursive;

import java.util.Scanner;

public class Main_57 {
    public int DFS (int n) {
        if(n==1) return 1;
        else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        Main_57 main = new Main_57();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //5*D(4)<-4*D(3)<-3*D(2)<-2*D(1)<-1, 5*4*3*2*1
        System.out.println(main.DFS(n));
    }
}
