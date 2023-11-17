package saffy.Rugusee.java.recursive;

class Node {
    int data;
    Node lt, rt;
    public Node (int val) {
        data = val;
        lt=rt=null;
    }
}


public class Main_59 {
    //이진트리 순회 - dfs(깊이우선탐색)
    //전위순회(부모-왼쪽-오른쪽) 출력: 1 2 4 5 3 6 7
    //중위순회(왼쪽-부모-오른쪽) 출력: 4 2 5 1 6 3 7
    //후위순회(왼쪽-오른쪽-부모) 출력: 4 5 2 6 7 3 1
    Node root; //노드라는 클래스의 객체 주소를 저장하는 변수
    public void DFS(Node root) {
        if(root==null) return; //말단노드(최하위 노드)
        else {
            //전위 순회(부왼오)
            //System.out.print(root.data + " "); //부모
            //root: D(100)
            DFS(root.lt); //D(200) -> lt:D(400) - rt:D(500)
            //중위 순회(왼부오)
            //D(100) -> D(200) -> lt:D(400) -> lt:null -> 4 출력 -> rt:null ->
            //D(200) -> lt:D(200) -> lt:null -> 2 출력 -> rt:null ->
            //D(500) -> lt:null -> 5 출력 -> rt:null -> D(200) ->
            //D(100) -> lt:D(100) -> rt:D(100) -> 1출력
            System.out.print(root.data + " "); //부모
            DFS(root.rt); //D(300) -> lt:D(600) - rt:D(700)
            //System.out.print(root.data + " " ); //부모, 후위 순회(왼오부)

        }

    }

    public static void main(String[] args) {
        Main_59 tree = new Main_59();
        tree.root = new Node(1); //root:100
        tree.root.lt = new Node(2); //100(lt): 200
        tree.root.rt = new Node(3); //100(rt): 300
        tree.root.lt.lt = new Node(4); //200(lt): 400
        tree.root.lt.rt = new Node(5); //200(rt): 500
        tree.root.rt.lt = new Node(6); //500(lt)
        tree.root.rt.rt = new Node(7); //500(rt)
        tree.DFS(tree.root);

    }


}
