package saffy.bj;

import java.io.*;
import java.util.StringTokenizer;

/**
 * packageName    : saffy.bj
 * fileName       : Main2920
 * author         : qkrtn_ulqpbq2
 * date           : 2023-09-25
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023-09-25        qkrtn_ulqpbq2       최초 생성
 */
public class Main2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[8];
        StringTokenizer str = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<8; i++){
            arr[i] = Integer.parseInt(str.nextToken());
        }
        boolean asc = true;
        boolean dsc = true;
        for(int i=0; i<7; i++){
            if(arr[i+1] > arr[i]){
                dsc = false;
            }
            if(arr[i+1] < arr[i]){
                asc = false;
            }
        }
        if(asc){
            System.out.println("ascending");
        } else if(dsc){
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
