package saffy.Rugusee.bj;

import java.io.*;


public class bj_1316 {
    //그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우
    //나타났던 단어가 다른 단어가 생긴 뒤에 나타 날 수 없다
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int cnt=0;

        for (int i=0; i<n; i++){
            if(check()) cnt++;
        }

        System.out.println(cnt);
    }

    //그룹 단어를 체크할 함수: 문자열이 그룹 단어인지 아닌지 판단
    public static boolean check() throws IOException{

        boolean[] check = new boolean[26]; //단어를 체크 할 알파벳 갯수
        //반복문에서 문자를 꺼내올 때 앞선 문자와 연속되는지, 아닌지를 판별
        //prev 의 문자와 해당 문자가 같다면? 해당 문자가 중복된 문자인지 여부를 검사하지 않는다. (boolean 배열)
        //prev 의 문자와 해당 문자가 다르다면? 해당 문자가 중복된 문자인지 여부를 검사한다. (boolean 배열)
        int prev = 0;
        String str = br.readLine();

        for (int i=0; i<str.length(); i++){
            //반복문 안에 charAt( ) 을 통해 문자열의 문자들을
            //하나씩 꺼내와서 해당 단어가 prev 의 값과 같은지 판별
            //i 번째 문자 저장 (현재 문자)
            int now = str.charAt(i);

            //이전의 문자와 현재 문자가 다른 경우에 check 배열에서 해당 문자가 중복되는지를 살펴보는 것
            //앞선 문자와 i 번째 문자가 같지 않다면?
            if(prev != now) {

                //현재 문자 아스키 숫자와 소문자 'a'의 아스키 숫자의 차이를 이용해
                //check 배열에 저장여부를 차례대로 저장한다
                //이미 등장한 단어면 true, 처음 등장했으면 false
                //따라서 !check[now-'a'] 경우가
                //해당 문자가 처음 나오는 경우이다 (false 인 경우)
                if(!check[now-'a']){
                    check[now-'a'] = true; // true 로 바꿔준다, 확인처리
                    prev = now; //다음 턴을 위해 prev 도 바꿔준다, 마지막 문자를 현재 문자로 갱신
                }
                // 해당 문자가 이미 나온 적이 있는 경우 (그룹단어가 아니게 됨)
                else {
                    return false;
                }


            }
            // 앞선 문자와 i 번째 문자가 같다면? (연속된 문자)
            else {
                continue;
            }

        }
        return true;
    }

}
