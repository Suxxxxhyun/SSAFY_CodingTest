package saffy.GongCho.sw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution5215 {
	
	static class Hamburger{
		int grade, calorie;
		
		public Hamburger(int grade, int calorie) {
			this.grade = grade;
			this.calorie = calorie;
		}
	}
	
	static int t, n, l, max = 0;
	static Hamburger[] h;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		t = Integer.parseInt(br.readLine());
		for(int i=1; i<=t; i++) {
			String[] str = br.readLine().split(" ");
			n = Integer.parseInt(str[0]);
			l = Integer.parseInt(str[1]);
			h = new Hamburger[n];
			for(int j=0; j<n; j++) {
				str = br.readLine().split(" ");
				int grade = Integer.parseInt(str[0]);
				int cal = Integer.parseInt(str[1]);
				h[j] = new Hamburger(grade, cal);
			}
			pro(0,0,0);
			sb.append("#" + i + " " + max).append('\n');
			max = 0;
		} 
		System.out.println(sb);
	}
	
	static void pro(int idx, int grade_sum, int cal_sum) {
		if(idx == n) {
			max = Math.max(grade_sum, max);
			return;
		}
		
		
		if(cal_sum + h[idx].calorie <= l) {
			pro(idx + 1, grade_sum + h[idx].grade, cal_sum + h[idx].calorie);
			pro(idx + 1, grade_sum, cal_sum);
		} else {
			pro(idx + 1, grade_sum, cal_sum);
		}
	}
}
