package rensyu8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prog8_1 {
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String str = new String(br.readLine());
				char[] c = str.toCharArray();
				System.out.println(str);
				int n = str.length();
			char a = c[0];
			char b = c[n-1];
			for (int i=1; i<n/2; i++) {
				System.out.print(c[i]);
			}
			System.out.print(c[0]);
			if(n % 2 == 1) {
				System.out.print(c[n/2]);
			}
			System.out.print(c[n-1]);
			for(int j=(n+1)/2; j<n-1; j++) {
				System.out.print(c[j]);
			}
		}
}