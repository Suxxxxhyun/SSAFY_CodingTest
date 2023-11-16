package saffy.Rugusee.java.recursive;

class Nodee {
    int data;
    Nodee lt, rt;
    public Nodee(int val) {
        data = val;
        lt=rt=null;
    }
}


public class Main_63 {
    //경로의 길이: 루트 노드에서 말단 노드까지 가는데 이동하는 횟수
    //자식이 이진트리로 둘다 있거나 없을 때 DFS 사용
    Nodee root;
    public int DFS(int L, Nodee root) {
        //루트가 말단노드인지 확인해야함: 왼쪽과 오른쪽 자식 둘다 자식이 없어야 됨
        //L: 루트 노드에서 해당 노드까지 가는 거리
        if(root.lt==null && root.rt==null) return L;
        //말단 노드가 아니라면 짧은 경로를 가진 자식노드로 뻗어나가야 됨
        //중간노드인 2번 노드 말고 말단노드인 3번 노드의 차수인 '1' 출력
        else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));

    }

    public static void main(String[] args) {
        Main_63 tree = new Main_63();
        tree.root = new Nodee(1);
        tree.root.lt = new Nodee(2);
        tree.root.rt = new Nodee(3);
        tree.root.lt.lt = new Nodee(4);
        tree.root.lt.rt = new Nodee(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
