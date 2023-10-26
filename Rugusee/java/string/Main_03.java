package saffy.Rugusee.java.string;


import java.util.Scanner;

public class Main_03 {

    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos; //가장 작은 값으로 초기화

        //1
//        String[] s = str.split(" "); // 띄어쓰기를 기준으로 단어들이 배열에 저장
//        for(String x : s) {
//            int len = x.length(); //각각의 단어의 길이를 저장
//            //최대값 찾는 문장
//            if(len>m){ //더 긴 단어가 발견되면
//                m=len; //최대값 갱신
//                answer=x; //단어 교체
//            }
//        }

        //2
        while ((pos=str.indexOf(' ')) != -1) { //띄어쓰기를 위치를 발견하면 리턴 못하면 -1 리턴
            String tmp = str.substring(0, pos); //0부터 띄어쓰기 위치전 까지 자르기
            int len = tmp.length();
            if(len>m){ //더 긴 단어가 발견되면
                m=len; //최대값 갱신
                answer=tmp; //단어 교체
            }
            str=str.substring(pos+1); //마지막 단어전(공백이 뒤에있음)
        }
        if(str.length()>m) answer=str; //마지막 단어(이전단어보다 크면 값을 갱신)
        return answer;
    }

    public static void main(String[] args) {
        Main_03 main = new Main_03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(main.solution(str));
    }
}
