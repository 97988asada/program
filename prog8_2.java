package rensyu8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class prog8_2 {

	public static double main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = new String(br.readLine());
			double N = Integer.parseInt(s);
			double P = Integer.parseInt(s);
			double Q = Integer.parseInt(s);
			double Z = Double.valueOf(s);

			static double Getdistance(double x1, double y1, double x2, double y2) {
				double d = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
				return d;
			}

			System.out.println(N);
			System.out.println(P);
			System.out.println(Q);
			System.out.println(Z);
	}

}
