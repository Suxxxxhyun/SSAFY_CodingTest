package saffy.Rugusee.java.recursive;

public class Main_60 {
    static int n;
    static int[] ch; //부분 배열로 사용했나 안했나
    public void DFS(int L) {
        //ch 배열에서 값이 1인 인덱스만 출력
        //1을 부분 집합으로 사용하는 경우 -> 1 2 3, 1 2, 1 3, 1
        //L==D1, ch[1]=1 -> L==D2, ch[2]=1 -> L==D3, ch[3]=1 -> L==D4: 1,2,3 출력 후 ch[3]=1의 경우 pop
        //-> L==D3, ch[3]=0 -> L==D4: 1,2 출력 후 ch[3]=0의 경우 pop -> L==D3, ch[3]=0의 경우 pop
        //-> L==D2, ch[2]=0 -> L==D3, ch[3]=1 -> L==D4: 1,3 출력 후 ch[3]=1의 경우 pop
        //-> L==D4: 1 출력 후 ch[3]=0의 경우 pop
        //1을 부분 집합으로 사용하지 않는 경우 -> 2 3, 2, 3
        if(L==n+1) {
            String tmp = "";
            for(int i=1; i<=n; i++){
                if(ch[i]==1) tmp += (i+ " ");
            }
            //공집합 출력 안함
            if(tmp.length()>0) System.out.println(tmp);
        }
        else {
            //두 갈래로 뻗음
            ch[L] = 1; //사용 o
            DFS(L+1); //왼쪽, 사용 o
            ch[L] = 0; //사용 x
            DFS(L+1); //오른쪽, 사용 x
        }
    }

    public static void main(String[] args) {
        Main_60 main = new Main_60();
        n=3;
        ch = new int[n+1];
        main.DFS(1);
    }
}
