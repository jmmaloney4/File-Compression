package huffmantrees;

import java.util.Random;

public class Rand2 {
	static char[] Characters = {'a',4,'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',5,'s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X'};
	static Random r = new Random();
	static byte[] b = new byte[2];
	/**
	 * This File Generates A File With A Uniform Distribution
 	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int o = 0;

		int a = 1000; //Change the size of this to change the frequency of each character
		for (int z = 0; z < 50; z++) {
			for (int y = 0; y < a; y++) {
				System.out.print(Characters[z]);
			}
		}



	}

}
