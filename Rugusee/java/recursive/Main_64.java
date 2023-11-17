package saffy.Rugusee.java.recursive;

import java.util.LinkedList;
import java.util.Queue;

class Nodeee {
    int data;
    Nodeee lt, rt;
    public Nodeee(int val) {
        data = val;
        lt=rt=null;
    }
}


public class Main_64 {
    //경로의 길이: 루트 노드에서 말단 노드까지 가는데 이동하는 횟수
    //자식이 이진트리로 둘다 있거나 없을 때 DFS 사용
    Nodeee root;
    public int BFS(Nodeee root) {
        Queue<Nodeee> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()) {
            int len = Q.size();

            for(int i=0; i<len; i++) {
                Nodeee cur = Q.poll();
                //최초로 발견된 말단 노드
                if(cur.lt==null && cur.rt==null) return L;
                if(cur.lt!=null) Q.offer(cur.lt);
                if(cur.rt!=null) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }

    public static void main(String[] args) {
        Main_64 tree = new Main_64();
        tree.root = new Nodeee(1);
        tree.root.lt = new Nodeee(2);
        tree.root.rt = new Nodeee(3);
        tree.root.lt.lt = new Nodeee(4);
        tree.root.lt.rt = new Nodeee(5);
        System.out.println(tree.BFS(tree.root));
    }
}
