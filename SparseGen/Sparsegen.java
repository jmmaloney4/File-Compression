package SparseGen;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class Sparsegen {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File out = new File(args[0]);
		Writer w = new BufferedWriter(new FileWriter(out));
		for (int a = 0; a < 100000; a++) {
			String d = "";
			Random r = new Random();
			int s = r.nextInt(300);
			
			for (int f = 0; f < s; f++) {
				d = d + "0";
			}
			
			int v = r.nextInt(256);
			char c = (char)v;
			
			d = d + c;
			
			w.write(d);
			
		}
		w.close();
		
	}

}
