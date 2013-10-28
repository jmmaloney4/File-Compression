package huffmantrees;

import java.util.Random;

public class Rand {
	static double[] BellShapedCurve = new double[50];
	static char[] Characters = {'a',4,'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',5,'s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
	static Random r = new Random();
	static byte[] b = new byte[2];
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double c = 0;
		for (int x = 0; x < 25; x++) {
			c = Rand.BellCurve(x);
			Rand.BellShapedCurve[x] = c;
			System.out.println(c);
		}
		for (int x = 25; x < 50; x++) {
			c = Rand.BellCurve(x);
			Rand.BellShapedCurve[x] = c;
			System.out.println(c);
		}

		int a = 1000; //Change the size of this to change the frequency of each character, relative to the probability distribution
		for (int z = 0; z < 50; z++) {
			for (int y = 0; y < (a * BellShapedCurve[z]); y++) {
				System.out.print(Characters[z]);
			}
		}



	}
	/**
	 * Generates points on a bell shaped curve distribution
	 * @param x
	 * @return
	 */
	public static double BellCurve(int x) {
		double r = ((1 / (8 * (Math.sqrt((double) (2) * Math.PI)))) * (Math.pow(Math.E, ((Math.pow(x - 25, 2)) / (Math.pow(2 * 8, 2))))));
		r = r * 100;
		return r;
		
	}
	
}
