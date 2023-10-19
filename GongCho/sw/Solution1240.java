package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Solution1240 {

    static int n,k;
    static List<Integer> a;
    //static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i=1; i<=10; i++) {
            n = Integer.parseInt(br.readLine());
            a = new ArrayList<Integer>();
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<n; j++) {
                a.add(Integer.parseInt(st.nextToken()));
            }
            k = Integer.parseInt(br.readLine());
            String[] str = br.readLine().split("I");

            for(int k=1; k<str.length; k++) {
                String[] stk = str[k].split(" ");

                int idx = Integer.parseInt(stk[1]);
                int count = Integer.parseInt(stk[2]);
                for(int l=3; l<3+count; l++) {
                    int num = Integer.parseInt(stk[l]);
//					System.out.println(num);
                    a.add(idx++, num);
                }

//				for(int m=0; m<a.size(); m++) {
//					//sb.append(a.get(k) + " ");
//					System.out.print(a.get(m) + " ");
//				}
//				System.out.println();
            }

            //sb.append("#"+i+" ");
            System.out.print("#"+i+" ");
            for(int k=0; k<10; k++) {
                //sb.append(a.get(k) + " ");
                System.out.print(a.get(k) + " ");
            }
            System.out.println();
            //sb.append('\n');
        }
        //System.out.println(sb);


    }

}

