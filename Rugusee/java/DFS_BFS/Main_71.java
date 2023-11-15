package saffy.Rugusee.java.DFS_BFS;

import saffy.GongCho.tct.DFS;

import java.util.Scanner;

public class Main_71 {
    static int[] pm;
    static int n, m;
    public void DFS(int L) {
        if(L==m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for(int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main_71 main = new Main_71();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];

        main.DFS(0);
    }
}
