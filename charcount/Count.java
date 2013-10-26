package charcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Count {
	static BufferedReader Read;
	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Read = new BufferedReader(new FileReader(new File(args[0])));
		int a = 0;
		while (Read.ready()) {
			Read.read();
			a++;
		}
		System.out.println(a);
	}

}
