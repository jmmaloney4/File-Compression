package huffmantrees;

import java.util.Random;

public class Rand {
	static int[] BellShapedCurve = new int[50];
	static char[] Characters = new char[50];
	static Random r = new Random();
	static byte[] b = new byte[2];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 0;
		while (o < 50) {
			Characters[o] = (char)(r.nextInt(100));
			o++;
		}
		int c = 0;
		for (int x = 0; x < 25; x++) {
			System.out.println(c);
			Rand.BellShapedCurve[x] = c;
			c++;
		}
		for (int x = 25; x < 50; x++) {
			System.out.println(c);
			Rand.BellShapedCurve[x] = c;
			c = c - 1;
		}

		int a = 1000;
		int q;
		for (int z = 0; z < 50; z++) {
			q = a * Rand.BellShapedCurve[z];
			for (int y = 0; y < a; y++) {
				System.out.println(Characters[z]);
			}
		}



	}

}
