package saffy.Rugusee.java.recursive;

public class Main_56 {
    public void DFS(int n) {
        //1011(2) = 11(10)
        if(n==0) return;
        else {
            //1(1)<-2(0)<-5(1)<-11(1)
            DFS(n/2); //2로 나눈 몫들
            //1(1)->2(0)->5(1)->11(1)
            System.out.print(n%2);
        }
    }

    public static void main(String[] args) {
        Main_56 main = new Main_56();
        main.DFS(11);
    }
}
