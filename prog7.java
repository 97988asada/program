/*
package rensyu7;

public class prog7 {

	public static void main(String[] args) {
		String str = "in-str";
		str = str.replaceAll("in","out");
		System.out.println(str);
	}

}*/ //int-str→out-strに変換
package rensyu7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prog7{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str;
		String str1 = br.readLine();
		for(int i=0; i<=100; i++) {
			i /= 2;
			System.out.println(str1[i]);
		}
	}
}
