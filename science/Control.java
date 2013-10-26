package science;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Control {

	private static long time;
	private static long startT;
	private static long endT;
	private static File file = Science.InFile;
	private static File out = Science.OutFile;
	private static BufferedReader read;
	private static BufferedWriter write;

	public static long Run() throws IOException {
		int c = 0;
		read = new BufferedReader(new FileReader(file));
		write = new BufferedWriter(new FileWriter(out));
		startT = System.currentTimeMillis();
		while(read.read() != -1) {
			int e = read.read();
			c++;
			write.write(e);
		}


		endT = System.currentTimeMillis();
		time = (endT - startT);
		return time;

	}

}
