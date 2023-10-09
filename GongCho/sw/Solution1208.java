package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Solution1208 {


    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            int count = Integer.parseInt(br.readLine());
            int[] a = new int[100];
//			int max = 0, min = 101, max_idx = 101, min_idx = 101;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int j=0; j<100; j++) {
                int height = Integer.parseInt(st.nextToken());
                a[j] = height;
//				map.put(height, j);
            }


            Arrays.sort(a);
//			max = a[a.length - 1];
//			max_idx = a.length - 1;
//			min = a[0];
//			min_idx = 0;

            while(count-- > 0) {
                //가장 높이가 큰 값을 -1, 가장 높이가 작은 값을 +1
//				max -= 1;
//				min += 1;
                a[0] += 1;
                a[a.length - 1] -= 1;
                Arrays.sort(a);
            }
            System.out.println("#" + i + " " + (a[a.length - 1] - a[0]));
        }
    }

}

