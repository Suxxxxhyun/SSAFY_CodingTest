package saffy.Rugusee.java.recursive;

import java.util.LinkedList;
import java.util.Queue;

class Nodes {
    int data;
    Nodes lt, rt;

    public Nodes (int val) {
        data = val;
        lt = rt = null;
    }
}

public class Main_61 {
    //bfs(너비우선탐색) - root에서 최단 거리 탐색할 때 사용
    //1 2 3 4 5 6 7
    //순서대로 방문 후 출력
    //1
    //2 3
    //4 5 6 7

    Nodes root; //노드라는 클래스의 객체 주소를 저장하는 변수

    public void BFS(Nodes root) {
        Queue<Nodes> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        //비어있지 않으면 거짓, 비어있으면 참
        while (!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            //len: 원소의 갯수
            //L마다 반복: 0 -> 1 -> 2 -> empty
            for(int i=0; i<len; i++) {
                Nodes cur = Q.poll();
                //100번지의 데이터, L0일 때 root인 '1'
                System.out.print(cur.data + " ");
                //root node에 왼쪽 노드와 오른쪽 노드를 넣어야됨
                //왼쪽 자식, 한 번만에 가는 노드인 L1일 때 2, 두 번만에 가는 노드인 L2일 때 4, 5
                if(cur.lt != null) Q.offer(cur.lt);
                //오른쪽 자식, L1일 때 3, L2일 때 6, 7
                if(cur.rt != null) Q.offer(cur.rt);

            }
            L++; //level을 1 증가
            System.out.println();

        }

        if (root == null) return; //말단노드(최하위 노드)


    }

    public static void main(String[] args) {
        Main_61 tree = new Main_61();
        tree.root = new Nodes(1); //root:100
        tree.root.lt = new Nodes(2); //100(lt): 200
        tree.root.rt = new Nodes(3); //100(rt): 300
        tree.root.lt.lt = new Nodes(4); //200(lt): 400
        tree.root.lt.rt = new Nodes(5); //200(rt): 500
        tree.root.rt.lt = new Nodes(6); //500(lt)
        tree.root.rt.rt = new Nodes(7); //500(rt)
        tree.BFS(tree.root);

    }
}
